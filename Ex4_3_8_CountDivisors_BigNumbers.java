public class Ex4_3_8_CountDivisors_BigNumbers {

	public static void main(String[] args) {
		
        for (long n = 1_000_000_000L; n <= 1_000_000_100L; n++) {
            int cntDivisors = 0;

            for (long i = 1; i <= n; i++) {   // ⚠️ 너무 많은 반복
                if (n % i == 0)
                    cntDivisors++;
            }

            System.out.println(" * " + n + "의 약수 개수: " + cntDivisors);
        }
    }
}