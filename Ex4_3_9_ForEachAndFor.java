public class Ex4_3_9_ForEachAndFor {

	public static void main(String[] args) {
		
	       int[] scores = { 90, 95, 79, 83, 88, 65, 72, 83, 81, 96 };
	        int sum = 0;

	        // =========================
	        // for-each 문으로 점수 합 구하기
	        // =========================
	        for (int score : scores) {   // 배열 원소 하나씩 score에 저장
	            sum = sum + score;
	        }

	        System.out.println(" * 점수들의 개수: " + scores.length);
	        System.out.println(" * 점수들의 합(for-each): " + sum);

	        // =========================
	        // for 문으로 점수 합 다시 구하기
	        // =========================
	        sum = 0;   // 합 초기화

	        for (int i = 0; i < scores.length; i++) {
	            int score = scores[i];
	            sum = sum + score;
	        }

	        System.out.println(" * 점수들의 합(for 문): " + sum);

	        // =========================
	        // 실습과제: 이름 배열 출력
	        // =========================
	        String[] names = { "홍길동", "이몽룡", "감자바" };

	        // for-each 문으로 출력
	        System.out.println("\n ** for-each 문으로 이름 출력 **");
	        for (String name : names) {
	            System.out.print(name + " ");
	        }

	        // for 문으로 출력
	        System.out.println("\n\n ** for 문으로 이름 출력 **");
	        for (int i = 0; i < names.length; i++) {
	            System.out.print(names[i] + " ");
	        }
	    }
	}