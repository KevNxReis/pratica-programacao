import java.util.Scanner;

public class Exerc70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();

        if (entrada % 2 == 0) {
            entrada ++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(entrada);
            entrada += 2;

        }

        sc.close();



    }
}
