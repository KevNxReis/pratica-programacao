import java.util.Scanner;

public class Exerc65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();
        double [] nums = {num1, num2, num3, num4, num5};
        int pares = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println(pares+" valores pares");
        sc.close();
    }
}
