public class PersonMgmt {

	public static void main(String[] args) {
        /* =========================
         * 이몽룡
         * ========================= */

        Person mongryong = new Person("이몽룡");

        mongryong.go("서울");
        mongryong.setAge(20);
        mongryong.go("남원 춘향집");
        mongryong.go("남원 감옥");

        mongryong.print();


        /* =========================
         * 성춘향
         * ========================= */

        Person chunhyang = new Person("성춘향");

        chunhyang.setAge(16);
        chunhyang.go("광한루");
        chunhyang.go("남원 춘향집");
        chunhyang.go("남원 감옥");

        chunhyang.setAge(18);
        chunhyang.go("서울");

        chunhyang.print();
        
        /* =========================
         * 안중근 의사
         * ========================= */

        Person ahn = new Person("안중근");

        // 1909년 10월 21일, 30세에 하얼빈으로 감
        ahn.setAge(30);
        ahn.go("하얼빈");

        // 1909년 12월 26일, 하얼빈 역으로 감
        ahn.go("하얼빈 역");

        // 이후 체포되어 뤼순 감옥으로 이송
        ahn.go("뤼순 감옥");

        // 31세에 재판을 받음
        ahn.setAge(31);

        // 객체 출력
        ahn.print();
    }
}