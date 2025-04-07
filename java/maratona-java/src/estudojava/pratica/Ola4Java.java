package estudojava.pratica;

public class Ola4Java {
    public static void main(String[] args) {

        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println("Resultado da soma: " + resultado);
        System.out.println();

        //%
        int resto = 20 % 2;
        System.out.println("Resto da divisão: " + resto);
        System.out.println();

        // < > , <= >= , == (comparando), != (diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorOuIgualQueVinte = 10 == 20;
        boolean isDezMenorOuIgualQueVinte = 10 <= 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("É menor que: " + isDezMenorQueVinte);
        System.out.println("É maior que: " + isDezMaiorQueVinte);
        System.out.println("É menor ou igual que: " + isDezMenorOuIgualQueVinte);
        System.out.println("É maior ou igual que: " + isDezMaiorOuIgualQueVinte);
        System.out.println("É diferente de: " + isDezDiferenteDeVinte);
        System.out.println();

        // && (e) || (ou) ! (não)
        boolean isDezMaiorQueVinteEIgualADez = (10 > 20) && (10 == 10);
        boolean isDezMaiorQueVinteOuIgualADez = (10 > 20) || (10 == 10);
        boolean isDezMaiorQueVinteOuIgualADezNegado = !(10 > 20) || (10 == 10);
        System.out.println("É maior que e igual a: " + isDezMaiorQueVinteEIgualADez);
        System.out.println("É maior que ou igual a: " + isDezMaiorQueVinteOuIgualADez);
        System.out.println("É maior que ou igual a negado: " + isDezMaiorQueVinteOuIgualADezNegado);
    }
}
