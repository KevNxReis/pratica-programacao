package estudojava.pratica;

public class Ola5java4 {
    public static void main(String[] args) {
        double salarioAnual = 50000;
        double primeiroImposto = 9.70 / 100;
        double segundoImposto = 37.35 / 100;
        double terceiroImposto = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiroImposto;
        } else if (salarioAnual >= 34712 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundoImposto;
        } else {
            valorImposto = salarioAnual * terceiroImposto;
        }
        System.out.println("O valor do imposto é: " + valorImposto);


    }
}
