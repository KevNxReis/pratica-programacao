package estudojava.pratica;

public class Java8java {
    public static void main(String[] args) {
        int [][] mes = new int[3][4];
        mes[0][0] = 5;
        mes[0][1] = 10;
        mes[0][2] = 15;
        mes[0][3] = 20;

        mes[1][0] = 3;
        mes[1][1] = 6;
        mes[1][2] = 9;
        mes[1][3] = 12;

        mes[2][0] = 2;
        mes[2][1] = 4;
        mes[2][2] = 6;
        mes[2][3] = 8;

        for (int i = 0; i < mes.length ; i++) {
            for (int j = 0; j < mes[i].length; j++) {
                System.out.println(mes[i][j]);
            }

        }
    }
}
