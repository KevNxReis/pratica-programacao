import java.util.Scanner;

public class Exerc42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int a = num1;
        int b = num2;
        int c = num3;
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a+"\n"+b+"\n"+c+"\n");
        System.out.println(num1+"\n"+num2+"\n"+num3);
        sc.close();
    }
}