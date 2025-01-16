package Entidades;

public class Persona {
   private String nombre;
   private String apellido ="";
   
   //constructores  //
   public Persona(String nombre, String apellido){
       this.nombre = nombre;
       this.apellido = apellido;
   }
   public Persona (String nombre) {
   this.nombre = nombre;
   }
   
   //metodos //
   public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
