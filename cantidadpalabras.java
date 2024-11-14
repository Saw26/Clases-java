
import java.util.Scanner;

public class cantidadpalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine().trim();
        
        int cantidadPalabras = texto.isEmpty() ? 0 : 1;
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ' && texto.charAt(i + 1) != ' ') {
                cantidadPalabras++;
            }
        }
        
        System.out.println("La cantidad de palabras es: " + cantidadPalabras);
        sc.close();
    }
}