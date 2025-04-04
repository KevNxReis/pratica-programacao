package estudojava.pratica;
/*
Pratica
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salario de <salario> na data <data>.
 */
public class Ola3exercicioJava {
    public static void main(String[] args) {
        String nome = "Kevin";
        String endereco = "Rua Dr.Genir, Bairro Novo Horizonte, Cidade Marabá, Pará";
        double salario = 7000.0;
        String data = "02/05/2025";

        System.out.println("Eu " + nome + ",\n" +
                "morando no endereço " + endereco + ",\n" +
                "confirmo que recebi o salario de " + salario +
                " na data " + data + ".");


    }
}
