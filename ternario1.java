import java.util.Scanner;

public class ternario1 {
    public static void main(String[] args) {
        int n;
        int valorabsoluto;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número positivo o negativo");
        n =in.nextInt();
         valorabsoluto = Math.abs(n);
        System.out.println("El valor absoluto es "+ valorabsoluto);
        
        in.close();
    }
    
}
