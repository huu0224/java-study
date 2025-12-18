import java.util.Scanner;

class Pr2_4_2_Scores50_InOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 50명 점수 저장할 변수 선언
        int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
        int s11,s12,s13,s14,s15,s16,s17,s18,s19,s20;
        int s21,s22,s23,s24,s25,s26,s27,s28,s29,s30;
        int s31,s32,s33,s34,s35,s36,s37,s38,s39,s40;
        int s41,s42,s43,s44,s45,s46,s47,s48,s49,s50;

        System.out.println("\n ** 50명 점수 입력 **");

        System.out.print(" o 1~10번 점수 입력 > ");
        s1=scanner.nextInt();  s2=scanner.nextInt();  s3=scanner.nextInt();  s4=scanner.nextInt();  s5=scanner.nextInt();
        s6=scanner.nextInt();  s7=scanner.nextInt();  s8=scanner.nextInt();  s9=scanner.nextInt();  s10=scanner.nextInt();

        System.out.print(" o 11~20번 점수 입력 > ");
        s11=scanner.nextInt(); s12=scanner.nextInt(); s13=scanner.nextInt(); s14=scanner.nextInt(); s15=scanner.nextInt();
        s16=scanner.nextInt(); s17=scanner.nextInt(); s18=scanner.nextInt(); s19=scanner.nextInt(); s20=scanner.nextInt();

        System.out.print(" o 21~30번 점수 입력 > ");
        s21=scanner.nextInt(); s22=scanner.nextInt(); s23=scanner.nextInt(); s24=scanner.nextInt(); s25=scanner.nextInt();
        s26=scanner.nextInt(); s27=scanner.nextInt(); s28=scanner.nextInt(); s29=scanner.nextInt(); s30=scanner.nextInt();

        System.out.print(" o 31~40번 점수 입력 > ");
        s31=scanner.nextInt(); s32=scanner.nextInt(); s33=scanner.nextInt(); s34=scanner.nextInt(); s35=scanner.nextInt();
        s36=scanner.nextInt(); s37=scanner.nextInt(); s38=scanner.nextInt(); s39=scanner.nextInt(); s40=scanner.nextInt();

        System.out.print(" o 41~50번 점수 입력 > ");
        s41=scanner.nextInt(); s42=scanner.nextInt(); s43=scanner.nextInt(); s44=scanner.nextInt(); s45=scanner.nextInt();
        s46=scanner.nextInt(); s47=scanner.nextInt(); s48=scanner.nextInt(); s49=scanner.nextInt(); s50=scanner.nextInt();

        System.out.println("\n ** 입력된 50명 점수 **");
        System.out.println(
            s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8+" "+s9+" "+s10+"\n"+
            s11+" "+s12+" "+s13+" "+s14+" "+s15+" "+s16+" "+s17+" "+s18+" "+s19+" "+s20+"\n"+
            s21+" "+s22+" "+s23+" "+s24+" "+s25+" "+s26+" "+s27+" "+s28+" "+s29+" "+s30+"\n"+
            s31+" "+s32+" "+s33+" "+s34+" "+s35+" "+s36+" "+s37+" "+s38+" "+s39+" "+s40+"\n"+
            s41+" "+s42+" "+s43+" "+s44+" "+s45+" "+s46+" "+s47+" "+s48+" "+s49+" "+s50
        );
    }
}