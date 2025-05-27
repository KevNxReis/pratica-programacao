import java.util.Scanner;

public class Exerc46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horainicio = sc.nextInt();
        int horafinal = sc.nextInt();
        int dia = 24;
        if (horainicio > horafinal) {
            int duracao = (dia - horainicio) + horafinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }else if (horainicio < horafinal) {
            int duracao = (horafinal - horainicio);
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }else if (horainicio == horafinal) {
            System.out.println("O JOGO DUROU "+ dia +" HORA(S)");
        }
        sc.close();
    }
}
