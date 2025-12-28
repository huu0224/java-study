import java.util.*;

public class StringandAlphabetandQuery {
    // 인덱스별 소속 그룹 번호 (1번 문자 ~ N번 문자)
    private int[] parent;
    // 그룹 ID별 포함된 문자 인덱스 집합 (TreeSet으로 번호순 정렬 유지)
    private Map<Integer, TreeSet<Integer>> groupMap = new HashMap<>();
    // 그룹 ID별 생성 순서 (작을수록 먼저 생성된 그룹)
    private Map<Integer, Integer> creationOrder = new HashMap<>();
    private String originalS;
    private int nextGroupId = 1;

    public String[] solution(String s, String[] query) {
        // 멤버 변수 초기화 (여러 번 실행 시 데이터 섞임 방지)
        groupMap = new HashMap<>();
        creationOrder = new HashMap<>();
        originalS = s;
        nextGroupId = 1;
        
        int n = s.length();
        parent = new int[n + 1];
        List<String> resultList = new ArrayList<>();

        // 1. 초기 상태 설정 (0번 그룹에 모든 문자 할당)
        TreeSet<Integer> initialGroup = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            parent[i] = 0;
            initialGroup.add(i);
        }
        groupMap.put(0, initialGroup);
        creationOrder.put(0, 0);

        // 2. 쿼리 처리
        for (String q : query) {
            String[] parts = q.split(" ");
            int type = Integer.parseInt(parts[0]);

            switch (type) {
                case 1:
                    int x1 = Integer.parseInt(parts[1]);
                    int y1 = Integer.parseInt(parts[2]);
                    resultList.add(parent[x1] == parent[y1] ? "YES" : "NO");
                    break;

                case 2:
                    int x2 = Integer.parseInt(parts[1]);
                    String word2 = parts[2];
                    processExtraction(parent[x2], word2, -1, -1);
                    break;

                case 3:
                    int x3 = Integer.parseInt(parts[1]);
                    int y3 = Integer.parseInt(parts[2]);
                    String word3 = parts[3];
                    processExtraction(-1, word3, x3, y3);
                    break;

                case 4:
                    int x4 = Integer.parseInt(parts[1]);
                    int y4 = Integer.parseInt(parts[2]);
                    mergeGroups(parent[x4], parent[y4]);
                    break;

                case 5:
                    addAlphabetCountToResult(resultList);
                    break;
            }
        }
        return resultList.toArray(new String[0]);
    }

    private void processExtraction(int targetGid, String word, int start, int end) {
        TreeSet<Integer> newGroupItems = new TreeSet<>();
        int[] needed = new int[26];
        for (char c : word.toCharArray()) needed[c - 'a']++;

        // 순회할 대상 그룹 선정
        List<Integer> scanList = (targetGid != -1) 
                                 ? Collections.singletonList(targetGid) 
                                 : new ArrayList<>(groupMap.keySet());

        for (int gid : scanList) {
            TreeSet<Integer> items = groupMap.get(gid);
            if (items == null) continue;

            Iterator<Integer> it = items.iterator();
            while (it.hasNext()) {
                int idx = it.next();
                if (start != -1 && (idx < start || idx > end)) continue;
                
                char c = originalS.charAt(idx - 1);
                if (needed[c - 'a'] > 0) {
                    newGroupItems.add(idx);
                    needed[c - 'a']--;
                    it.remove(); 
                }
            }
            
            // 제거 후 빈 그룹이면 삭제
            if (items.isEmpty()) {
                groupMap.remove(gid);
                creationOrder.remove(gid);
            }
        }

        if (!newGroupItems.isEmpty()) {
            int newId = nextGroupId++;
            for (int idx : newGroupItems) parent[idx] = newId;
            groupMap.put(newId, newGroupItems);
            creationOrder.put(newId, newId);
        }
    }

    private void mergeGroups(int gid1, int gid2) {
        if (gid1 == gid2) return;
        
        int early = (creationOrder.get(gid1) < creationOrder.get(gid2)) ? gid1 : gid2;
        int late = (early == gid1) ? gid2 : gid1;

        TreeSet<Integer> earlyItems = groupMap.get(early);
        TreeSet<Integer> lateItems = groupMap.get(late);

        for (int idx : lateItems) {
            parent[idx] = early;
            earlyItems.add(idx);
        }
        
        groupMap.remove(late);
        creationOrder.remove(late);
    }

    private void addAlphabetCountToResult(List<String> result) {
        List<Integer> sortedIds = new ArrayList<>(groupMap.keySet());
        sortedIds.sort(Comparator.comparingInt(id -> creationOrder.get(id)));

        for (int gid : sortedIds) {
            int[] counts = new int[26];
            for (int idx : groupMap.get(gid)) {
                counts[originalS.charAt(idx - 1) - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (counts[i] > 0) {
                    if (sb.length() > 0) sb.append(" ");
                    sb.append((char) ('a' + i)).append(" ").append(counts[i]);
                }
            }
            if (sb.length() > 0) result.add(sb.toString());
        }
    }

    // --- 이클립스 실행 및 디버깅을 위한 메인 메소드 ---
    public static void main(String[] args) {
        StringandAlphabetandQuery sol = new StringandAlphabetandQuery();

        // 테스트 케이스 1
        System.out.println("--- Test Case 1 ---");
        String s1 = "programmers";
        String[] q1 = {"1 1 5", "2 1 rm", "1 1 5", "5"};
        System.out.println(Arrays.toString(sol.solution(s1, q1)));

        // 테스트 케이스 2
        System.out.println("\n--- Test Case 2 ---");
        String s2 = "abacadae";
        String[] q2 = {"3 1 4 aa", "1 1 5", "4 1 7", "1 1 5", "5"};
        System.out.println(Arrays.toString(sol.solution(s2, q2)));
    }
}