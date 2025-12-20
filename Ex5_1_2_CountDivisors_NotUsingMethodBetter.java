public class Ex5_1_2_CountDivisors_NotUsingMethodBetter {

	public static void main(String[] args) {
		

        // ------------------------------
        // (1) 100의 약수 개수
        // ------------------------------
        {
            int n = 100;
            int cntDivisors = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    cntDivisors++;
            }

            System.out.println("\n * " + n + "의 약수 개수: " + cntDivisors);
        }

        // ------------------------------
        // (2) 1237의 소수 여부
        // ------------------------------
        {
            int n = 1237;
            int cntDivisors = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    cntDivisors++;
            }

            if (cntDivisors == 2)
                System.out.println("\n * " + n + " : 소수임");
            else
                System.out.println("\n * " + n + " : 소수 아님");
        }

        // ------------------------------
        // (3) 10000의 약수 개수  ← 실습과제 2)
        // ------------------------------
        {
            int n = 10000;
            int cntDivisors = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    cntDivisors++;
            }

            System.out.println("\n * " + n + "의 약수 개수: " + cntDivisors);
        }

        // ------------------------------
        // (4) 1234567의 소수 여부 ← 실습과제 3)
        // ------------------------------
        {
            int n = 1234567;
            int cntDivisors = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    cntDivisors++;
            }

            if (cntDivisors == 2)
                System.out.println("\n * " + n + " : 소수임");
            else
                System.out.println("\n * " + n + " : 소수 아님");
        }
    }
}