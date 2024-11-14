import java.util.Scanner;

public class mayor_o_igual {
    public static void main(String[] args) {
    
    Scanner in =new Scanner(System.in);
    int n1;
    int n2;
    System.out.println("Introduce un número");
    n1 = in.nextInt();
    System.out.println("Introduce otro número");
    n2 = in.nextInt();
    if (n1==n2) {
        System.out.println(" Son iguales");
    } else {
        if (n1>n2) {
            System.out.println("El número " + n1 + " es mayor que " + n2);
        } else {
            System.out.println(" El número " + n2 + " es mayor que " + n1);
            }
        in.close(); 
            }      
        }
    }
