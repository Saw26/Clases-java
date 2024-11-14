import java.util.Scanner;

public class sueldo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Horas;
        int Sueldo;
        
        System.out.println("¿Cuantas horas has trabajado este mes?");
        Horas= in.nextInt();
        Sueldo = Horas*10;
        System.out.println("Tu sueldo de este mes es de " + Sueldo + "€");
        in.close();
        }
}
