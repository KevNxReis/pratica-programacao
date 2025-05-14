import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int horas = tempo / 3600;
        int minutos = tempo % 3600 / 60;
        int segundos = tempo % 60;
        System.out.println(horas+":"+minutos+":"+segundos);
        scanner.close();

    }
}
