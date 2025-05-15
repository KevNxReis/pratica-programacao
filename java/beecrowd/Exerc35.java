import java.util.Scanner;

public class Exerc35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        boolean c1 = (B > C);
        boolean c2 = (D > A);
        boolean c3 = ((C + D) > (A + B));
        boolean c4 = (C >= 0);
        boolean c5 = (D >= 0);
        boolean c6 = (A % 2 ==0);
        if ( c1 && c2 && c3 && c4 && c5 && c6) {
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        scanner.close();
    }
}
