import java.util.Scanner;

class SkScanner {

    private static Scanner scanner = new Scanner(System.in);

    // 문자열 입력
    public static String getString() {
        return scanner.nextLine();
    }

    // 프롬프트 + 문자열 입력
    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // 정수 입력
    public static int getInt() {
        return scanner.nextInt();
    }

    // 프롬프트 + 정수 입력
    public static int getIntWithPrompt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}