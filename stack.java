/*******************************************************************************
**                                                                            **
**          MIT License | Copyright (c) [2018] [imLokiMx]                        **
**                                                                            **
*******************************************************************************/
package main;

import java.util.Stack;

/**
 *
 * @author Loki
 */
public class stack {
    //Así se declara una pila
    public static Stack<String> pila = new Stack<>();
    
    // creo un método para poder usarlo en todo el proyecto
    public static void stack(){
          // Agregamos elementos a la pila con un for
          for(int x = 1; x<=10; x++){
            pila.push(Integer.toString(x));
            System.out.println("Se ha agregado: "+x);
    }
    // Ahora mostramos los elementos mientras eliminamos los mismos, hasta que la pila queda vacía
    while(!pila.empty()){
        System.out.println("Se ha eliminado -> "+pila.pop()+" de la pila.");
    }
    
    }
    
    public static void main(String[] args) {
      // simplemente llamamos el método en nuestro main
      stack();
    
    }
}
