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
            System.out.println("insira o valor da nota A e em seguida da nota B:");
            A = scanner.nextDouble();
            B = scanner.nextDouble();

            if ((A >= 0 && A <= 10.0) && (B >= 0 && B <= 10.0)) {
                validar = true;
            } else {
                System.out.println("Coloque o valor de nota certa aí, animal");
            }
        }
        System.out.println("insira o peso da nota A e em seguida da nota B:");
        double pesoA = scanner.nextDouble();
        double pesoB = scanner.nextDouble();
        double multpeso = ((A * pesoA)+ (B * pesoB));
        double media = (multpeso/(pesoA+pesoB));
        System.out.println("MEDIA = " + decimalFormat.format(media));
        scanner.close();
    }
}