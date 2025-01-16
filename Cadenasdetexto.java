package Primitivosyejemplos;

/* Vamos a utilizar los métodos: trim (sin espacios); tolowercase (minusculas); 
            replace (reemplazar un caracter por otro); length (longitud)  */

public class Cadenasdetexto {
    public static void main(String[] args) {
        
    String cadenaEjemplo = "      Don Quijote de La Mancha    ";
   
        System.out.println(cadenaEjemplo.trim()); 
        System.out.println(cadenaEjemplo.toLowerCase());
        System.out.println(cadenaEjemplo.replace(' ', '-'));
        System.out.println(cadenaEjemplo.length() + " Caracteres en total");
    
}
}
