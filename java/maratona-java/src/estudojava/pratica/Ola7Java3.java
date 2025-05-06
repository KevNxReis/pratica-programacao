package estudojava.pratica;

public class Ola7Java3 {
    public static void main(String[] args) {
        int [] numero = {23,24,25,70,90};
        for (int i = 0; i < numero.length; i++){
            if ( i == 0 || i == 1 || i == 3)
            System.out.println(numero[i]);
        }
    }
}
