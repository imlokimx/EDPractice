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
public class queue {
    // Queue nos limita a tener un solo tipo de dato
    
    // Vamos al ejemplo
    
    // creo un método para poder usarlo desde el main
    public static void queue(){
         // Declaramos nuestra cola xd indicando el tipo de dato
    Queue<Integer> queue = new LinkedList<>();
    
    // Insertamos datos
        // Tenemos dos métodos o "modos" de ingresar datos "add" y "offer"
    queue.add(7);
    queue.offer(3);
    queue.add(2);
    queue.offer(8);
    
    // Imprimimos la cola
        System.out.println("Cola: "+queue);
        System.out.println("// La principal limitante es que solo podemos usar un solo tipo de dato");
        
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
    queue();
    
    } // termina el main
    

}
