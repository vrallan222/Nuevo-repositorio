/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Nodo;
import modelo.Lista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author vrall
 */
public class Controlador implements ActionListener {

    
    private Nodo nodo;
    private Lista lista;

    public Controlador( Lista lista) {
        this.nodo = nodo;
        this.lista = lista;
        

    }

    public void inicio() {
          Lista listad = new Lista();
           int opcion =0;
           String elemento;
           boolean eliminado=false;
        do{
                try{
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Ingrese los nombres de los jugadores \n"
                    +"2. Empezar juego \n"
                    +"3. Mostrar jugadores restantes\n"
                    +"4.salir"
                    +"Que deseas Hacer?","Menu de Opciones",
                    JOptionPane.INFORMATION_MESSAGE));
                    switch (opcion){
                        case 1:
                            elemento=(JOptionPane.showInputDialog(null,"Ingresar el elemento del Nodo","Agregando nodo a la lista",
                                    JOptionPane.INFORMATION_MESSAGE));
                            
                          listad.insertar(elemento);
                          break;
                        case 2:
                          lista.musica();
                             
                          break;
                        case 3:
                            
                            if(!listad.estaVacia()){
                                listad.mostrar();
                            }else{
                                JOptionPane.showInputDialog(null,"Aun no hay elementos en esta lista",
                                    JOptionPane.INFORMATION_MESSAGE);
                                
                            }
                            case 4:
                                JOptionPane.showInputDialog(null,"Aplicacion finalizada","Fin ",
                                    JOptionPane.INFORMATION_MESSAGE);
                            default :
                              
                                JOptionPane.showInputDialog(null,"Esta opcion no esta disponible","Incorrecto ",
                                    JOptionPane.INFORMATION_MESSAGE);
                    }
                    }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
                }
            }while(opcion !=4);
    }
     public void actionPerformed(ActionEvent e) {
       
    }

    
}


    
