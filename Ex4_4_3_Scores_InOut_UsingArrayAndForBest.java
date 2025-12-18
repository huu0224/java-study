import java.util.Scanner;

class Ex4_4_3_Scores_InOut_UsingArrayAndForBest {
   public static void main(String[] args) { 

      Scanner scanner = new Scanner(System.in);

      int noScores = 20;

      int[] scores = new int[noScores];

      int sum = 0;
      double avg;

      System.out.println("\n ** " + noScores + "개 점수 입력 **");
      System.out.print(" o " + noScores + "개 점수 입력하시오 > ");

      for (int i = 0; i < noScores; i++) {
         scores[i] = scanner.nextInt();   // 🔥 SkScanner → Scanner
         sum += scores[i];
      }

      avg = (double) sum / noScores;

      System.out.print("\n ** 입력된 " + noScores + "개 점수 **\n  * ");
      for (int i = 0; i < noScores; i++) {
         System.out.print(scores[i] + " ");
      }

      System.out.println("\n\n ** 점수 통계 **");
      System.out.println(" * 점수 합계: " + sum);
      System.out.println(" * 점수 평균: " + avg);
   }
}