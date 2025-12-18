public class Pr4_3_6_PrintTriangle_UsingNestedFor {

	public static void main(String[] args) {

        System.out.println("\n  << '*'로 그린 밑변 5인 직각 삼각형 >>\n");

        for (int h = 1; h <= 5; h++) {      // 세로 줄 (1 ~ 5)
            System.out.print("  ");         // 왼쪽 여백 공백 2칸

            for (int w = 1; w <= h; w++) {  // 가로 별 개수
                System.out.print("*");
            }

            System.out.println();           // 줄바꿈
        }
    }
}