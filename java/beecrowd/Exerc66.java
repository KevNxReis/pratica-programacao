import java.util.Scanner;

public class Exerc66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();
        double [] nums = {num1, num2, num3, num4, num5};
        double positivos = 0;
        double negativos = 0;
        double impar = 0;
        double par = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positivos++;
                System.out.println(positivos+ " valore(s) positivo(s)");
                break;
            }
            if (nums[i] > 0) {
                negativos++;
                System.out.println(negativos+ " valore(s) negativo(s)");
                break;
            }
            if (nums[i] % 2 == 0) {
                par++;
                System.out.println(par+ " valore(s) par(es)");
                break;
            }
            if (nums[i] % 2 != 0) {
                impar++;
                System.out.println(impar+ " valore(s) impar(es)");
                break;
            }
        }
        sc.close();
    }
}
