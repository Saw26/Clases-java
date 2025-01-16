import java.util.Scanner;
public class metodorecursivo {
   public static int calculo(int base, int exponente){
        int resultado= 1;
      for(int i=0; i<exponente;i++){
          resultado = resultado * base;
      }
      return resultado;
}
     public static int calculaPotenciaRecursivo(int base, int exponente){
        int resultado;
        if (exponente == 0) {
            resultado = 1;
        }
        else{
           resultado = calculaPotenciaRecursivo(base,exponente-1)*base;
        }
           return resultado;
       }
   public static void main(String[] args) {
        int base;
        int expo;
    try (Scanner sc = new Scanner(System.in)) {
System.out.println("Introduce la base");
base=sc.nextInt();
System.out.println("Introduce el exponente");
expo=sc.nextInt();
        System.out.println("El resultado es: " + calculo(base, expo));
         System.out.println("El resultado es: " + calculaPotenciaRecursivo(base,expo));
       
    }
   }
}
    
    

