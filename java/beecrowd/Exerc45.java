import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Exerc45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        if (!(A>0 && B>0 && C>0)) {
            System.exit(1);
        }
        Double [] valores = {A,B,C};
        Arrays.sort(valores, Collections.reverseOrder());
        A = valores[0];
        B = valores[1];
        C = valores[2];
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
            System.exit(1);
        }
        double a1 = Math.pow(A, 2);
        double b1 = Math.pow(B, 2);
        double c1 = Math.pow(C, 2);
        if (a1 == (b1 + c1)) {
            System.out.println("TRIANGULO RETANGULO");
        }else if (a1 > (b1 + c1)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if (a1 < (b1 + c1)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C ) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (A != B && B == C && C != A || A != B && B != C && C == A ||
        A == B && B != C && C != A) {
            System.out.println("TRIANGULO ISOSCELES");
        }
        sc.close();


    }
}
