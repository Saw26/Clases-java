import java.util.Scanner;
public class Bucleswhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de Asteriscos");
        int lado = sc.nextInt();
        int i=0;
        while (i<lado) {
           /* int j=0;
            while (j<lado) {
             System.out.print("*");
             j++;
        }
            System.out.println("");   */
            filaAsteriscos(lado);
            i++;
        }
        System.out.println("");  
    }
    
    // metodos//
     static void filaAsteriscos(int numeroAsteriscos) {
        int j=0;
        while(j<numeroAsteriscos) {
            System.out.print("*");
            j++;
        }
         System.out.println("");
     }
}
