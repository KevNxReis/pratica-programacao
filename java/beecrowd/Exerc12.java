import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double pi = 3.14159;
        double triangulo = (A*C)/2;
        double circulo = (C*C)*pi;
        double trapezio = ((A+B)*C)/2;
        double quadrado = B * B;
        double retangulo = A*B;
        System.out.println("TRIANGULO: "+decimalFormat.format(triangulo));
        System.out.println("CIRCULO: "+decimalFormat.format(circulo));
        System.out.println("TRAPEZIO: "+decimalFormat.format(trapezio));
        System.out.println("QUADRADO: "+decimalFormat.format(quadrado));
        System.out.println("RETANGULO: "+decimalFormat.format(retangulo));
        scanner.close();


    }
}
