import java.util.Scanner;
import java.util.Random;

public class bucle_do_while {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Random rn = new Random();
        int num1, num2;
        int resultado;
        int numerodeoperaciones=0;
        do {
            num1 = rn.nextInt(100)+1;
            num2 = rn.nextInt(100)+1;
            System.out.println(num1+ " + " + num2 + " =");
            resultado=in.nextInt();
            numerodeoperaciones++;
        } while (resultado== (num1 + num2));
        System.out.println("ha conseguido realizar: " + (numerodeoperaciones -1) + " sumas consecutivas");
        

        in.close();
    }

}
