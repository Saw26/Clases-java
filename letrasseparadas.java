
import java.util.Scanner;

public class letrasseparadas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        
        // Separar la palabra utilizando un espacio entre cada letra
        String resultado = String.join(" ", palabra.split(""));
        
        // Mostrar la palabra separada por espacios
        System.out.println("Palabra separada: " + resultado);
        
        // Cerrar el scanner
        scanner.close();
    }
}
