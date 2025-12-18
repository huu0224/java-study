import java.util.Scanner;

class Ex4_4_2_Scores_InOut_UsingArrayAndFor {
   public static void main(String[] args) { 

      Scanner scanner = new Scanner(System.in);

      // 점수 20개 저장할 배열변수 선언하고 배열 객체를 배열변수 scores에 저장
      int[] scores = new int[20];   // ★ 10 → 20으로 변경

      int sum = 0;        // 점수 합 저장 변수
      double avg;         // 점수 평균 저장 변수

      // 점수 20개 입력하여 배열변수의 인덱스 0부터 19까지 원소에 저장
      System.out.println("\n ** 점수 20개 입력 **");      // 입력 타이틀 출력
      System.out.print(" o 점수 20개 입력하시오 > ");      // 프롬프트 메시지 출력

      for (int i = 0; i < 20; i++) {        // ★ 반복 횟수 20으로 변경
         scores[i] = scanner.nextInt();     // 점수 입력
         sum += scores[i];                  // 입력과 동시에 합 누적
      }

      // 평균 계산
      avg = (double) sum / 20;

      // 입력된 점수 20개 모두 출력
      System.out.print("\n ** 입력된 점수 20개 **\n  * ");

      for (int i = 0; i < 20; i++) {        // ★ 반복 횟수 20으로 변경
         System.out.print(scores[i] + " ");
      }

      // 합과 평균 출력
      System.out.println("\n\n ** 점수 통계 **");
      System.out.println(" * 점수 합계: " + sum);
      System.out.println(" * 점수 평균: " + avg);
   }
}