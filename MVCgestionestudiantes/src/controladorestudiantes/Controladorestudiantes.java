/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorestudiantes;
import vistaestudiantes.Vistaestudiantes;
import modeloestudiantes.Modeloestudiantes;
/**
 *
 * @author vrall
 */
public class Controladorestudiantes {
    private Modeloestudiantes model;
    private Vistaestudiantes view;
    public Controladorestudiantes(Vistaestudiantes view){
        this.view=view;
            
        
    }
    public void iniciar(){
        view.Nombre();
        view.Id();
        view.printDetallesEstudiantes();
        
    }
    }
