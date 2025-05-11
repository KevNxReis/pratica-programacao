import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc5Java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        double nota, soma = 0.0;
        int count = 0;

        while (count < 2) {
            nota = scanner.nextDouble();
            if (nota >= 0.0 && nota <= 10.0) {
                soma += nota;
                count++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2.0;
        System.out.println("media = " + df.format(media));
        scanner.close();
    }
}
