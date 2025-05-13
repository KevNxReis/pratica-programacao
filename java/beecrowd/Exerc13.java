import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int sub = A - B;
        int m = (A + B + sub)/2;
        int sub2 = C - m;
        int Maior = (C + m + sub2)/2;
        System.out.println(Maior+" eh o maior");
        scanner.close();
    }
}
