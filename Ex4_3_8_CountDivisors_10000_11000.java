public class Ex4_3_8_CountDivisors_10000_11000 {

	public static void main(String[] args) {
		
        for (int n = 10000; n <= 11000; n++) {   // 10000 ~ 11000
            int cntDivisors = 0;

            for (int i = 1; i <= n; i++) {       // 1 ~ n
                if (n % i == 0)
                    cntDivisors++;
            }

            System.out.println(" * " + n + "의 약수 개수: " + cntDivisors);
        }
    }
}