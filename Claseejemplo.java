package Ejecucion;

import Entidades.Persona;

public class Claseejemplo {
    public static void main(String[] args) {
        Persona objeto1 = new Persona("Federico", "Diaz");
        Persona objeto2 = new Persona("Pedro");
        
        
        System.out.println("Persona 1: ");
        objeto1.mostrarPersona();
        System.out.println("Persona 2: ");
        objeto2.mostrarPersona();
        
    } 
}

