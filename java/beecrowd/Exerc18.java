
import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int n100 = money / 100;
        int sobra100 = money - (n100 * 100);
        int n50 = sobra100 / 50;
        int sobra50 = sobra100 - (n50 * 50);
        int n20 = sobra50 / 20;
        int sobra20 = sobra50 - (n20 * 20);
        int n10 = sobra20 / 10;
        int sobra10 = sobra20 - (n10 * 10);
        int n5 = sobra10 / 5;
        int sobra5 = sobra10 - (n5 * 5);
        int n2 = sobra5 / 2;
        int sobra2 = sobra5 - (n2 * 2);
        int n1 = sobra2 / 1;
        System.out.println(money+"\n"+n100+" nota(s) de R$ 100,00"
        +"\n"+n50+" nota(s) de R$ 50,00"
        +"\n"+n20+" nota(s) de R$ 20,00"
        +"\n"+n10+" nota(s) de R$ 10,00"
        +"\n"+n5+" nota(s) de R$ 5,00"
        +"\n"+n2+" nota(s) de R$ 2,00"
        +"\n"+n1+" nota(s) de R$ 1,00");
        scanner.close();




    }
}
