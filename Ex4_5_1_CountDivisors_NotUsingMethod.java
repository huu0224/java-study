public class Ex4_5_1_CountDivisors_NotUsingMethod {

	public static void main(String[] args) {
		
		  // 100의 약수 개수
        int cntDivisorsOf100 = 0;                 	
        for (int i = 1; i <= 100; i++)              
            if (100 % i == 0) 	               	
                cntDivisorsOf100++; 	

        System.out.println("\n   * " + 100 + "의 약수 개수: " + cntDivisorsOf100); 


        // 1237의 약수 개수 및 소수 여부
        int cntDivisorsOf1237 = 0;              	 
        for (int i = 1; i <= 1237; i++)             	
            if (1237 % i == 0) 	               	
                cntDivisorsOf1237++;         	

        if (cntDivisorsOf1237 == 2) 
            System.out.println("\n  * " + 1237  + ": 소수임" ); 
        else 
            System.out.println("\n  * " + 1237 + ": 소수 아님" );


        // ============================
        // (실습과제 2) 1234567의 약수 개수
        // ============================
        int cntDivisorsOf1234567 = 0;

        for (int i = 1; i <= 1234567; i++)
            if (1234567 % i == 0)
                cntDivisorsOf1234567++;

        System.out.println("\n  * " + 1234567 + "의 약수 개수: " + cntDivisorsOf1234567);


        // ============================
        // (실습과제 3) 12345677 소수 여부
        // ============================
        int cntDivisorsOf12345677 = 0;

        for (int i = 1; i <= 12345677; i++)
            if (12345677 % i == 0)
                cntDivisorsOf12345677++;

        if (cntDivisorsOf12345677 == 2)
            System.out.println("\n  * " + 12345677 + ": 소수임");
        else
            System.out.println("\n  * " + 12345677 + ": 소수 아님");
    }
}
