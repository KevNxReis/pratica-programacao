import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        Scanner scanner = new Scanner(System.in);
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double notaC = scanner.nextDouble();
        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;
        double multpeso = ((notaA * pesoA)+ (notaB * pesoB)+(notaC * pesoC));
        double media = (multpeso/(pesoA+pesoB+pesoC));
        System.out.println("MEDIA = " + decimalFormat.format(media));
        scanner.close();
    }
}