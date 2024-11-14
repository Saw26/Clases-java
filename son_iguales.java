import java.util.Scanner;

public class son_iguales{
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce un número");
        num1 = in.nextInt();
        System.out.println("Introduce otro número");
        num2 =in.nextInt();
        if (num1==num2) {
            System.out.println("Los números " +num1+" y "+num2+" son iguales");
        }
         else {
            System.out.println("Los números " +num1+" y "+num2+" no son iguales");
    }
        in.close();
    }
}
