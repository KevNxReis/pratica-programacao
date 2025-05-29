import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        double salario = scanner.nextDouble();

        double porcentual = 0;
        double reajuste = 0;

        if (salario >= 0 && salario <= 400.00) {
            porcentual = 15;
            reajuste = (porcentual / 100) * salario;
        } else if (salario >= 400.01 && salario <= 800.00) {
            porcentual = 12;
            reajuste = (porcentual / 100) * salario;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            porcentual = 10;
            reajuste = (porcentual / 100) * salario;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            porcentual = 7;
            reajuste = (porcentual / 100) * salario;
        } else if (salario > 2000.00) {
            porcentual = 4;
            reajuste = (porcentual / 100) * salario;
        }

        double total = salario + reajuste;

        System.out.println("Novo salario: " + decimal.format(total) + "\n" +
                "Reajuste ganho: " + decimal.format(reajuste) + "\n" +
                "Em porcentual: " + (int) porcentual + " %");

        scanner.close();
    }
}