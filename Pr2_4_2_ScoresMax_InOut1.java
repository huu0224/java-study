import java.util.Scanner;

class Pr2_4_2_ScoresMax_InOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
        int s11,s12,s13,s14,s15,s16,s17,s18,s19,s20;
        int s21,s22,s23,s24,s25,s26,s27,s28,s29,s30;

        System.out.println("\n ** 최대 입력 가능한 점수(30명) 입력 **");

        System.out.print(" o 1~10번 점수 입력 > ");
        s1=scanner.nextInt(); s2=scanner.nextInt(); s3=scanner.nextInt(); s4=scanner.nextInt(); s5=scanner.nextInt();
        s6=scanner.nextInt(); s7=scanner.nextInt(); s8=scanner.nextInt(); s9=scanner.nextInt(); s10=scanner.nextInt();

        System.out.print(" o 11~20번 점수 입력 > ");
        s11=scanner.nextInt(); s12=scanner.nextInt(); s13=scanner.nextInt(); s14=scanner.nextInt(); s15=scanner.nextInt();
        s16=scanner.nextInt(); s17=scanner.nextInt(); s18=scanner.nextInt(); s19=scanner.nextInt(); s20=scanner.nextInt();

        System.out.print(" o 21~30번 점수 입력 > ");
        s21=scanner.nextInt(); s22=scanner.nextInt(); s23=scanner.nextInt(); s24=scanner.nextInt(); s25=scanner.nextInt();
        s26=scanner.nextInt(); s27=scanner.nextInt(); s28=scanner.nextInt(); s29=scanner.nextInt(); s30=scanner.nextInt();

        System.out.println("\n ** 입력된 점수 출력 **");
        System.out.println(
            s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8+" "+s9+" "+s10+"\n"+
            s11+" "+s12+" "+s13+" "+s14+" "+s15+" "+s16+" "+s17+" "+s18+" "+s19+" "+s20+"\n"+
            s21+" "+s22+" "+s23+" "+s24+" "+s25+" "+s26+" "+s27+" "+s28+" "+s29+" "+s30
        );
    }
}