
import java.text.DecimalFormat;

public class Exerc8 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        int numFuncionario = 25;
        int dinheiro = 100;
        double horas = 5.50;
        double salario = dinheiro * horas;
        System.out.println("NUMBER = "+numFuncionario);
        System.out.println("SALARY = U$ "+decimalFormat.format(salario));



    }
}
