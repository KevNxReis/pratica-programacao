import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String nome = scanner.next();
        double salariofixo = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double comissao = vendas * 0.15;
        double total = comissao + salariofixo;
        System.out.println("TOTAL = R$ "+decimalFormat.format(total));

    }
}
