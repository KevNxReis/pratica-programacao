import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        //notas
        double n100 = valor / 100;
        double n50 = valor % 100 / 50;
        double n20 = valor % 50 / 20;
        double n10 = valor % 20 / 10;
        double n5 = valor % 10/ 5;
        double n2 = valor % 5/ 2;
        System.out.println(n2);
        //moedas
        double n1 = valor / 100;
        double n050 = valor / 100;
        double n025 = valor / 100;
        double n010 = valor / 100;
        double n005 = valor / 100;
        double n001 = valor / 100;
    }
}
