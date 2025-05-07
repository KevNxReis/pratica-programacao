package estudojava.pratica;

public class OLa8Java2 {
    public static void main(String[] args) {

        int [][] exem = new int [3][];
        //int [][] exem = {{10,9,8},{20,19,18},{30,29,28}};
        exem [0] = new int []{1,2,3};
        exem [1] = new int [6];
        exem [2] = new int []{10,11,12};

        for (int[] exem1 : exem){
            System.out.println("------------------------------");
            for (int result : exem1){
                System.out.println(result);
            }
        }
    }
}
