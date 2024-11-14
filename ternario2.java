import java.util.Scanner;

public class ternario2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorabsoluto;
        int n;
        System.out.println("Introduce un número positivo o negativo");
        n = in.nextInt();
            valorabsoluto = n<0 ? -1*n : n;
            System.out.println("El valor absoluto es "+ valorabsoluto);

        in.close();
    }
    
}
