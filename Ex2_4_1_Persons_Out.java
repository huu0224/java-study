public class Ex2_4_1_Persons_Out {

	public static void main(String[] args) {

		 // 5명의 이름, 나이, 현위치 저장을 위한 변수 선언
        String name1, name2, name3, name4, name5;
        int age1, age2, age3, age4, age5;
        String currentLocation1, currentLocation2, currentLocation3,
               currentLocation4, currentLocation5;

        // 18세 홍길동이 금강산에 있음
        name1 = "홍길동"; age1 = 18; currentLocation1 = "금강산";

        // 20세 이몽룡이 남원에 있음
        name2 = "이몽룡"; age2 = 20; currentLocation2 = "남원";

        // 20세 감자바가 학교 도서관에 있음
        name3 = "감자바"; age3 = 20; currentLocation3 = "학교 도서관";

        // 본인 정보
        name4 = "허윤정"; age4 = 23; currentLocation4 = "대한민국";

        // 지인 정보
        name5 = "김민수"; age5 = 24; currentLocation5 = "서울";

        // 출력
        System.out.println("\n ** 5명의 신상정보 **\n");

        System.out.println(" * 첫 번째 신상정보: " + name1 + "의 나이는 " + age1 + "세이고 "
                + currentLocation1 + "에 있음");
        System.out.println(" * 두 번째 신상정보: " + name2 + "의 나이는 " + age2 + "세이고 "
                + currentLocation2 + "에 있음");
        System.out.println(" * 세 번째 신상정보: " + name3 + "의 나이는 " + age3 + "세이고 "
                + currentLocation3 + "에 있음");
        System.out.println(" * 네 번째 신상정보: " + name4 + "의 나이는 " + age4 + "세이고 "
                + currentLocation4 + "에 있음");
        System.out.println(" * 다섯 번째 신상정보: " + name5 + "의 나이는 " + age5 + "세이고 "
                + currentLocation5 + "에 있음");
    }
}