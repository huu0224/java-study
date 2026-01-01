 import java.util.*;

class Solution {
    int[] parent;
    int[] size;

    // Union-Find: 루트 노드 찾기
    public int find(int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent[i]);
    }

    // Union-Find: 두 집합 합치기
    public void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        if (rootI != rootJ) {
            parent[rootI] = rootJ;
            size[rootJ] += size[rootI];
        }
    }

    public int solution(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        // 각 칸을 2개의 삼각형 노드로 분리 (총 2 * n * m 개)
        // 칸 (r, c)의 두 삼각형 인덱스: (r * m + c) * 2 와 (r * m + c) * 2 + 1
        int totalNodes = n * m * 2;
        parent = new int[totalNodes];
        size = new int[totalNodes];
        
        for (int i = 0; i < totalNodes; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int currentIdx = (r * m + c) * 2;
                
                // 1. 상하 연결 확인
                if (r < n - 1) {
                    // 현재 칸의 아래쪽 삼각형과 아래 칸의 위쪽 삼각형 연결
                    // grid[r][c]가 1(/)이면 아래쪽은 1번 영역, -1(\)이면 아래쪽은 1번 영역 (둘 다 1번이 아래를 포함하도록 설계 가능)
                    // 여기서는 편의상 0번을 '위 또는 왼쪽', 1번을 '아래 또는 오른쪽'으로 정의
                    int bottomOfCurrent = currentIdx + 1;
                    int topOfBelow = ((r + 1) * m + c) * 2;
                    union(bottomOfCurrent, topOfBelow);
                }

                // 2. 좌우 연결 확인
                if (c < m - 1) {
                    // 현재 칸의 오른쪽 삼각형과 오른쪽 칸의 왼쪽 삼각형 연결
                    int rightOfCurrent = currentIdx + 1;
                    int leftOfNext = (r * m + (c + 1)) * 2;
                    union(rightOfCurrent, leftOfNext);
                }
            }
        }

        // 각 컴포넌트(덩어리)는 이분 그래프 형태를 띱니다.
        // 문제에서 요구하는 '최대 덩어리'는 결국 연결된 그래프에서 
        // 한 칸당 하나씩 골랐을 때 나올 수 있는 최대 크기입니다.
        // 이 구조상 연결된 하나의 덩어리는 항상 한 칸에서 하나의 삼각형만 선택하며 확장 가능합니다.
        
        int answer = 0;
        for (int i = 0; i < totalNodes; i++) {
            if (parent[i] == i) {
                answer = Math.max(answer, size[i]);
            }
        }

        return answer;
    }
}