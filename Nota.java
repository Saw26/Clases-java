package Ejercicios;
import java.util.Scanner;
import Entidades.Metodosnota;
public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nota;
        System.out.println("Introduce la nota del alumno:");
        nota = sc.nextInt();
        
        /*
        while (nota <1 || nota >12 ) {
            System.out.println("Nota no valida, Introduzca otra vez la nota");
            nota = sc.nextInt();
        }
        String [] Evaluacion = new String [11];
        Evaluacion[1] = Evaluacion[2] = Evaluacion[3] = Evaluacion[4] ="Insuficiente";
        Evaluacion[5]= "Suficiente";
        Evaluacion[6] ="Bien";
        Evaluacion[7] = Evaluacion[8] ="Notable";
        Evaluacion[9] = Evaluacion[10] ="Sobresaliente";
        
        System.out.println("La nota del alumno es un " + nota + " y por lo tanto tiene un " + Evaluacion[nota]);  */
        
        //Lo hacemmos con switch y métodos//
        
        System.out.println("La nota del alumno es un " + nota + " y por lo tanto tiene un " + Metodosnota.calcularcalificaciones(nota));
        }
    }

