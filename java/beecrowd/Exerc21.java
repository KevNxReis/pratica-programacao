import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        //notas
        int n100 = (int) valor / 100;
        valor = valor % 100;
        int n50 = (int) valor / 50;
        valor = valor % 50;
        int n20 = (int) valor / 20;
        valor = valor % 20;
        int n10 = (int) valor / 10;
        valor = valor % 10;
        int n5 = (int) valor / 5;
        valor = valor % 5;
        int n2 = (int) valor /2;
        valor = valor % 2;
        //moedas
        int n1 = (int) valor / 1;
        valor = valor % 1 * 100;
        int n050 = (int) valor / 50;
        valor = valor % 50;
        int n025 = (int) valor / 25;
        valor = valor % 25;
        int n010 = (int) valor / 10;
        valor = valor % 10;
        int n005 = (int) valor / 5;
        valor = valor % 5;
        int n001 = (int) valor;
        System.out.println("NOTAS:"+"\n"
        +n100+" nota(s) de R$ 100.00"+"\n"
        +n50+" nota(s) de R$ 50.00"+"\n"
        +n20+" nota(s) de R$ 20.00"+"\n"
        +n10+" nota(s) de R$ 10.00"+"\n"
        +n5+" nota(s) de R$ 5.00"+"\n"
        +n2+" nota(s) de R$ 2.00"+"\n"
        +"MOEDAS:"+"\n"
        +n1+" moeda(s) de R$ 1.00"+"\n"
        +n050+" moeda(s) de R$ 0.50"+"\n"
        +n025+" moeda(s) de R$ 0.25"+"\n"
        +n010+" moeda(s) de R$ 0.10"+"\n"
        +n005+" moeda(s) de R$ 0.05"+"\n"
        +n001+" moeda(s) de R$ 0.01");
        scanner.close();
    }
}
