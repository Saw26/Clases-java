import java.util.Scanner;
public class Buclesfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cuadrado");
        int lado = sc.nextInt();
        
         for (int i=0; i< lado; i++) {
           for (int j=0; j<=i; j++) {
               System.out.print("*");   
           }         
            System.out.println("");
        }
         System.out.println("");
         
       for (int i=0; i< lado; i++) {
           for (int j=lado; j>i; j--) {
               System.out.print("*");   
           }         
            System.out.println("");
        }
         System.out.println(""); 
         
         
         
        for (int i=0; i< lado; i++) {
           for (int j=lado; j>0; j--) {
               if (j<=i+1) {
               System.out.print("*");  
               } else {
                    System.out.print(" ");  
               }
           }         
            System.out.println("");
        }
             System.out.println("");
         
       for (int i=0; i< lado; i++) {
           for (int j=lado; j>i; j--) {
               System.out.print("*");   
           }         
            System.out.println("");
        }
         System.out.println(""); 
       
        
         for (int i=0; i< lado; i++) {
           for (int j=0; j< lado; j++) {
               if (j<=i-1) {
                   System.out.print(" ");
               }  else {
                   System.out.print("*");
               } 
           }         
            System.out.println("");
        }
         System.out.println("");
         
         
    }
}

