
public class Pr2_2_1_Info_Out {

	public static void main(String[] args) {
		
        /* =========================
         * 1) 과자 정보
         * ========================= */
        String snackName = "새우깡";
        int releaseYear = 1971;
        String snackCompany = "농심";

        System.out.println(snackName + "은 " + releaseYear + "년에 출시된 "
                + snackCompany + "에서 만든 과자이다.");

        /* =========================
         * 2) 영화 정보
         * ========================= */
        String movieTitle = "매트릭스";
        String movieGenre = "SF, 액션";
        String movieDirector = "릴리 워쇼스키, 라나 워쇼스키";
        String mainActors = "키아누 리브스, 로렌스 피시번, 캐리 앤 모스, 휴고 위빙";

        System.out.println(movieTitle + "는 " + movieGenre + " 장르의 영화로, 감독은 "
                + movieDirector + "이며 주연 배우는 "
                + mainActors + "이다.");

        /* =========================
         * 3) 제품 정보
         * ========================= */
        String productName = "Photoshop";
        String productCompany = "Adobe System";
        String productType = "graphic S/W";

        System.out.println(productName + "는 "
                + productCompany + "에서 만든 "
                + productType + "이다.");
    }
}