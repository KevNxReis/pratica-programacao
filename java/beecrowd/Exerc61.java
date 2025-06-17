import java.util.Scanner;

public class Exerc61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia_inicio = sc.nextInt();
        int hora_inicio = sc.nextInt();
        int minuto_inicio = sc.nextInt();
        int segundo_inicio = sc.nextInt();

        int dia_fim = sc.nextInt();
        int hora_fim = sc.nextInt();
        int minuto_fim = sc.nextInt();
        int segundo_fim = sc.nextInt();

        int total_seg_ini = dia_inicio * 24 * 60 * 60;
        total_seg_ini += hora_inicio * 60 * 60;
        total_seg_ini += minuto_inicio * 60;
        total_seg_ini += segundo_inicio * 60;

        int total_seg_fim = dia_fim * 24 * 60 * 60;
        total_seg_fim += hora_fim * 60 * 60;
        total_seg_fim += minuto_fim * 60;
        total_seg_fim += segundo_fim * 60;

        int duracao_seg = total_seg_fim - total_seg_ini;
        int W = duracao_seg / 86400;
        int seg_resto = duracao_seg % 86400;
        int X = seg_resto / 3600;
        int restoh = seg_resto % 3600;
        int Y = restoh / 60;
        int restom = restoh % 60;
        int z = restom % 60;

        System.out.printf(W +" dias(s)"+"\n"+X+" horas(s)"+"\n"
                +Y+" minuto(s)"+"\n"+z+" segundo(s)");
        sc.close();

    }
}
