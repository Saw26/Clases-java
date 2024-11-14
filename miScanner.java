import java.util.Scanner;

public class miScanner {
    public static void main(String[] args) {
        String nombre;

        System.out.println("Introduzca el nombre de su perro: ");
        Scanner in = new Scanner(System.in);
        nombre = in.nextLine();

        System.out.println("Hola "+nombre+" ¿quien es un perrito bueno?");
        in.close();
    }
}
