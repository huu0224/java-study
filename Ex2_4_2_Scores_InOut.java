
public class Ex2_4_2_Scores_InOut {

	public static void main(String[] args) {

		 java.util.Scanner scanner = new java.util.Scanner(System.in);

	        int score1, score2, score3, score4, score5,
	            score6, score7, score8, score9, score10,
	            score11, score12, score13, score14, score15,
	            score16, score17, score18, score19, score20;

	        System.out.println("\n ** 첫 번째 10명 점수 입력 **");
	        System.out.print(" o 점수 입력 > ");
	        score1 = scanner.nextInt();  score2 = scanner.nextInt();
	        score3 = scanner.nextInt();  score4 = scanner.nextInt();
	        score5 = scanner.nextInt();  score6 = scanner.nextInt();
	        score7 = scanner.nextInt();  score8 = scanner.nextInt();
	        score9 = scanner.nextInt();  score10 = scanner.nextInt();

	        System.out.println("\n ** 두 번째 10명 점수 입력 **");
	        System.out.print(" o 점수 입력 > ");
	        score11 = scanner.nextInt(); score12 = scanner.nextInt();
	        score13 = scanner.nextInt(); score14 = scanner.nextInt();
	        score15 = scanner.nextInt(); score16 = scanner.nextInt();
	        score17 = scanner.nextInt(); score18 = scanner.nextInt();
	        score19 = scanner.nextInt(); score20 = scanner.nextInt();

	        System.out.println("\n ** 입력된 20명의 점수 **");
	        System.out.println(" * "
	                + score1 + " " + score2 + " " + score3 + " " + score4 + " " + score5 + " "
	                + score6 + " " + score7 + " " + score8 + " " + score9 + " " + score10 + " "
	                + score11 + " " + score12 + " " + score13 + " " + score14 + " " + score15 + " "
	                + score16 + " " + score17 + " " + score18 + " " + score19 + " " + score20);
	    }
	}