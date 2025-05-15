import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        boolean c1 = A != 0;
        double delta = Math.pow(B,2) -4*A*C;
        boolean c2 = delta >= 0;
        if (c1 && c2){
            double x1 = (-B + Math.sqrt(delta)) / (2*A);
            double x2 = (-B - Math.sqrt(delta)) / (2*A);
            System.out.println("R1 = "+decimalFormat.format(x1)+"\n"+"R2 = "+decimalFormat.format(x2));

        }else{
            System.out.println("Impossivel calcular");
        }
        scanner.close();

    }
}
