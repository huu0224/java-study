import java.util.Scanner;

class Pr2_3_1_BookInfo_InOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookInfo;

        System.out.println("** 좋아하는 책 정보 입력 **");
        System.out.print("o 책 정보 전체 입력 > ");
        bookInfo = scanner.nextLine();

        System.out.println("\n** 입력된 책 정보 **");
        System.out.println(bookInfo);
    }
}