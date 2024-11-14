
import java.util.Scanner;

public class cantidaddigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Ingrese un número:");
        a = Math.abs(sc.nextInt()); // leo el número y convierto a valor absoluto

        System.out.println("El número tiene " + (a == 0 ? 1 : (int)Math.log10(a) + 1) + " dígitos.");
        
        sc.close();
    }
}

    

