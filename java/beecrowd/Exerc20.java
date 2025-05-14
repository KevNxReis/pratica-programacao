import java.util.Scanner;
public class Exerc20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idadedias = scanner.nextInt();
        int ano = idadedias / 365;
        int mes = idadedias % 365 / 30;
        int dia = idadedias % 30;
        System.out.println(ano+" ano(s)"+"\n"
                +mes+" mes(es)"+"\n"
                +dia+" dia(es)");
        scanner.close();

    }
}
