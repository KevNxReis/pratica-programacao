import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int m = (A + B +Math.abs(A-B))/2;
        int Maior = (C + m+Math.abs(C-m))/2;
        System.out.println(Maior+" eh o maior");
        scanner.close();
    }
}
