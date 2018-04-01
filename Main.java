/** *****************************************************************************
 **____________________________________________________________________________**
 **__________MIT License | Copyright (c) [2018] [imLokiMx]________________________**
 **____________________________________________________________________________**
 ****************************************************************************** */
package main;
// importamos el scanner
import java.util.Scanner;
import static main.arbol.arbol.arbol;
import static main.colas.linked.linked;
import static main.colas.queue.queue;
import static main.stack.stack;
/**
 *
 * @author Loki
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    public static int validator(){
        Scanner s = new Scanner(System.in);
    String a = "a";
    int b = 1;
     int c = 0;
    int rep = 1;
    while(rep==1){
        System.out.println("Ingresa un numero");
        a = s.nextLine();
        rep = 0;
    try{
        c = Integer.parseInt(a);
    } catch(NumberFormatException ex){
        System.out.println("!!!!!!!!!!!!");
        System.out.println("Debes ingresar un numero");
        System.out.println("!!!!!!!!!!!!");
        rep = 1;
    } 
    
    }
    return c;
    }
    public static void main(String[] args) {
        // Vamos a programar
        Scanner s = new Scanner(System.in);
        int rep = 1;
        while(rep==1){
        System.out.println("Hola");
        System.out.println("Que ejemplo deseas ver?");
        System.out.println("1) Pila");
        System.out.println("2) Cola (Queue)");
        System.out.println("3) Cola (LinkedList)");
        System.out.println("4) Arboles");
        int sel = validator();
                    System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");

        switch(sel){
            case 1 : stack();
                break;
            case 2 : queue();
                break;
            case 3 : linked();
                break;
            case 4 : arbol();
            break;
            default : System.out.println("!!!!!!!!!!!!");System.out.println("Ingresa un valor del menú");System.out.println("!!!!!!!!!!!!");
        }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
    }
    }
    
}
