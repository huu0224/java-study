public class Var_Out {

	public static void main(String[] args) {
		
        // (1) 서울 → 강릉 거리 (km)
        double distanceSeoulToGangneung = 228.7;

        // (2) 농심 안성탕면 가격 (원)
        int ramenPrice = 520;

        // (3) 한국의 수도
        String capitalOfKorea = "서울";

        // (4) 숭례문 주소
        String sungnyemunAddress = "서울특별시 중구 세종대로 40 숭례문";

        // (5) 1988 서울 올림픽 참가국 수
        int olympicCountries1988 = 160;

        // (6) 이순신 장군 노량해전 승리 연도
        String yiSunSinBattle =
                "이순신 장군은 1597년 노량해전에서 승리했다.";

        // (7) 한국자동차 회사 정보
        int employeeCount = 15000;
        int dailyProduction = 1100;
        String ceoName = "김한국";
        String companyLocation = "경기도 오산시";

        System.out.println("서울에서 강릉까지의 거리: " + distanceSeoulToGangneung + "km");
        System.out.println("농심 안성탕면 가격: " + ramenPrice + "원");
        System.out.println("한국의 수도: " + capitalOfKorea);
        System.out.println("숭례문 주소: " + sungnyemunAddress);
        System.out.println("1988년 서울 올림픽 참가국 수: " + olympicCountries1988);
        System.out.println(yiSunSinBattle);
        System.out.println("한국자동차 정보");
        System.out.println("종업원 수: " + employeeCount);
        System.out.println("하루 생산량: " + dailyProduction);
        System.out.println("사장 이름: " + ceoName);
        System.out.println("회사 위치: " + companyLocation);
    }
}