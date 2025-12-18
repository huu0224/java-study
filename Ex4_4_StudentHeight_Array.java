import java.util.Scanner;

class Ex4_4_StudentHeight_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* (1) 학생 4명 × 3년(1학년~3학년) 키 저장용 2차원 배열 선언 및 생성 */
        double[][] heights = new double[4][3];

        /* (2) 특정 원소에 값 저장 */
        heights[0][0] = 168.4;   // 첫 번째 학생 1학년 키
        heights[2][2] = 171.3;   // 세 번째 학생 3학년 키

        /* (3) 두 번째 학생 2학년 키 입력 후 출력 */
        System.out.print(" o 두 번째 학생 2학년 키 입력 > ");
        heights[1][1] = scanner.nextDouble();

        System.out.println(" * 두 번째 학생 2학년 키: " + heights[1][1] + "cm");
    }
}