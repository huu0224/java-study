import java.util.Scanner;

class Ex5_3_4_RightTriangles_UsingIntegratingMethodFor2D {
    public static void main(String[] args) {	
        // ===== 교재 예제 =====
        drawRightTriangle('*', 2);   // *로 밑변 2
        System.out.println();

        drawRightTriangle('$', 3);   // $로 밑변 3
        System.out.println();

        drawRightTriangle('@', 4);   // @로 밑변 4
        System.out.println();

        drawRightTriangle('가', 5);  // 가로 밑변 5
        System.out.println();

        // =================================================
        // 실습과제 1) 문자와 정수 입력받아 삼각형 출력
        // =================================================
        Scanner sc = new Scanner(System.in);

        System.out.print("\n o 문자 입력 > ");
        char ch = sc.next().charAt(0);

        System.out.print(" o 밑변 크기 입력 > ");
        int base = sc.nextInt();

        System.out.println("\n << 입력한 값으로 직각 삼각형 >>");
        drawRightTriangle(ch, base);

        // =================================================
        // 실습과제 2) 'a'부터 'z'까지, 밑변 4부터 1씩 증가
        // =================================================
        System.out.println("\n << 'a'부터 'z'까지 직각 삼각형 출력 >>");

        int size = 4;
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("\n [" + c + ", 밑변 " + size + "]");
            drawRightTriangle(c, size);
            size++;
        }

        sc.close();
    }

    // =================================================
    // 매개변수 2개 갖는 2차원 통합 메소드
    // =================================================
    static void drawRightTriangle(char c, int base) { 
        for (int cnt = 1; cnt <= base; cnt++)
            printCharsInLine(c, cnt);
    } 

    // =================================================
    // 문자 c를 cnt개 한 줄에 출력하는 통합 메소드
    // =================================================
    static void printCharsInLine(char c, int cnt) { 
        for (int i = 0; i < cnt; i++)
            System.out.print(c);
        System.out.println();
    } 	
}