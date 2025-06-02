import java.util.Scanner;

public class Exerc49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada1 = scanner.nextLine();
        String entrada2 = scanner.nextLine();
        String entrada3 = scanner.nextLine();

        String resultado = "";

        if (entrada1.equals("vertebrado")){
            if (entrada2.equals("ave")){
                if (entrada3.equals("carnivoro")){
                    resultado = "aguia";
                }else if (entrada3.equals("onivoro")){
                    resultado = "pomba";
                }
            }else if (entrada2.equals("mamifero")){
                if (entrada3.equals("onivoro")){
                    resultado = "homem";
                }else if (entrada3.equals("herbivoro")){
                    resultado = "vaca";
                }
            }
        }else if (entrada1.equals("invertebrado")){
            if (entrada2.equals("inseto")){
                if (entrada3.equals("hematofago")){
                    resultado = "pulga";
                }else if (entrada3.equals("herbivoro")){
                    resultado = "lagarta";
                }
            }else if (entrada2.equals("anelideo")){
                if (entrada3.equals("hematofago")){
                    resultado = "sanguessuga";
                }else if (entrada3.equals("onivoro")){
                    resultado = "minhoca";
                }
            }
        }
        System.out.println(resultado);
        scanner.close();

    }
}
