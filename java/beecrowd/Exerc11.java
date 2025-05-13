import java.text.DecimalFormat;
import java.util.Scanner;


public class Exerc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double R = Math.pow(raio,3);
        double volume = (4/3.0) * pi * R;
        System.out.println("VOLUME = "+decimalFormat.format(volume));
        scanner.close();



    }
}
