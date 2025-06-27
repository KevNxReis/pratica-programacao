import java.util.Scanner;

public class Exerc66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int[] nums = {num1, num2, num3, num4, num5};
        int positivos = 0;
        int negativos = 0;
        int impar = 0;
        int par = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positivos++;
            } else if (nums[i] < 0) {
                negativos++;
            }
            if (nums[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println(par + " valore(s) par(es)");
        System.out.println(impar + " valore(s) impar(es)");
        System.out.println(positivos + " valore(s) positivo(s)");
        System.out.println(negativos + " valore(s) negativo(s)");

        sc.close();
    }
}