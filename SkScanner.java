import java.util.Scanner;

class SkScanner {

    private static Scanner scanner = new Scanner(System.in);

    // 문자열 입력
    public static String getString() {
        return scanner.nextLine();
    }

    // 정수 입력
    public static int getInt() {
        int value = scanner.nextInt();
        scanner.nextLine(); // 엔터 제거 (중요!)
        return value;
    }
}