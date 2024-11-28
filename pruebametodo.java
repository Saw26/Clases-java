import java.util.Scanner;
public class pruebametodo {
    static int suma(int a, int b) {
        return a + b;
    }
    static int producto(int a, int b) {
        return a * b;
    }

    static boolean esVocal(char letra) {
        boolean resultado;

        if (letra == 'a' || letra == 'e' ||letra == 'i' || letra == 'o' || letra == 'u' ) {
            resultado= true;
        } else {
            resultado=false;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int n1;
        int n2;
        char caracter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        caracter = sc.next().charAt(0);
        System.out.println("Introduce el primer número");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        n2 = sc.nextInt();
        if (esVocal(caracter) == true) {
            System.out.println("El resultado es = " + caracter  + " , " + n1 + " , " + n2 + " = " + producto(n1,n2));
            
        } else {
            System.out.println("El resultado es = " + caracter  + " , " + n1 + " , " + n2 + " = " + suma(n1,n2));
            
        }
        sc.close();
    }
}