
package Primitivosyejemplos;

public class Pruebadatos {
    public static void main(String[] args) {
      //pruebas con tipo entero //
        
        String variable = "23";
        
        int maximo = Integer.MAX_VALUE;
        int i = Integer.parseInt(variable);
        
        System.out.println("Valor tras parsear a entero: " + (maximo+1)); 
      
       
      // pruebas con tipo double //
      
      
      double d = Double.parseDouble(variable);
      double maximoDouble = Double.MAX_VALUE;
        System.out.println("Valor tras parsear a double: " +(maximoDouble*2));
      
    }
}
