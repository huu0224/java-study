
public class Ex2_3_3_Person_InOut {

	public static void main(String[] args) {

        // 신상정보 항목인 이름, 나이, 현위치 저장을 위한 변수 선언
        String name;
        int age;
        String currentLocation;

        System.out.println(" ** 신상정보 입력 **");

        System.out.print(" o 이름 > ");
        name = SkScanner.getString();

        System.out.print(" o 나이 > ");
        age = SkScanner.getInt();

        System.out.print(" o 현위치 > ");
        currentLocation = SkScanner.getString();

        // 결과 출력
        System.out.println(); // 줄 바꿈
        System.out.println(" ** " + name + "의 신상정보 **");
        System.out.println(" * " + name + "의 나이는 " + age + "세이고 "
                + currentLocation + "에 있음");

        // 프로그램 반복 실행
        main(args);
    }
}
