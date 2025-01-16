
package Entidades;

public class Aritmetica {
    private int a;
    private int b;
    
    //constructor
    public Aritmetica(int a, int b){
      this.a = a;
        this.b = b;
    }
    
    // métodos
    
    public int Suma() {
    return a+b;
    }
    
    public int Producto(){
    return a*b;
    }   
}

