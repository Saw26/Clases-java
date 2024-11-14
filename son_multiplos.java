import java.util.Scanner;

public class son_multiplos {
    public static void main(String[] args) {
        int a,b;
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce un número");
        a = in.nextInt();
        System.out.println("Introduce otro número");
        b = in.nextInt();
        if (a%b==0) {
            System.out.println("Son múltiplos");
            
        } else {
            System.out.println("No son múltiplos");
            
        }
        in.close();
        }

    }    

