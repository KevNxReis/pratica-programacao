import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        int tviagem = scanner.nextInt();
        int vmedia = scanner.nextInt();

        double mediavelo = (tviagem * vmedia)/12.0;

        System.out.println(decimalFormat.format(mediavelo));

        scanner.close();





    }
}
