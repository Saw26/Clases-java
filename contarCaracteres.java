package Ejecucion;
import java.util.Scanner;

public class contarCaracteres {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada por consola
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();
        
        // Pedir al usuario el carácter que desea contar
        System.out.print("Ingresa el caracter que deseas contar: ");
        char caracter = scanner.next().charAt(0); // Solo lee el primer carácter

        // Variable para contar las ocurrencias
        int contador = 0;

        // Recorrer la cadena y contar las veces que aparece el carácter
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El caracter '" + caracter + "' aparece " + contador + " veces.");
        
        scanner.close();
    }
}
