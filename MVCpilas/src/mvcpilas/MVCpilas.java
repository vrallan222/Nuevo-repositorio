/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcpilas;
import modelo.Paginasatras;
import controlador.Controlador;
import vista.Vistausuario;
import controlador.Controlador;

public class MVCpilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Paginasatras mod = new Paginasatras();
        Vistausuario view = new Vistausuario();
        Controlador cont = new Controlador(view, mod);
        cont.inicio();
        view.setVisible(true);
    }
    
}
