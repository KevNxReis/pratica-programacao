import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.0");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 4;
        double peso4 = 1;
        double resultpeso = ((num1 * peso1)+(num2 * peso2)+(num3 * peso3)+(num4 * peso4));
        double media = (resultpeso/(peso1+peso2+peso3+peso4));
        System.out.println("Media: "+dec.format(media));
        if (media >= 7){
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.println("Aluno reprovado.");
        }else if(media >= 5 || media < 6.9){
            System.out.println("Aluno em exame.");
            double notaexam = scan.nextDouble();
            System.out.println("Nota do exame: "+dec.format(notaexam));
            double mediafinal = (notaexam+media)/2;
            if (mediafinal >= 5){
                System.out.println("Aluno aprovado."+"\n"+"Media final: "+dec.format(mediafinal));
            }else{
                System.out.println("Aluno reprovado."+"\n"+"Media final: "+dec.format(mediafinal));
            }


        }


    }
}
