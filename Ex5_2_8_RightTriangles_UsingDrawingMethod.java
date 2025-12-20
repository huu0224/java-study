public class Ex5_2_8_RightTriangles_UsingDrawingMethod {

	public static void main(String[] args) {
	       drawRightTriangle_BaseStar2(); 
	        drawRightTriangle_BaseStar3(); 
	        drawRightTriangle_BaseStar4(); 
	        drawRightTriangle_BaseStar5(); 
	        drawRightTriangle_BaseStar6(); 
	        drawRightTriangle_BaseStar7(); 
	        drawRightTriangle_BaseStar8(); 
	        drawRightTriangle_BaseStar9(); 
	        drawRightTriangle_BaseStar10(); 
	    }

	    // ===== 밑변 2 =====
	    static void drawRightTriangle_BaseStar2() { 
	        printStar1InLine(); 
	        printStar2InLine();  
	        System.out.println();
	    } 

	    // ===== 밑변 3 =====
	    static void drawRightTriangle_BaseStar3() { 
	        printStar1InLine(); 
	        printStar2InLine();  
	        printStar3InLine();  
	        System.out.println();
	    } 

	    // ===== 밑변 4 =====
	    static void drawRightTriangle_BaseStar4() { 
	        printStar1InLine(); 
	        printStar2InLine();  
	        printStar3InLine();  
	        printStar4InLine();  
	        System.out.println();
	    } 

	    // ===== 밑변 5 =====
	    static void drawRightTriangle_BaseStar5() { 
	        printStar1InLine(); 
	        printStar2InLine();  
	        printStar3InLine();  
	        printStar4InLine();  
	        printStar5InLine();  
	        System.out.println();
	    } 

	    // ===== 추가: 밑변 6 ~ 10 =====
	    static void drawRightTriangle_BaseStar6() { 
	        printStar1InLine(); printStar2InLine(); printStar3InLine();
	        printStar4InLine(); printStar5InLine(); printStar6InLine();
	        System.out.println();
	    }

	    static void drawRightTriangle_BaseStar7() { 
	        printStar1InLine(); printStar2InLine(); printStar3InLine();
	        printStar4InLine(); printStar5InLine(); printStar6InLine();
	        printStar7InLine();
	        System.out.println();
	    }

	    static void drawRightTriangle_BaseStar8() { 
	        printStar1InLine(); printStar2InLine(); printStar3InLine();
	        printStar4InLine(); printStar5InLine(); printStar6InLine();
	        printStar7InLine(); printStar8InLine();
	        System.out.println();
	    }

	    static void drawRightTriangle_BaseStar9() { 
	        printStar1InLine(); printStar2InLine(); printStar3InLine();
	        printStar4InLine(); printStar5InLine(); printStar6InLine();
	        printStar7InLine(); printStar8InLine(); printStar9InLine();
	        System.out.println();
	    }

	    static void drawRightTriangle_BaseStar10() { 
	        printStar1InLine(); printStar2InLine(); printStar3InLine();
	        printStar4InLine(); printStar5InLine(); printStar6InLine();
	        printStar7InLine(); printStar8InLine(); printStar9InLine();
	        printStar10InLine();
	        System.out.println();
	    }

	    // ===== 한 줄 출력 메소드 =====
	    static void printStar1InLine() {
	        for (int i = 0; i < 1; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar2InLine() {
	        for (int i = 0; i < 2; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar3InLine() {
	        for (int i = 0; i < 3; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar4InLine() {
	        for (int i = 0; i < 4; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar5InLine() {
	        for (int i = 0; i < 5; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar6InLine() {
	        for (int i = 0; i < 6; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar7InLine() {
	        for (int i = 0; i < 7; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar8InLine() {
	        for (int i = 0; i < 8; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar9InLine() {
	        for (int i = 0; i < 9; i++) System.out.print('*');
	        System.out.println();
	    }
	    static void printStar10InLine() {
	        for (int i = 0; i < 10; i++) System.out.print('*');
	        System.out.println();
	    }
	}