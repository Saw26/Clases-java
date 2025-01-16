package Ejercicios;
import java.util.Scanner;
public class Ejerciciocadenastring {
    public static void main(String[] args) {
        String cadena = "Juan Rodriguez";
        String email = cadena.trim().toLowerCase().replace(" ", ".") + "@mail.com";
        
        System.out.println("El correo generado es : " + email);
    }
    
}
