/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Paginasatras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Historialnavegacion;
import vista.Vistausuario;
/**
 *
 * @author vrall
 */
public class Controlador implements ActionListener {

    
    private Vistausuario view;
    private Historialnavegacion model;
private Paginasatras model2;
    public Controlador(Vistausuario view, Paginasatras model2) {
        this.model2=model2;
        this.view = view;
        this.model = model;
       
this.view.Guadar.addActionListener(this);
    }

    public void inicio() {
        view.setTitle("Tres Numeros");
        view.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == view.Guadar) {
          model2.añadir((view.Almacenardatos.getText()));
        }
         if (e.getSource() == view.Anterior) {
           model2.Retroceder();
         }
         if (e.getSource() == view.Siguiente) {
           model2.avanzar();
         }
         
    }
    }
