/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcgestionestudiantes;

import controladorestudiantes.Controladorestudiantes;
import modeloestudiantes.Modeloestudiantes;
import vistaestudiantes.Vistaestudiantes;

/**
 *
 * @author vrall
 */
public class MVCgestionestudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Modeloestudiantes mod = new Modeloestudiantes();
        Vistaestudiantes view = new Vistaestudiantes();
        Controladorestudiantes cont = new Controladorestudiantes(view);
        cont.iniciar();
    }
    
}
