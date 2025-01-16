/*En este ejercicio vamos a hacer una array de paginas de libros con un método*/

package PruebasArrays;
import java.util.Scanner;
public class Arrays1Ejercicio {
    
    
    /*este es el método*/
    static int calculaTotal(int[] arraysdepaginas) {
        int totalPaginas = 0;
        for (int i = 0;i < arraysdepaginas.length; i++){
            totalPaginas = totalPaginas + arraysdepaginas[i];
        }
       return totalPaginas;
    }
    
      /*otro metodo*/
    static boolean mayorQue (int num1, int num2) {
       boolean resultado;
       if (num1 > num2) {
       resultado = true;
       } else {
           resultado = false;
       }
       return resultado;
    }
    /*metodo para calcular el máximo */
    static int calcularMaximo(int[] arraysdepaginas){
        int maximo = -1;
       for (int i=0; i<arraysdepaginas.length; i++) {
        if (!mayorQue(maximo, arraysdepaginas[i])) {
          maximo = arraysdepaginas[i];
        }    
    }
       return maximo;
    }
    
    /*esto es el main*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numLibros;
    
        System.out.print("Introduce el numero de libros: ");
        numLibros = sc.nextInt();
        
      
      while (numLibros == 0) {
          System.out.println("El numero de libros no puede ser 0!, Introduce numero de libros: ");
          numLibros = sc.nextInt();
      }
      
      int[] paginasLibros = new int [numLibros]; /*esto es la artay*/
      
      
      for (int i = 0; i < paginasLibros.length; i++){
          System.out.println("Introduce paginas del libro "  + (i+1) + ": "); /*esto es el recorrido*/
            paginasLibros[i] = sc.nextInt();
      }

     System.out.println("Total de paginas: " + calculaTotal(paginasLibros));
     System.out.println("El valor del mayor numero de paginas es: " +calcularMaximo(paginasLibros));
        sc.close();
        }        
     } 
 
   




