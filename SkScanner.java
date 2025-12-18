import java.util.Scanner;

class SkScanner {

    private static Scanner scanner = new Scanner(System.in);

    // 정수 입력
    public static int getInt() {
        return scanner.nextInt();
    }

    // 프롬프트 + 정수 입력
    public static int getIntWithPrompt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // 실수 입력
    public static double getDouble() {
        return scanner.nextDouble();
    }

    // 프롬프트 + 실수 입력
    public static double getDoubleWithPrompt(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // 문자열 입력
    public static String getString() {
        return scanner.next();
    }

    // 프롬프트 + 문자열 입력
    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}