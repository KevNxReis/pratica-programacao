import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double soma = A + B;
        double peso = soma / 2;
        System.out.println("MEDIA = "+decimalFormat.format(peso));
        scanner.close();



    }
}
