import java.util.Scanner;

class Pr4_4_StudentHeight_2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // (1) 2차원 배열 선언 및 생성
        // 4명 학생 × 3년(1학년~3학년)
        double[][] heights = new double[4][3];

        System.out.println("\n **** 중학생 4명의 3년간 키 입력 ****");

        // (2) 키 입력
        for (int i = 0; i < 4; i++) {
            System.out.println("\n * 학생 " + (i + 1) + "의 키 입력");

            for (int j = 0; j < 3; j++) {
                System.out.print("   - " + (j + 1) + "학년 키(cm) > ");
                heights[i][j] = scanner.nextDouble();
            }
        }

        // (3) 입력된 키 출력
        System.out.println("\n **** 입력된 키 데이터 ****");

        for (int i = 0; i < 4; i++) {
            System.out.print(" * 학생 " + (i + 1) + " : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(heights[i][j] + "cm ");
            }
            System.out.println();
        }

        // (4) 학생별 성장치 계산 및 출력
        System.out.println("\n **** 학생별 키 성장치 ****");

        double[] growth = new double[4];
        double maxGrowth = 0;
        double sumGrowth = 0;

        for (int i = 0; i < 4; i++) {
            growth[i] = heights[i][2] - heights[i][0]; // 3학년 - 1학년
            System.out.println(" * 학생 " + (i + 1) + " 성장치: " + growth[i] + "cm");

            sumGrowth += growth[i];
            if (growth[i] > maxGrowth) {
                maxGrowth = growth[i];
            }
        }

        // (5) 성장치 최대값과 평균값 출력
        double avgGrowth = sumGrowth / 4;

        System.out.println("\n **** 키 성장치 통계 ****");
        System.out.println(" * 최대 성장치: " + maxGrowth + "cm");
        System.out.println(" * 평균 성장치: " + avgGrowth + "cm");
    }
}