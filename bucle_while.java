import java.util.Scanner;
public class bucle_while {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        boolean esPar;
         boolean esPositivo;
        System.out.println("Introduce un número");
            a = in.nextInt();
            while (a!=0) {
                esPar = a%2==0 ? true : false;

                esPositivo = a >=0 ? true : false;

                System.out.println(" el número " + a + " ¿Es par?  " + esPar + " ¿es positivo? " + esPositivo);
                System.out.println("El cuadrado de " + a + " es " + a*a);
                System.out.println(" Introduce otro número ");
                a = in.nextInt();
            }
            while (a==0) {
                System.out.println("El número es 0 y no se puede hacer nada con el, salimos del programa \n" + "adios ");
                break;
            }
        in.close();
    }
    
}
        