

import java.util.Scanner;

public class palabralarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos las 5 palabras
        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.nextLine();
        
        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        
        System.out.print("Ingresa la tercera palabra: ");
        String palabra3 = scanner.nextLine();
        
        System.out.print("Ingresa la cuarta palabra: ");
        String palabra4 = scanner.nextLine();
        
        System.out.print("Ingresa la quinta palabra: ");
        String palabra5 = scanner.nextLine();
        
        // Comparar las longitudes de las palabras
        String palabraMasLarga = palabra1;
        
        if (palabra2.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra2;
        }
        if (palabra3.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra3;
        }
        if (palabra4.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra4;
        }
        if (palabra5.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra5;
        }
        
        // Mostramos la palabra más larga
        System.out.println("La palabra más larga es: " + palabraMasLarga);
        
        scanner.close();
    }
}