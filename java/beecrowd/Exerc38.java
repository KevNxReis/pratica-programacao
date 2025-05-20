import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc38 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        double[] precos = {0.0, 4.00, 4.50, 5.00, 2.00, 1.50};
        System.out.println("Digite o código do lanche (1-5):");
        int codigo = scanner.nextInt();
        if (codigo >= 1 && codigo <= 5) {
            System.out.println("Digite a quantidade:");
            int quantidade = scanner.nextInt();
            double total = precos[codigo] * quantidade;
            System.out.println("Total: R$ " + decimalFormat.format(total));
        } else {
            System.out.println("Código inválido!");
        }
        scanner.close();
    }
}