import java.util.Scanner;   //Esto importa la biblioteca que yo le diga Ç(en este caso un scanner)

public class notasalumnos {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);  // Esto hace que yo pueda meter datos por la terminal  (hemos abierto la variable entrada, hay que cerrarla luego)

       String nombre_alumno;
       double evaluacion1;
       double evaluacion2;
       double evaluacion3;
       double evaluacion_final;

       System.out.println("nombre_alumno: ");
       nombre_alumno = entrada.nextLine();

       System.out.println("Nota de la primera evaluación: ");
       evaluacion1 = entrada.nextDouble();

       System.out.println("Nota de la segunda evaluación: ");
       evaluacion2 = entrada.nextDouble();

       System.out.println("Nota de la tercera evaluación: ");
       evaluacion3 = entrada.nextDouble();

       evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3)/3;

       System.out.println("La nota media de " + nombre_alumno + "es " + evaluacion_final);

       entrada.close();  // esto cierra el "entrada"
    }
 }
