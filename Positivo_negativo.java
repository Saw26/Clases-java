import java.util.Scanner;

public class Positivo_negativo {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número porfa please");
        a = in.nextInt();
        if (a>=0) {
            System.out.println("el número " + a + " es positivo");   
        } else {System.out.println("el número " + a + " es negativo");
            
        } 
    in.close();
    }
    
}
