package Ejecucion;
import java.util.Scanner;
public class PruebaMeses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroMes;
        System.out.println("Introduce el valor del mes (1-12): ");
        numeroMes = sc.nextInt();
        
        
       /* String nombreEstacion= "";
       
         Mostrar la estación a la que pertenece el mes (utilizando estructura if-else)
       
        if (numeroMes == 1 || numeroMes == 2 || numeroMes == 12) {
            nombreEstacion ="Invierno";
        } else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5) {
            nombreEstacion = "Primavera";
        } else if (numeroMes == 6 || numeroMes == 7 || numeroMes == 8) {
            nombreEstacion = "Verano";
        } else if (numeroMes == 9 || numeroMes == 10 || numeroMes == 11) {
            nombreEstacion = "Otoño";
        } 
        System.out.println("La estacion a la que pertenece el mes " + numeroMes + " es: " + nombreEstacion);  /*
        /*----------------------------------------------------------------------------------------------------------------------*/
        
        /* utilizamos switch */
        
    /*   String nombreEstacion= "";
        switch (numeroMes) {
            case 1:
            case 2:
            case 12:
                nombreEstacion="Invierno";
                break;
           case 3:
           case 4:
           case 5:
                nombreEstacion="Primavera";
                break;
           case 6:
           case 7:
           case 8:
                nombreEstacion="Verano";
                break;
          case 9:
          case 10:
          case 11:
                nombreEstacion="Otoño";
                break;
        }
        if (!nombreEstacion.equals("")) {
        
        System.out.println("La estacion a la que pertenece el mes " + numeroMes + " es: " + nombreEstacion);
    } else { System.out.println("El valor del mes no es valido");
    
        }
        /*
    //--------------------------------------------------------------------------------------------------------------------//    
        /* array*/
        
     /*   
        
      String [] estacionMeses = new String [12];
      
      estacionMeses[0] = estacionMeses[1] = estacionMeses[11] = "Invierno";
      estacionMeses[2] = estacionMeses[3] = estacionMeses[4] = "Primavera";
      estacionMeses[5] = estacionMeses[6] = estacionMeses[7] = "Verano";
      estacionMeses[8] = estacionMeses[9] = estacionMeses[10] = "Otoño";
      
      
      
      
      
      System.out.println("La estacion a la que pertenece el mes " + numeroMes + " es: " + estacionMeses[numeroMes]);
   
           
        */
   
}
}
