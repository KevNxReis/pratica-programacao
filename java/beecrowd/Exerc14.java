import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        int km = scanner.nextInt();
        double gasolina = scanner.nextDouble();
        double consumo = km / gasolina;
        System.out.println(decimalFormat.format(consumo)+" km/l");
        scanner.close();

    }
}
