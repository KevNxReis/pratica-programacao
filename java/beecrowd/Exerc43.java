import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        if (A + B > C && A + C > B && B + C > A) {
            double perimetro = A + B + C;
            System.out.println("Perimetro = " + df.format(perimetro));
        } else {
            double area = ((A + B) * C) / 2;
            System.out.println("Area = " + df.format(area));
        }
        sc.close();
    }
}