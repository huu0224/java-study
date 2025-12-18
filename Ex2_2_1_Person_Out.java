
public class Ex2_2_1_Person_Out {

	public static void main(String[] args) {

        // =========================
        // 기존 코드 (홍길동)
        // =========================

        // 이름, 나이, 현위치 저장을 위한 변수 선언
        String name;                  // 문자열 변수, name
        int age;                      // 정수 변수, age
        String currentLocation;       // 문자열 변수 currentLocation

        // 홍길동은 18살로 금강산에 있음을 나타내도록 변수들에 값 저장
        name = "홍길동";              // name 변수에 문자열 "홍길동" 저장
        age = 18;                     // age 변수에 정수 값 18 저장
        currentLocation = "금강산";   // currentLocation 변수에 문자열 "금강산" 저장

        // 변수들의 값을 한 라인에 하나씩 결과로 출력
        System.out.println("** 변수에 저장된 결과 **");
        System.out.println(name);
        System.out.println(age);
        System.out.println(currentLocation);


        // =========================
        // 추가 코드 (안중근 의사)
        // =========================

        // 안중근 의사의 정보를 위한 변수 선언
        String ahnName;
        int ahnAge;
        String ahnLocation;

        // 안중근 의사는 30세에 하얼빈으로 갔다
        ahnName = "안중근";
        ahnAge = 30;
        ahnLocation = "하얼빈";

        // 안중근 의사 정보 출력
        System.out.println("** 안중근 의사 정보 **");
        System.out.println(ahnName);
        System.out.println(ahnAge);
        System.out.println(ahnLocation);

    }  // main() 메소드 끝
} 