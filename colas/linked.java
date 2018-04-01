/*******************************************************************************
**                                                                            **
**          MIT License | Copyright (c) [2018] [imLokiMx]                        **
**                                                                            **
*******************************************************************************/
package main.colas;
// Importamos Queue para poder usarlo
import java.util.Queue;
// De igual modo importamos la librería LinkedList
import java.util.LinkedList;

/**
 *
 * @author Loki
 */
public class linked {
    // Queue nos limita a tener un solo tipo de dato
    
    // Vamos al ejemplo
    // creo un método para poder usarlo desde el main
    public static void linked(){
         // Declaramos nuestra cola xd indicando el tipo de dato
    LinkedList queue = new LinkedList<>();
    
    // Insertamos datos
        // Tenemos dos métodos o "modos" de ingresar datos "add" y "offer"
    queue.add(7);
    queue.offer(3);
    queue.add("String");
    queue.add(2);
    queue.offer(8);
    queue.add(234.45);
    
    // Imprimimos la cola
        System.out.println("Cola: "+queue);
        System.out.println("//La principal diferencia es que con Listas Enlazadas podemos trabajar con distintos tipos de datos");
        
         do{ // primero imprimimos y luego le damos salida
             if(queue.peek()!=null){ // revisamos que el frente no esté vacío, pues si es null entonces la cola está vacía
            System.out.println(queue.peek());//Muestra el nuevo Frente
             } else {
                 System.out.println("Lista vacía"); 
             }
        } while(queue.poll()!=null); // con esto damos salida
         System.out.flush(); 
    }
    public static void main(String[] args) {
    linked();      
    } // termina el main
    

}
