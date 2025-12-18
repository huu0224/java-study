
public class Variables_Out {

	public static void main(String[] args) {
		
        /* =========================
         * (1) 과자 정보
         * ========================= */

        String snackName;
        int releaseYear;
        String manufacturer;

        snackName = "새우깡";
        releaseYear = 1971;
        manufacturer = "농심";

        System.out.println(snackName + "은(는) " + releaseYear +
                "년에 출시된 " + manufacturer + "의 과자이다.");


        /* =========================
         * (2) 영화 정보
         * ========================= */

        String movieTitle;
        String movieGenre;
        String movieDirector;
        String mainActors;

        movieTitle = "매트릭스";
        movieGenre = "SF, 액션";
        movieDirector = "릴리 워쇼스키, 라나 워쇼스키";
        mainActors = "키아누 리브스, 로렌스 피시번, 캐리 앤 모스, 휴고 위빙";

        System.out.println(movieTitle + "는 " + movieGenre +
                " 장르의 영화로, 감독은 " + movieDirector +
                "이며 주연 배우로는 " + mainActors + "가 출연한다.");


        /* =========================
         * (3) S/W 제품 정보
         * ========================= */

        String softwareName;
        String softwareCompany;
        String softwareType;

        softwareName = "포토샵";
        softwareCompany = "어도비시스템";
        softwareType = "그래픽 프로그램";

        System.out.println(softwareName + "은(는) " + softwareCompany +
                "에서 제작한 " + softwareType + "이다.");


        /* =========================
         * (4) 언어 정보
         * ========================= */

        String languageName;
        int 발표년도;
        String creator;
        String purpose;

        languageName = "Java";
        발표년도 = 1995;
        creator = "James Gosling";
        purpose = "프로그래밍";

        System.out.println(languageName + "는 " + 발표년도 +
                "년에 발표된 언어로, 제작자는 " + creator +
                "이며 주 용도는 " + purpose + "이다.");
    }
}