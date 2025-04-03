package estudojava.pratica;

public class Ola2Java {
    public static void main(String[] args) {
        // int, double, float, char, boolean, byte, short, long
        int idade = 10; // -2.1e+9 a 2.1e+9
        long numeroGrande = 10000000000L; // -9.2e+18 a 9.2e+18
        double salarioDouble = 2550; // 1.7e -308 a 1.7e+308
        float salarioFloat = 2500; // 3.4e -038 a 3.4e+038
        byte idadeByte = 10; // -128 a 127
        short idadeShort = 20; // -32.768 a 32.767
        boolean verdadeiro = true; // true ou false
        boolean falso = false; // true ou false
        char caractere = 'A'; // 'A' a 'Z', 'a' a 'z', '0' a '9'

        System.out.println("O valor da idade é " + idade);
        System.out.println(falso);
        System.out.println(verdadeiro);
        System.out.println("O valor do caractere é " + caractere);
        System.out.println("O valor do byte é " + idadeByte);
        System.out.println("O valor do short é " + idadeShort);
        System.out.println("O valor do long é " + numeroGrande);
        System.out.println("O valor do double é " + salarioDouble);
        System.out.println("O valor do float é " + salarioFloat);

    }
}
