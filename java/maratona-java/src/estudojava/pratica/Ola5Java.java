package estudojava.pratica;

public class Ola5Java {
    public static void main(String[] args) {

        int idade = 20;
        //if so executa se for true
        if(idade >= 18){
            System.out.println("Pode comprar bebida alcoolica");}
        if (idade < 18){
            System.out.println("nao pode comprar bebida");}

        int dinheiro = 100;
        int valorIngresso = 100;
        if (dinheiro >= valorIngresso) {
            System.out.println("pode comprar ingresso");}
        else{
            System.out.println("dinheiro insuficiente");}

    }
}
