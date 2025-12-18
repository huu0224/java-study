import java.util.Scanner;

class Ex4_4_1_Scores_InOut_UsingArrayNotUsingFor {
   public static void main(String[] args) { 

      Scanner scanner = new Scanner(System.in);

      // 점수 13개 저장할 배열변수 선언하고 배열 객체를 배열변수 scores에 저장
      int[] scores = new int[13];   // ★ 10 → 13으로 변경

      // 점수 13개 입력하여 배열변수의 인덱스 0부터 12까지 원소에 저장
      System.out.println("\n ** 점수 13개 입력 **");   // ★ 출력 문구 변경
      System.out.print(" o 점수 13개 입력하시오 > ");   // ★ 출력 문구 변경

      scores[0]  = scanner.nextInt();
      scores[1]  = scanner.nextInt();
      scores[2]  = scanner.nextInt();
      scores[3]  = scanner.nextInt();
      scores[4]  = scanner.nextInt();
      scores[5]  = scanner.nextInt();
      scores[6]  = scanner.nextInt();
      scores[7]  = scanner.nextInt();
      scores[8]  = scanner.nextInt();
      scores[9]  = scanner.nextInt();
      scores[10] = scanner.nextInt();   // ★ 추가
      scores[11] = scanner.nextInt();   // ★ 추가
      scores[12] = scanner.nextInt();   // ★ 추가

      // 입력된 점수 13개 모두 출력
      System.out.println("\n ** 입력된 점수 13개 **");   // ★ 출력 문구 변경
      System.out.println(" * " 
            + scores[0]  + " " + scores[1]  + " " + scores[2]  + " " 
            + scores[3]  + " " + scores[4]  + " " + scores[5]  + " " 
            + scores[6]  + " " + scores[7]  + " " + scores[8]  + " " 
            + scores[9]  + " " + scores[10] + " " + scores[11] + " " 
            + scores[12]);
   }
}
