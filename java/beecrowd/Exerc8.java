import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        int numFuncionario = scanner.nextInt();
        int horas = scanner.nextInt();
        double dinheiro = scanner.nextDouble();
        double salario = dinheiro * horas;
        System.out.println("NUMBER = "+numFuncionario);
        System.out.println("SALARY = U$ "+decimalFormat.format(salario));
    }
}
