import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        Scanner scanner = new Scanner(System.in);
        double A = 0.0;
        double B = 0.0;
        boolean validar = false;

        while (!validar) {
            A = scanner.nextDouble();
            B = scanner.nextDouble();

            if ((A >= 0 && A <= 10.0) && (B >= 0 && B <= 10.0)) {
                validar = true;
                break;
            } else {
                System.out.println("Coloque o valor de nota certa aí, animal");
            }
        }

        double media = (A + B) / 2;
        System.out.println("MEDIA = " + decimalFormat.format(media));
        scanner.close();
    }
}