import java.util.Scanner;

public class condicionswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Introduce un entero");
        a = in.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 3:
                System.out.println("El valor de x está entre 1 y 3, concrétamente es " + a);
                break;
            case 4:
            case 5:
                System.out.println("El valor de x está entre 4 y 5, concrétamente es " + a);
                break;
            case 6:
                System.out.println("El valor de X es 6");
            default:
                System.out.println("El valor de X no está entre 1 y 6, concrétamente es " + a);
        }
in.close();
    }
    
}
