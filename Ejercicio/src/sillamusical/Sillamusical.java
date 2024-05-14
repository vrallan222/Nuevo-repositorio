/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sillamusical;

import controlador.Controlador;
import modelo.Lista;
import modelo.Nodo;

/**
 *
 * @author vrall
 */
public class Sillamusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lista lista = new Lista();
        
        Controlador cont = new Controlador( lista);
        cont.inicio();
   
    }
    
}
