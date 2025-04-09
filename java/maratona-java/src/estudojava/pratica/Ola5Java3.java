package estudojava.pratica;

public class Ola5Java3 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar =  " Vou doar 500 para DevDojo";
        String mensagemNaoDoar = " Ainda nao tenho o suficiente para doar";
        // (condicao) ? (se for true) : (se for false)
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}