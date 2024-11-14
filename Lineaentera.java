import java.util.Scanner;

public class Lineaentera {
    public static void main(String[] args) {
        String nombre;
        System.out.println("Introduce un nombre: ");
        Scanner entrada =new Scanner(System.in);
        nombre = entrada.nextLine();
        System.out.println("Hola," + nombre);
        entrada.close();
    }
}


    

