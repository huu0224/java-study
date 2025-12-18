public class Person_Out {

	public static void main(String[] args) {
		 /* =========================
         * 1) 이몽룡 / 성춘향
         * ========================= */

        // 이몽룡 (춘향전 참고)
        String name = "이몽룡";
        int age = 18;
        double height = 173.5;
        boolean isKorean = true;
        String location = "한양";

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("한국인 여부: " + isKorean);
        System.out.println("현 위치: " + location);
        System.out.println();

        // 성춘향 (변수 값 변경)
        name = "성춘향";
        age = 16;
        height = 160.2;
        isKorean = true;
        location = "남원";

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("한국인 여부: " + isKorean);
        System.out.println("현 위치: " + location);
        System.out.println();


        /* =========================
         * 2) 홍길동 (추가 변수)
         * ========================= */

        double hongHeight = 177.7;
        char initialOfName = 'H';
        boolean isHongKorean = true;

        System.out.println("홍길동 키: " + hongHeight);
        System.out.println("이름 첫 글자: " + initialOfName);
        System.out.println("한국인 여부: " + isHongKorean);
        System.out.println();


        /* =========================
         * 3) 본인 정보 (my 접두사)
         * ========================= */

        String myName = "허윤정";
        int myAge = 23;
        double myHeight = 165.0;
        char myInitialOfName = 'H';
        boolean myIsKorean = true;
        String myLocation = "대한민국";

        System.out.println("이름: " + myName);
        System.out.println("나이: " + myAge);
        System.out.println("키: " + myHeight);
        System.out.println("이름 첫 글자: " + myInitialOfName);
        System.out.println("한국인 여부: " + myIsKorean);
        System.out.println("현 위치: " + myLocation);
        System.out.println();


        /* =========================
         * 4) 외국인 한 명 설정
         * ========================= */

        String foreignName = "John Smith";
        int foreignAge = 30;
        double foreignHeight = 180.3;
        char foreignInitial = 'J';
        boolean foreignIsKorean = false;
        String foreignLocation = "USA";

        System.out.println("이름: " + foreignName);
        System.out.println("나이: " + foreignAge);
        System.out.println("키: " + foreignHeight);
        System.out.println("이름 첫 글자: " + foreignInitial);
        System.out.println("한국인 여부: " + foreignIsKorean);
        System.out.println("현 위치: " + foreignLocation);
    }
}