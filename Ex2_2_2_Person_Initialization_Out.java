
public class Ex2_2_2_Person_Initialization_Out {

	public static void main(String[] args) {

		   // =========================
        // 기존 코드 (홍길동)
        // =========================

        // 이름, 나이, 현위치 저장을 위한 변수 선언과 초기화
        String name = "홍길동";          // 변수 선언 + 초기화
        int age = 18;                   // 변수 선언 + 초기화
        String currentLocation = "금강산"; // 변수 선언 + 초기화

        // 변수 값 출력
        System.out.println("** 변수에 저장된 결과 **");
        System.out.println(name);
        System.out.println(age);
        System.out.println(currentLocation);


        // =========================
        // 1) 안중근 의사
        // =========================

        // 변수 선언과 초기화
        String ahnName = "안중근";
        int ahnAge = 30;
        String ahnLocation = "하얼빈";

        // 출력
        System.out.println("** 안중근 의사 정보 **");
        System.out.println(ahnName);
        System.out.println(ahnAge);
        System.out.println(ahnLocation);


        // =========================
        // 2) 김철수
        // =========================

        // 김철수 상황을 위한 변수 선언과 초기화
        String studentName = "김철수";
        int studentAge = 23;
        String university = "한국대학교";
        int grade = 3;
        String location = "도서관";

        // 출력
        System.out.println("** 김철수 정보 **");
        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(university);
        System.out.println(grade);
        System.out.println(location);
    }
}