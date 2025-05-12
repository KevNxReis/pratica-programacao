import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        Scanner scanner = new Scanner(System.in);
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double pesoA = 3.5;
        double pesoB = 7.5;
        double multpeso = ((notaA * pesoA)+ (notaB * pesoB));
        double media = (multpeso/(pesoA+pesoB));
        System.out.println("MEDIA = " + decimalFormat.format(media));
        scanner.close();
    }
}