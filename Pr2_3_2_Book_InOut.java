import java.util.Scanner;

class Pr2_3_2_Book_InOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String title;
        String author;
        String publisher;
        int price;
        int pages;

        System.out.println("** 책 정보 입력 **");

        System.out.print("o 책 제목 > ");
        title = scanner.nextLine();

        System.out.print("o 저자 > ");
        author = scanner.nextLine();

        System.out.print("o 출판사 > ");
        publisher = scanner.nextLine();

        System.out.print("o 가격 > ");
        price = scanner.nextInt();

        System.out.print("o 페이지 수 > ");
        pages = scanner.nextInt();

        System.out.println("\n** 입력된 책 정보 **");
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("출판사: " + publisher);
        System.out.println("가격: " + price + "원");
        System.out.println("페이지 수: " + pages + "쪽");
    }
}