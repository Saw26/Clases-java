import java.util.Scanner;

public class cajero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario idUsuario = null;

        while (true) { // El cajero funciona las 24h 365 días
            while (idUsuario == null) {
                idUsuario = acceso(); // Ahora siempre devuelve "Fernando"
            }

            System.out.println("Hola " + idUsuario.getNombre());
            Cuenta cuenta = new Cuenta(1000.0); // Simulamos una cuenta con un saldo inicial
            int opc = 0; // Valor inicial

            // Gestión del Cajero Automático
            while (opc != 5) {
                opc = menuOpciones(scanner, "1. Consultar Saldo", "2. Sacar Dinero",
                        "3. Ingresar Dinero", "4. Recargar Móvil", "5. Salir");

                switch (opc) {
                    case 1: // Consultar Saldo
                        System.out.println("Su saldo es de: " + cuenta.getSaldo() + "€");
                        break;

                    case 2: // Sacar Dinero
                        System.out.print("Cuánto desea sacar? ");
                        double cantidad = scanner.nextDouble();
                        if (cuenta.sacar(cantidad)) {
                            System.out.println("Ha sacado: " + cantidad + "€. Su saldo actual es: " + cuenta.getSaldo() + "€");
                        } else {
                            System.out.println("No tiene saldo suficiente.");
                        }
                        break;

                    case 3: // Ingresar Dinero
                        System.out.print("Cuánto dinero quieres ingresar? ");
                        cantidad = scanner.nextDouble();
                        cuenta.ingresar(cantidad);
                        System.out.println("Ha ingresado: " + cantidad + "€. Su saldo actual es: " + cuenta.getSaldo() + "€");
                        break;

                    case 4: // Recargar móvil
                        System.out.print("Cuánto dinero quieres recargar? ");
                        double valor = scanner.nextDouble();
                        System.out.print("Introduce Nº de teléfono: ");
                        String ntlf = scanner.next();
                        if (cuenta.sacar(valor)) {
                            System.out.println("Ha recargado satisfactoriamente el número: " + ntlf +
                                    " con " + valor + "€. Su saldo actual es: " + cuenta.getSaldo() + "€");
                        } else {
                            System.out.println("No tiene saldo suficiente!");
                        }
                        break;

                    case 5: // Salir
                        System.out.println(idUsuario.getNombre() + ", ¡Hasta la próxima!");
                        System.exit(0); // Cierra el programa
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } // while (opc != 5)
        } // while (true)
    }

    // Ahora siempre devuelve un usuario con el nombre "Fernando"
    private static Usuario acceso() {
        return new Usuario("Fernando"); // Nombre fijo
    }

    private static int menuOpciones(Scanner scanner, String... opciones) {
        System.out.println("Seleccione una opción:");
        for (String opcion : opciones) {
            System.out.println(opcion);
        }
        return scanner.nextInt();
    }
}

class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }
}