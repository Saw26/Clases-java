package Entidades;

public class Metodosnota {
    
   public static String calcularcalificaciones(int notanumerica) {
        String calificacion="";
        switch (notanumerica) {
            case 1:
            case 2:
            case 3:
            case 4:
                calificacion="Insuficiente";
                break;
           case 5:
               calificacion="Suficiente";
               break;
           case 6:
               calificacion="Bien";
               break;
           case 7:
           case 8:
               calificacion="Notable";
                break;
           case 9:
           case 10:
               calificacion="Sobresaliente";
        }
        return calificacion;
    }
}
