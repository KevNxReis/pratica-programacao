import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 -x1, 2)+ Math.pow(y2-y1, 2));
        System.out.println(decimalFormat.format(distancia));
        scanner.close();


    }
}
