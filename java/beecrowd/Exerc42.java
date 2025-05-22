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
        if (a > b){
            a = num2;
            b = num1;
        }
        if (b > c){
            b = num3;
            c = num2;
        }
        if (a > b){
            a = num3;
            b = num2;
        }
        System.out.println(a+" "+b+" "+c);



    }

}
