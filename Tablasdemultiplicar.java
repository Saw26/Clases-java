import java.util.Scanner;

public class Tablasdemultiplicar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tabla;
        int resultado;

        System.out.println("Introduce un número: ");
        tabla = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
            entrada.close();
        }

    }
}
