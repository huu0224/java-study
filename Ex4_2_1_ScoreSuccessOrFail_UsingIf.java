
public class Ex4_2_1_ScoreSuccessOrFail_UsingIf {

	public static void main(String[] args) {
		
        int score = SkScanner.getIntWithPrompt(" * 점수 입력하시오 > ");

        // 하나의 if 문으로 낙제 여부 판단
        if (score < 60) {
            System.out.println(" o " + score + "점: 낙제 점수임");
        } else {
            System.out.println(" o " + score + "점: 낙제 점수 아님");
        }

        // 우수 점수 여부 추가 판단
        if (score >= 90) {
            System.out.println(" o 우수 점수임");
        } else {
            System.out.println(" o 우수 점수 아님");
        }
    }
}