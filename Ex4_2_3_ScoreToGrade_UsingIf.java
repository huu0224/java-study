
public class Ex4_2_3_ScoreToGrade_UsingIf {

	public static void main(String[] args) {
		
		  int score;          // 점수 입력하여 저장할 변수
	      String grade = "";  // 성적 등급 저장할 변수

	      System.out.println("\n **** 점수를 성적 등급으로 변환 **** \n");

	      score = SkScanner.getIntWithPrompt(" o 점수 입력 > ");

	      // ❗ 잘못된 점수 처리 (0 미만 또는 100 초과)
	      if (score < 0 || score > 100) {
	         System.out.println("  ??? 오류: 잘못된 점수");
	      }
	      else {
	         if (score >= 95)              grade = "A+";
	         else if (score >= 90)         grade = "A0";
	         else if (score >= 85)         grade = "B+";
	         else if (score >= 80)         grade = "B0";
	         else if (score >= 75)         grade = "C+";
	         else if (score >= 70)         grade = "C0";
	         else if (score >= 65)         grade = "D+";
	         else if (score >= 60)         grade = "D0";
	         else                          grade = "F";

	         System.out.println(" * 입력 점수 " + score + "의 성적 등급: " + grade);
	      }
	   }
	}