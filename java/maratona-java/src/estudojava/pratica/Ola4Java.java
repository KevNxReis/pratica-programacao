package estudojava.pratica;

public class Ola4Java {
    public static void main(String[] args) {

        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println("Resultado da soma: " + resultado);
        System.out.println();

        int resto = 20 % 2;
        System.out.println("Resto da divisão: " + resto);
        System.out.println();

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("É menor que: " + isDezMenorQueVinte);
        System.out.println("É maior que: " + isDezMaiorQueVinte);
        System.out.println("É diferente de: " + isDezDiferenteDeVinte);
        System.out.println();

        boolean isDezMaiorQueVinteEIgualADez = (10 > 20) && (10 == 10);
        boolean isDezMaiorQueVinteOuIgualADez = (10 > 20) || (10 == 10);
        System.out.println("É maior que e igual a: " + isDezMaiorQueVinteEIgualADez);
        System.out.println("É maior que ou igual a: " + isDezMaiorQueVinteOuIgualADez);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPrecoPlaystation5 = 5000; 
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPrecoPlaystation5
                || valorTotalContaPoupanca > valorPrecoPlaystation5;
        System.out.println("É maior que ou igual a: " + isPlaystation5Compravel);
    }
}