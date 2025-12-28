import java.util.*;

public class MakingaSnowman {

    public long solution(String[] grid) {
        int n = grid.length;
        int m = grid[0].length();
        
        int[][] startPos = new int[2][2];
        int snowIdx = 0;
        int totalSnowCount = 0;
        
        // 1. 눈덩이 시작 위치와 전체 쌓인 눈의 개수 파악
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid[r].charAt(c) == 'o') {
                    startPos[snowIdx][0] = r;
                    startPos[snowIdx][1] = c;
                    snowIdx++;
                } else if (grid[r].charAt(c) == '.') {
                    totalSnowCount++;
                }
            }
        }

        // 2. 각 위치(r, c)에 도달했을 때 가질 수 있는 눈의 개수(size) 집합 구하기
        // setGrid[r][c] = 해당 위치에 도달할 때까지 획득 가능한 '눈의 개수'들
        Set<Integer>[][] set1 = getPossibleSizes(grid, startPos[0][0], startPos[0][1], n, m, totalSnowCount);
        Set<Integer>[][] set2 = getPossibleSizes(grid, startPos[1][0], startPos[1][1], n, m, totalSnowCount);

        // 3. 두 눈덩이가 만나는 지점 탐색 및 결과 조합 생성
        Set<String> snowmanTypes = new HashSet<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid[r].charAt(c) == '#') continue;
                
                // 두 눈덩이가 (r, c)에서 만날 수 있는 경우
                if (!set1[r][c].isEmpty() && !set2[r][c].isEmpty()) {
                    for (int s1 : set1[r][c]) {
                        for (int s2 : set2[r][c]) {
                            // 눈사람 크기 계산 (기본 크기 1 + 획득한 눈의 개수)
                            int size1 = s1 + 1;
                            int size2 = s2 + 1;
                            
                            // 전체 쌓인 눈의 개수를 넘을 수 없으므로 필터링 (경로 중복 방지 로직의 간소화)
                            if (s1 + s2 <= totalSnowCount) {
                                int body = Math.max(size1, size2);
                                int head = Math.min(size1, size2);
                                snowmanTypes.add(body + "," + head);
                            }
                        }
                    }
                }
            }
        }

        return snowmanTypes.size();
    }

    private Set<Integer>[][] getPossibleSizes(String[] grid, int startR, int startC, int n, int m, int maxSnow) {
        Set<Integer>[][] reachable = new HashSet[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) reachable[i][j] = new HashSet<>();
        }

        Queue<int[]> queue = new LinkedList<>();
        // {row, col, snowCount}
        queue.add(new int[]{startR, startC, 0});
        reachable[startR][startC].add(0);

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int s = curr[2];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr].charAt(nc) != '#') {
                    int nextS = s + (grid[nr].charAt(nc) == '.' ? 1 : 0);
                    
                    // 새로운 크기로 해당 칸에 도달한 경우만 추가 탐색
                    if (nextS <= maxSnow && !reachable[nr][nc].contains(nextS)) {
                        reachable[nr][nc].add(nextS);
                        queue.add(new int[]{nr, nc, nextS});
                    }
                }
            }
        }
        return reachable;
    }

    // 이클립스에서 실행 테스트를 위한 main 메서드
    public static void main(String[] args) {
        MakingaSnowman solver = new MakingaSnowman();
        String[] exampleGrid = {"#.##.", "#o###", ".o.#.", "#..#."};
        System.out.println("Result: " + solver.solution(exampleGrid)); // Expected: 12
    }
}