package estudojava.pratica;

public class Ola7Java2 {
    public static void main(String[] args) {
        // byte, short, int, long, float, e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String [] nomes = new String [5];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Charuto";
        nomes[3] = "Luffymose";
        nomes[4] = "Ichigo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
