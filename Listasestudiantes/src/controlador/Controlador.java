/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author vrall
 */
public class Controlador implements ActionListener {
    private Modelo model;
            private Vista view;
       Modelo anterior;     
    public Controlador(Modelo model, Vista view ){
        this.model=model;
        this.view=view;
    }
    public void Inicio(){
          
    }
    public void actionPerformed(ActionEvent e) {
      
     model.estaVacia();
       model.agregarAlfinaledad(model.getEdad());
    }
}
