import java.util.Scanner;

class SkScanner {

    private static Scanner scanner = new Scanner(System.in);

    // 정수 입력
    public static int getInt() {
        return scanner.nextInt();
    }

    // 정수 입력 + 프롬프트
    public static int getIntWithPrompt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // 실수 입력
    public static double getDouble() {
        return scanner.nextDouble();
    }

    // 문자열 입력
    public static String getString() {
        scanner.nextLine(); // 버퍼 정리
        return scanner.nextLine();
    }

    // 문자열 입력 + 프롬프트
    public static String getString(String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // 버퍼 정리
        return scanner.nextLine();
    }
}