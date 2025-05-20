import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc38 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        double [] lanche = {4.00,4.50,5.00,2.00,1.50};

        System.out.println("Digite o lanche"+ (lanche));
        double escolha1 = scanner.nextDouble();

        System.out.println("Digite o segundo lanche"+ (lanche));
        double escolha2 = scanner.nextDouble();

        double soma = escolha1 + escolha2;
        System.out.println("TOTAL: R$ "+decimalFormat.format(soma));




        }

    }


