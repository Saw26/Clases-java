import java.util.Scanner;
public class metodos {
    static int factorial(int x){
        int resultado;
        if(x == 0) {
            resultado = 1;
        }
        else
            resultado= x * factorial(x-1);
  
        return resultado;
}
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce un número para calcularle su factorial");
            num=sc.nextInt();
            System.out.println("El factorial de " + num + " es " + factorial(num));
        }
    }
}
