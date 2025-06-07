import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = scanner.nextDouble();
        double imposto1 = 80.00;
        double imposto2 = 270.00;
        double calculo = 0;
        double imposto = 0;

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            calculo = (salario - 2000.00) * 0.08;
            System.out.println("R$ " + df.format(calculo));
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            calculo = (salario - 3000.00) * 0.18;
            double valor = calculo + imposto1;
            System.out.println("R$ " + df.format(valor));
        } else if (salario > 4500.00) {
            calculo = (salario - 4500.00) * 0.28;
            imposto = calculo + imposto1 + imposto2;
            System.out.println("R$ " + df.format(imposto));
        }

        scanner.close();
    }
}