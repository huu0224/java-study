public class E2_3_2_Message_InOut_UsingSkScanner {

	public static void main(String[] args) {

        // =========================
        // 첫 입력 메시지
        // =========================
        String firstMessage;
        System.out.print("\n  o 첫 입력 메시지 입력하시오 > ");
        firstMessage = SkScanner.getString();
        System.out.println("  * 첫 입력 메시지: " + firstMessage);


        // =========================
        // 목표 메시지
        // =========================
        String goalMessage;
        System.out.print("\n  o 목표 메시지 입력하시오 > ");
        goalMessage = SkScanner.getString();
        System.out.println("  * 입력된 목표 메시지: " + goalMessage);


        // =========================
        // 1) 좋아하는 격언 입력
        // =========================
        String favoriteSaying;
        System.out.print("\n  o 좋아하는 격언을 입력하시오 > ");
        favoriteSaying = SkScanner.getString();
        System.out.println("  * 좋아하는 격언: " + favoriteSaying);


        // =========================
        // 2) 내 정보 입력
        // =========================
        String myInfo;
        System.out.print("\n  o 이름, 나이, 현위치를 한 문장으로 입력하시오 > ");
        myInfo = SkScanner.getString();
        System.out.println("  * 내 정보: " + myInfo);
    }
}
