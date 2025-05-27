import java.util.Scanner;

public class Exerc45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double A = n1;
        double B = n2;
        double C = n3;
        double temp;
        if (0<A && 0<B && 0<C) {
        }else{

        }
        if (A < B) {
            temp = B;
            B = A;
            A = temp;
        }
        if (B < C) {
            temp = C;
            C = B;
            B = temp;
        }
        if (C < A) {
            temp = A;
            A = C;
            C = temp;
        }
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        double a1 = Math.pow(A, 2);
        double b1 = Math.pow(B, 2);
        double c1 = Math.pow(C, 2);
        if (a1 == (b1 + c1)) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (a1 > (b1 + c1)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (a1 < (b1 + c1)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C && C == A) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (A != B && B == C && C != A || A != B && B != C && C == A ||
        A == B && B != C && C != A) {
            System.out.println("TRIANGULO ISOSCELES");
        }
        sc.close();


    }
}
