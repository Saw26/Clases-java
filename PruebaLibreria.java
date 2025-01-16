package PruebasArrays;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.List;

public class PruebaLibreria {
    
    public static void main(String[] args) {
        String[] libroEntrada = new String[] {"Castilla", "Romey y Julieta", "El banquete"};
        
        String[] autoresLibros = new String[] {"Azorin", "Sheakspeare", "Platon"};
        
        int[] paginasLibros = new int[] {132,283,261};
        
        // titulos de los libros
      /*  for (int i=0; i<libroEntrada.length; i++) {
            System.out.println(libroEntrada[i]);
        }
       // autores de los libros
        for (int i = 0; i<autoresLibros.length;i++) {
            System.out.println("el autor es: " + autoresLibros[i]);
        }
        // paginas de los libros
        for (int i= 0; i<paginasLibros.length;i++) {
            System.out.println("Numero de paginas del libro " + (i+1) + ": " + paginasLibros[i]);
        } 
        
      // todo en conjunto
        for (int i= 0; i<paginasLibros.length;i++) {
            System.out.println("Numero de paginas del libro " + libroEntrada[i] + ": " + paginasLibros[i] + " Y su autor es: " + autoresLibros[i]);
        } 
        */
        
        // Nota aclaratoria, no hace falta hacer TODOS estos for, con solo el último valdría, pero es para entender cómo funciona.
        
        
        //si por ejemplo queremos filtrar por una sola cosa se puede hacer de estas 2 maneras, o una u otra (mejor la segunda)
       System.out.println("Los libros que ha escrito " + autoresLibros[2] + " son: " + (libroEntrada[2]));
        
       for (int i= 0; i<paginasLibros.length;i++) {
           if(autoresLibros[i].equals("Platon")) {
               System.out.println(libroEntrada[i]);
           }
        } 
        
    }
}

