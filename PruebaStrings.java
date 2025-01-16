package Primitivosyejemplos;
import java.util.Scanner;
public class PruebaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un caracter: ");
        
        String cadenSC = sc.nextLine();
        try {
            int numeroEntero=Integer.parseInt(cadenSC);
            System.out.println("Has introducido un numero entero: " + numeroEntero);
        } catch (NumberFormatException i){
        try {
            float numeroDecimal =Float.parseFloat(cadenSC);
            System.out.println("Has introducido un numero decimal: " + numeroDecimal);
        } catch (NumberFormatException e) {
            System.out.println("Has introducido una cadena: " + cadenSC);
        }
    }
}
}
