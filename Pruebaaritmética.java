package Ejecucion;
import java.util.Scanner;
import Entidades.Aritmetica;

public class Pruebaaritmética {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int b = sc.nextInt();
        
        Aritmetica operacion = new Aritmetica (a, b);
        
        System.out.println("La suma es: " + operacion.Suma());
        System.out.println("El producto es: " + operacion.Producto());
      sc.close();
    }
}
