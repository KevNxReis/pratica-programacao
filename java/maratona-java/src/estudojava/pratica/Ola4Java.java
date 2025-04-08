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

        double ContaCorrente = 200;
        double ContaPoupanca = 10000;
        double Playstation5 = 5000;
        boolean Playstation5Compravel = ContaCorrente > Playstation5
                || ContaPoupanca > Playstation5;
        System.out.println("compravel" + Playstation5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador ++;
        contador --;
        ++ contador;
        -- contador;
        System.out.println(contador);

    }
}