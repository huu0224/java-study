public class Ex2_3_1_Message_InOut_UsingJavaScanner {

	public static void main(String[] args) {

		 // java.util.Scanner 클래스의 객체 생성
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // =========================
        // 첫 번째 메시지 입력
        // =========================
        String firstMessage;
        System.out.print("\n  o 첫 입력 메시지 입력하시오 > ");
        firstMessage = scanner.nextLine();
        System.out.println("  * 첫 입력 메시지: " + firstMessage);


        // =========================
        // 목표 메시지 입력
        // =========================
        String goalMessage;
        System.out.print("\n  o 목표 메시지 입력하시오 > ");
        goalMessage = scanner.nextLine();
        System.out.println("  * 입력된 목표 메시지: " + goalMessage);


        // =========================
        // 1) 좋아하는 격언 입력
        // =========================
        String favoriteSaying;
        System.out.print("\n  o 좋아하는 격언을 입력하시오 > ");
        favoriteSaying = scanner.nextLine();
        System.out.println("  * 좋아하는 격언: " + favoriteSaying);


        // =========================
        // 2) 내 정보 입력 (이름, 나이, 현위치)
        // =========================
        String myInfo;
        System.out.print("\n  o 이름, 나이, 현위치를 한 문장으로 입력하시오 > ");
        myInfo = scanner.nextLine();
        System.out.println("  * 내 정보: " + myInfo);


        // Scanner 사용 종료
        scanner.close();
    }
}
