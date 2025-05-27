import java.util.Scanner;

public class Exerc47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hini = sc.nextInt();
        int mini = sc.nextInt();
        int hfim = sc.nextInt();
        int mfim = sc.nextInt();
        int dia = 24;
        int min = 60;
        int htemp = 0;
        int mtemp = 0;
        if (hini > hfim || (hini == hfim && mini > mfim)) {
            htemp = (dia - hini) + hfim;
        } else {
            htemp = hfim - hini;
        }
        if (mini > mfim) {
            htemp -= 1;
            mtemp = (min - mini) + mfim;
        } else {
            mtemp = mfim - mini;
        }
        if (hini == hfim && mini == mfim) {
            htemp = 24;
            mtemp = 0;
        }
        System.out.println("O JOGO DUROU " + htemp + " HORA(S) E " + mtemp + " MINUTO(S)");
        sc.close();
    }
}