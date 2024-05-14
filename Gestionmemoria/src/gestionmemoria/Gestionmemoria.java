/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionmemoria;

import controlador.Controlador;
import modelo.Lista;
import modelo.Pila;
import controlador.Controlador;
import vista.Vista;
/**
 *
 * @author vrall
 */
public class Gestionmemoria {

  
    public static void main(String[] args) {
 Pila mod = new Pila();
  Lista mod2 = new Lista();
        Vista view = new Vista();
        Controlador cont = new Controlador(view, mod,mod2);
        cont.inicio();
        view.setVisible(true);
    }
    
}
