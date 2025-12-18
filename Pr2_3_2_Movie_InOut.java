import java.util.Scanner;

class Pr2_3_2_Movie_InOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String title;
        String genre;
        String director;
        String actors;

        System.out.println("** 영화 정보 입력 **");

        System.out.print("o 영화 제목 > ");
        title = scanner.nextLine();

        System.out.print("o 장르 > ");
        genre = scanner.nextLine();

        System.out.print("o 감독 > ");
        director = scanner.nextLine();

        System.out.print("o 주연 배우 > ");
        actors = scanner.nextLine();

        System.out.println("\n** 입력된 영화 정보 **");
        System.out.println(title + "는 " + genre + " 장르의 영화이며, 감독은 "
                + director + "이고 주연 배우는 " + actors + "이다.");
    }
}