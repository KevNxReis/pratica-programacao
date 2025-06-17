import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc64 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();
        double num6 = sc.nextDouble();
        double[] nums = {num1, num2, num3, num4, num5, num6};
        int positivos = 0;
        double soma = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positivos++;
                soma += nums[i];
            }
        }

        System.out.println(positivos + " valores positivos");
        if (positivos > 0) {
            double media = soma / positivos;
            System.out.println(df.format(media));
        }

        sc.close();
    }
}