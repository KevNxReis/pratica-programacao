package estudojava.pratica;

public class Ola6Java5 {
    public static void main(String[] args) {
        double car = 60000;
        for (int parcela = (int) car; parcela >=1; parcela--){
            double total = car/parcela;
            if (total < 1000){
                continue;
            }
            System.out.println("Parcela" + parcela +"R$" + total);
        }
    }
}
