package PruebasArrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numLibros;
    
        System.out.print("Introduce el numero de libros: ");
        numLibros = sc.nextInt();
        
      
      while (numLibros == 0) {
          System.out.println("El numero de libros no puede ser 0!, Introduce numero de libros: ");
          numLibros = sc.nextInt();
      }
      
      /* este for es para no tener que estar haciendo todo el código de abajo con los prints que 
      a veces es un coñazo y son muchos, con 1 solo bucle se hace*/
      
      int[] paginasLibros = new int [numLibros];
      
      
      for (int i = 0; i < paginasLibros.length; i++){
          System.out.println("Introduce paginas del libro "  + (i+1) + ": ");
            paginasLibros[i] = sc.nextInt();
      }
        
       /* System.out.println("Introduce paginas del libro 1: ");
        paginasLibros[0] = sc.nextInt();
        System.out.println("Introduce paginas del libro 2: ");
        paginasLibros[1] = sc.nextInt();
        System.out.println("Introduce paginas del libro 3: ");
        paginasLibros[2] = sc.nextInt(); */
        
        int paginastotales =0; /*variable temporal, hace de contador para que vaya guardando datos y sumando*/
        
        for (int i=0; i<paginasLibros.length; i++) {
            System.out.println("paginas libro " + (i+1) + ": " + paginasLibros[i]);
            paginastotales = paginastotales + paginasLibros[i];
        }
        
        System.out.println("El total de paginas son: " + paginastotales);
        
        sc.close();
    }
    
}
