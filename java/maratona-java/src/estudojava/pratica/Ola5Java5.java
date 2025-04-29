package estudojava.pratica;

public class Ola5Java5 {
    public static void main(String[] args) {

        byte dia = 3;
// char, byte, short, int, enum, String
        switch (dia){
            case 1:
                System.out.println("segunda-feira");
                break;
            case 2:
                System.out.println("terça-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("essa opção nao é valida");
                break;

        }

        char sexo = 'M';

        switch (sexo){
            case 'M':
                System.out.println("masculino");
                break;
            case 'F':
                System.out.println("feminino");
                break;
            default:
                System.out.println("opção invalida");
                break;

        }

    }
}
