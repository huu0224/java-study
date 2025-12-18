
public class Person_Out1 {

	public static void main(String[] args) {

        /* =========================
         * 1) 이몽룡 / 성춘향
         * ========================= */

        String name = "이몽룡";
        int age = 18;
        double height = 173.5;
        char initialOfName = '이';
        boolean isKorean = true;
        String location = "한양";

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("이름 첫 글자: " + initialOfName);
        System.out.println("한국인 여부: " + isKorean);
        System.out.println("현 위치: " + location);
        System.out.println();

        // 성춘향 (변수 값 변경)
        name = "성춘향";
        age = 16;
        height = 160.0;
        initialOfName = '성';
        isKorean = true;
        location = "남원";

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("이름 첫 글자: " + initialOfName);
        System.out.println("한국인 여부: " + isKorean);
        System.out.println("현 위치: " + location);
        System.out.println();


        /* =========================
         * 2) 김철수
         * ========================= */

        double csHeight = 177.7;
        char csInitialOfName = 'H';
        boolean csIsKorean = true;

        System.out.println("김철수 키: " + csHeight);
        System.out.println("김철수 이름 첫 글자: " + csInitialOfName);
        System.out.println("김철수 한국인 여부: " + csIsKorean);
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
         * 4) 외국인 한 명
         * ========================= */

        String foreignName = "Emma Watson";
        int foreignAge = 33;
        double foreignHeight = 165.4;
        char foreignInitialOfName = 'E';
        boolean foreignIsKorean = false;
        String foreignLocation = "United Kingdom";

        System.out.println("이름: " + foreignName);
        System.out.println("나이: " + foreignAge);
        System.out.println("키: " + foreignHeight);
        System.out.println("이름 첫 글자: " + foreignInitialOfName);
        System.out.println("한국인 여부: " + foreignIsKorean);
        System.out.println("현 위치: " + foreignLocation);
    }
}
