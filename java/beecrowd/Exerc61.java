import java.util.Scanner;

public class Exerc61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.next();
        int dia_inicio = sc.nextInt();

        int hora_inicio = sc.nextInt();
        sc.next();
        int minuto_inicio = sc.nextInt();
        sc.next();
        int segundo_inicio = sc.nextInt();

        sc.next();
        int dia_fim = sc.nextInt();

        int hora_fim = sc.nextInt();
        sc.next();
        int minuto_fim = sc.nextInt();
        sc.next();
        int segundo_fim = sc.nextInt();

        long total_seg_ini = dia_inicio * 86400;
        total_seg_ini += hora_inicio * 3600;
        total_seg_ini += minuto_inicio * 60;
        total_seg_ini += segundo_inicio;

        long total_seg_fim = dia_fim * 86400;
        total_seg_fim += hora_fim * 3600;
        total_seg_fim += minuto_fim * 60;
        total_seg_fim += segundo_fim;

        long duracao_seg = total_seg_fim - total_seg_ini;

        long W = duracao_seg / 86400;
        long seg_resto = duracao_seg % 86400;
        long X = seg_resto / 3600;
        long restoh = seg_resto % 3600;
        long Y = restoh / 60;
        long z = restoh % 60;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(z + " segundo(s)");

        sc.close();
    }
}