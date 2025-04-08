package estudojava.pratica;

public class Ola5Java2 {
    public static void main(String[] args) {

        int idade = 17;

        if (idade < 15){
            System.out.println("Categoria infatil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
    }
}
