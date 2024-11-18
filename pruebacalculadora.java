import java.util.Scanner;

public class pruebacalculadora {
    public static double sumar(double a, double b) {            //suma
        return a + b;
    }

    public static double restar(double a, double b) {           //resta
        return a - b;
    }

    public static double multiplicar(double a, double b) {          //multiplicación
        return a * b;
    }

    public static double dividir(double a, double b) {          //división
        if (b != 0) {                                   
            return a / b;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");             //esto es para que te de error al dividir entre 0
        }
    }

    public static double potencia(double a, int i) {            //potencia
        return Math.pow(a, i);

    }

    public static double raiz(double b) {               //raiz
        return Math.sqrt(b);

    }

    public static void main(String[] args) {                                        //aquí se declaran todas las variables
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double a;
        int i;
        double num1;
        double num2;
        double b;
        double resultadoAnt=0;
        do {                                                            //el (do while) es un "mientras", quiero que me haga estas elecciones

            System.out.println("Selecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6.Raiz cuadrada");
            System.out.println("7.Borrar historial");
            System.out.println("8. Salir del programa");

            opcion = entrada.nextInt();
            double resultado = 0;                                                 //necesito crear esta variable e igualarla a 0 para que me pueda guardar el resultado
                                                                     // luego necesito igualar el resultado anterior al resultado general para que me lo guarde (revisar código para entenderlo)

            if (opcion == 1) {
                if (resultadoAnt==0) {                                              //si el resultado anterior es 0 que haga la operación, si no es 0 (porque ya hemos operado con el) 
                                                                                                 //que nos deje seguir haciendo operaciones con el
                    System.out.println("Introduce el primer número");
                    num1 = entrada.nextDouble();
   
                   System.out.println("Introduce el segundo número");
                    num2 = entrada.nextDouble();
                   resultado = sumar(num1, num2);
                    resultadoAnt=resultado;
                   System.out.println("El resultado es: " + resultado+"\n");
                }
                else{
                    System.out.println("Introduce el número por el que sumar el número anterior");
                    num1 = entrada.nextDouble();
                    resultado = sumar(resultadoAnt, num1);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la suma es "+resultado+"\n");
                }
                
            }
            if (opcion == 2) {
                if (resultadoAnt==0) {
                    System.out.println("Introduce el primer número");
                    num1 = entrada.nextDouble();
   
                   System.out.println("Introduce el segundo número");
                    num2 = entrada.nextDouble();
                   resultado = restar(num1, num2);
                   resultadoAnt = resultado;
                   System.out.println("El resultado es: " + resultado+"\n");
                }
                   else {System.out.println("Introduce el número por el que restar el número anterior");
                   num1 = entrada.nextDouble();
                   resultado = restar(resultadoAnt, num1);
                   resultadoAnt = resultado;
                   System.out.println("El resultado de la resta es "+resultado+"\n");}
            }
            if (opcion == 3) {
                if (resultadoAnt==0) {
                    System.out.println("Introduce el primer número");
                    num1 = entrada.nextDouble();
   
                   System.out.println("Introduce el segundo número");
                    num2 = entrada.nextDouble();
                   resultado = multiplicar(num1, num2);
                   resultadoAnt= resultado;
                   System.out.println("El resultado es: " + resultado+"\n");
                }
                else {
                    System.out.println("Introduce el número por el que multiplicar el número anterior");
                   num1 = entrada.nextDouble();
                   resultado = multiplicar(resultadoAnt, num1);
                   resultadoAnt = resultado;
                   System.out.println("El resultado de la multiplicación es "+resultado+"\n");}
            }
            if (opcion == 4) {
                if (resultadoAnt==0){
                System.out.println("Introduce el primer número");
                num1 = entrada.nextDouble();

               System.out.println("Introduce el segundo número");
                num2 = entrada.nextDouble();
               resultado = dividir(num1, num2);
               resultadoAnt = resultado;
               System.out.println("El resultado es: " + resultado+"\n");
            }
            
            else {
            System.out.println("Introduce el número por el que dividir el número anterior");
               num1 = entrada.nextDouble();
               resultado = dividir(resultadoAnt, num1);
               resultadoAnt = resultado;
               System.out.println("El resultado de la división es "+resultado+"\n");}
                
            }
            if (opcion ==5) {
                if (resultadoAnt==0) {
                    System.out.println("Introduce el número a elevar");
                    a = entrada.nextDouble();
               System.out.println("Introduce el número elevado");
                    i =entrada.nextInt();
               resultado = potencia(a, i);
               resultadoAnt = resultado;
               System.out.println("El resultado es: "+resultado+"\n");}
            else {
                System.out.println("Introduce el número de la potencia anterior");
                    i =entrada.nextInt();
                    resultado = potencia(resultadoAnt, i);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la potencia es "+resultado+"\n");

                }
            }

            if (opcion == 6) {
                if (resultadoAnt==0) {
                    System.out.println("Introduce el número al que hacer raiz cuadrada");
                    b = entrada.nextDouble();
                    resultado =raiz(b);
                    resultadoAnt = resultado;
                   System.out.println("El resultado es: " + resultado+"\n");
                    
                }
            else {
                System.out.println("Introduce la raiz anterior");
                b = entrada.nextDouble();
                resultado = raiz(b);
                resultadoAnt = resultado;
                System.out.println("El resultado de la raiz cuadrada es "+resultado+"\n");
            }
            }
            if (opcion ==7) {
                resultadoAnt=0;
                System.out.println("Historial borrado");
                
            }
            if (opcion >8) {
                System.out.println("Opción inválida.");   
            }
        } while (opcion != 8);

        System.out.println("Adios!!");
        entrada.close();
    }
}
