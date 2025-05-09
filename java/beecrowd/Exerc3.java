import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = Math.pow(raio,2) * pi;
        System.out.println("A="+decimalFormat.format(area));
        scanner.close();
    }
}
