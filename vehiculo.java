import java.util.Scanner;

public class vehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        float carburante, precio_anual, revisión, itv, imp_circulacion, seguro, limpieza, distribución, precio_carburante, precio_por_kms;
        int km_revivión, km_neumáticos, km_distribución, km_año, neumáticos;

        System.out.println("Introduce la marca de tu coche");
        marca=sc.nextLine();
        System.out.println("¿Qué modelo es tu coche?");
        modelo=sc.nextLine();
        System.out.println("¿Cuanto carburante gasta?");
        carburante=sc.nextFloat();
        System.out.println("¿Cuanto te cuesta ese carburante?");
        precio_carburante=sc.nextFloat();
        System.out.println("¿qué te cuesta la revisión?");
        revisión=sc.nextFloat();
        System.out.println("¿Cuantos kms haces hasta la revisión?");
        km_revivión=sc.nextInt();
        System.out.println("¿qué te cuesta la ITV?");
        itv=sc.nextFloat();
        System.out.println("¿qué te cuestan los impuestos de circulación?");
        imp_circulacion=sc.nextFloat();
        System.out.println("¿qué te cuesta el seguro de tu coche?");
        seguro=sc.nextFloat();
            if (seguro >=600) {
            System.out.println("Joder que caro tronco");  
             }
        System.out.println("¿qué te cuestan las ruedas?");
        neumáticos=sc.nextInt();
        System.out.println("¿Y cada cuanto las cambias?");
        km_neumáticos=sc.nextInt();
        System.out.println("¿Cuanto te cuesta la correa de distribución?");
        distribución=sc.nextFloat();
        System.out.println("¿Y cada cuantos kms la cambias?");
        km_distribución=sc.nextInt();
        System.out.println("¿Qué te cuesta la limpieza del coche al año?");
        limpieza=sc.nextFloat();
        System.out.println("¿Cuantos kms le metes al coche al año?");
        km_año=sc.nextInt();

        precio_por_kms = ((carburante*precio_carburante)/100) + ((revisión)/(km_revivión)) + 
        ((itv + imp_circulacion + seguro + limpieza)/km_año) + 
        (neumáticos/km_neumáticos) + (distribución/km_distribución);

        precio_anual = (precio_por_kms*km_año);

        System.out.println("Tu " + modelo + " de la marca " + marca + " gasta por km "+ precio_por_kms + " y tu precio anual es de " + (int)precio_anual);

        if (precio_anual > 10000) {
            System.out.println("Soci@, te estás pasando, controla ese presupuesto");
            
        }
        sc.close();
    }
    
}
