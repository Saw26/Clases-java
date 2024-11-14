import java.util.Scanner;
public class buble_while2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        int sumaedad=0;
       double media =0;
        int numeroalumnos =0;
        int mayoresedad=0;
        System.out.println("Introduce la edad de un alumno");
            edad = in.nextInt();                             // aquí leemos la edad
        while (edad >=0) {
            sumaedad += edad;
            numeroalumnos++;
            if (edad >=18) {
                mayoresedad++;
            }
             System.out.println("Introduzca la edad");
                edad= in.nextInt();
            }
        
        media = sumaedad/numeroalumnos;
        System.out.println("Suma de todas las edades: "+ sumaedad);
        System.out.println("La media de las edades es: "+ media);
        System.out.println("el total de alumnos introducidos es: "+numeroalumnos);
        System.out.println("Los alumnos mayores de edad son: "+mayoresedad);

        in.close();
    }
    
}