
public class Ex4_2_2_TemperatureConversion_FandC_UsingIf {

	public static void main(String[] args) {
        int menu;

        System.out.println("\n\n **** Conversion of Temperature ****\n");
        System.out.println("     1) Fahrenheit temperature to Centigrade temperature");
        System.out.println("     2) Centigrade temperature to Fahrenheit temperature");
        System.out.println("     3) Centigrade temperature to Kelvin temperature\n");

        menu = SkScanner.getIntWithPrompt(" o Choose which > ");

        if (menu == 1) {
            double F, C;

            F = SkScanner.getDoubleWithPrompt(" o Input Fahrenheit degree > ");
            C = (F - 32) * 5 / 9;

            double C1 = (int)((C + 0.05) * 10) / 10.0; // 소수점 첫째자리 반올림
            System.out.println("\n * " + F + "F = " + C1 + "C");
        }
        else if (menu == 2) {
            double C, F;

            C = SkScanner.getDoubleWithPrompt(" o Input Centigrade degree > ");
            F = C * 9 / 5 + 32;

            System.out.println("\n * " + C + "C = " + F + "F");
        }
        else if (menu == 3) {
            double C, K;

            C = SkScanner.getDoubleWithPrompt(" o Input Centigrade degree > ");
            K = C + 273.15;

            System.out.println("\n * " + C + "C = " + K + "K");
        }
        else {
            System.out.println("\n ??? 오류: 잘못된 메뉴 선택임");
        }
    }
}