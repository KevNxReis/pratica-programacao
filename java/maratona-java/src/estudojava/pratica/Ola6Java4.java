package estudojava.pratica;

public class Ola6Java4 {
    public static void main(String[] args) {
        double car = 60000;
        for (int parcela = 1; parcela <= car; parcela++){
            double valor = car / parcela ;
            if (valor < 1000) {
                break;
            }
                System.out.println("parcela " +parcela+ "R$" +valor);

        }
    }
}
