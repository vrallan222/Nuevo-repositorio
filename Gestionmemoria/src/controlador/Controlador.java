/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;
import modelo.Pila;
import modelo.Lista;


/**
 *
 * @author vrall
 */
public class Controlador implements ActionListener {
    private Vista view;
    private Pila model;
    private Lista model2;
    public Controlador(Vista view,Pila model,Lista model2){
        this.model2=model2;
        this.model=model;
        this.view=view;
        this.view.JB_Guardar.addActionListener(this);
               this.view.JB_Borrar.addActionListener(this);
    }
    public void inicio() {
        view.setTitle("Ingresar datos");
        view.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        String elemento;
       
        if (e.getSource() == view.JB_Guardar) {
            elemento=view.JT_dato.getText();
            
            model.añadir(elemento);
            model2.añadir(elemento);
        }
         if (e.getSource() == view.JB_Borrar) {
            model.Borrar();
      
        }
         view.JTA_mostrarlista.setText(String.valueOf(model2.ultimo));
         view.JTA_MostrarPila.setText(String.valueOf(model.Sima));
    }
    
}
