import java.util.Scanner;

public class Areadelcirculo {
    public static void main(String[] args) {
       double area;

        Scanner an = new Scanner (System.in);

        System.out.println("Introduce el radio del círculo: ");
        int radio = an.nextInt();
        area = Math.PI*Math.pow(radio,2);

        System.out.println("El area del círculo es: " + area);

        an.close();
        }
}
