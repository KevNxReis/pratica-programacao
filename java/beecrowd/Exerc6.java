import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        double A = 0.0;
        double B = 0.0;
        double C = 0.0;
        boolean validar = false;
        while (!validar) {
            System.out.println("insira o valor da nota A e em seguida da nota B e posteriormente da nota C:");
            A = scanner.nextDouble();
            B = scanner.nextDouble();
            C = scanner.nextDouble();
            if ((A >= 0 && A <= 10.0)&&(B >= 0 && B <= 10.0)&&(C >= 0 && C <= 10.0)) {
                validar = true;
            } else {
                System.out.println("Coloque o valor de nota certa aí, animal");
            }
        }
        System.out.println("insira o peso da nota A e em seguida da nota B e posteriormente da nota C:");
        double pesoA = scanner.nextDouble();
        double pesoB = scanner.nextDouble();
        double pesoC = scanner.nextDouble();
        double multpeso = ((A * pesoA)+ (B * pesoB)+ (C * pesoC));
        double media = (multpeso/(pesoA+pesoB+pesoC));
        System.out.println("MEDIA = " + decimalFormat.format(media));
        scanner.close();
    }
}
