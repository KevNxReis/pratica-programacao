import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc10 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        int codigopeca1 = scanner.nextInt();
        int qpecas = scanner.nextInt();
        double valorp1 = scanner.nextDouble();
        int codigopeca2 = scanner.nextInt();
        int qpecas2 = scanner.nextInt();
        double valorp2 = scanner.nextDouble();
        double total = (valorp1*qpecas) + (valorp2*qpecas2);
        System.out.println("VALOR A PAGAR: R$ "+decimalFormat.format(total));
        scanner.close();

    }
}
