import java.util.Scanner;

public class Calcularareacuadrado {
    public static void main(String[] args) {
        Scanner an = new Scanner (System.in);

        System.out.println("Introduce el lado del cuadrado: ");
        int lado = an.nextInt();

        int area = lado*lado;

        System.out.println("El area del cuadrado es: " + area);

        an.close();
        }
}
