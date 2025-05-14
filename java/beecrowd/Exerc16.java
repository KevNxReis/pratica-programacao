import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Xkm = 60;
        int Ykm = 90;
        int diferencavelo = Math.abs(Xkm - Ykm);
        int distancia = scanner.nextInt();
        int tempo = (distancia * 60) / diferencavelo;
        System.out.println(tempo+" minutos");
        scanner.close();


    }
}
