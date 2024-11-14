import java.util.Scanner;

public class ordenados_de_mayor_a_menor {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Introduce un número");
        a = in.nextInt();
        System.out.println("Introduce un segundo número");
        b = in.nextInt();
        System.out.println("Introduce un tercer número");
        c = in.nextInt();
        if (a>b && b>c) 
            System.out.println(a + " es mayor que " + b + " y este a su vez es mayor que " + c);
            
         else if (a>c && c>b) 
                System.out.println(a + " es mayor que " + c + " y este a su vez es mayor que " + b);
                
             else if (b>a && a>c) 
                    System.out.println(b + " es mayor que " + a + " y este a su vez es mayor que " + c);
                    else if (c>b && b>a) 
                    System.out.println(a + " es menor que " + b + " y a su vez este es menor que " + c);

            in.close();
    }
}

