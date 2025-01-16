package Arrays;
import java.util.Scanner;
public class PruebaArrays {
    
    
    public static void main(String[] args) {
        
        
        // creación de arrays cuando NO sabemos los valores (crea una array vacia con 8 huecos/elementos)
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de notas: ");
        int numeroNotas = sc.nextInt();
        int[] listanotas = new int[numeroNotas];
        for(int i = 0; i<numeroNotas; i++) {
            System.out.println("Introduce nota " + (i+1) + ":");
            listanotas[i] = sc.nextInt();
        } 
        int maximo = listanotas[0];
       int i =0;
        while (maximo<listanotas[i]) {
            if (maximo<listanotas[i]) {
                maximo = listanotas[i];
            }
            i++;
        }
        
        
        /*for (int i =0; i <numeroNotas; i++) {
            if (maximo<listanotas[i]) {
                maximo = listanotas[i];
            }
        }*/
        System.out.println("La mayor nota es: " + maximo);
        System.out.println("La nota mayor es: " + calcularMaximo(listanotas));
       
        
        /*
        // Creación de arrays cuando SI sabemos los valores
        
        int[] listanotasdefinitivas = new int[] {7, 5, 9, 10, 6, 6, 8, 9};
        
       for (int i=0;i<listanotasdefinitivas.length;i++) {
           System.out.println("Nota de la asignatura numero " + (i+1) + ":" + " " + listanotasdefinitivas[i]); 
       } */
        
        
        
        
    }
     static int calcularMaximo(int[] listanotas){
        int maximo = listanotas[0];
       for (int i=0; i<listanotas.length; i++) {
         if (maximo<listanotas[i]) {
                maximo = listanotas[i];
            }
    }
       return maximo;
    }
}
