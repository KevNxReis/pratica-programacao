import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = scanner.nextDouble();
        double imposto1 = 80.00;
        double imposto2 = 270.00;
        switch (salario) {
            case salario>=0.00 && salario<=2000.00:
                System.out.println("Isento");
                break;
            case salario>=2000.01 && salario<=3000.00:
                calculo = salario;
                System.out.println(calculo);
                break;
            case salario>=3000.01 && salario<=4500.00:
                System.out.println(calculo);
                break;
            case salario>=4500.01:
                calculo = salario;
                System.out.println(calculo);
                break;
        }
    }
}
