/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasconnodos;

import javax.swing.JOptionPane;

/**
 *
 * @author vrall
 */
public class Pilasconnodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pila Columnas = new Pila();
           int opcion =0;
           String elemento;
           do{
                try{
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Ingrese un caracter \n"
                    +"2. Mostrar los datos de la pila \n"
                   
                    +"Que deseas Hacer?","Menu de Opciones",
                    JOptionPane.INFORMATION_MESSAGE));
                    switch (opcion){
                        case 1:
                            elemento=(JOptionPane.showInputDialog(null,"Ingresar el elemento del Nodo","Agregando nodo a la lista",
                                    JOptionPane.INFORMATION_MESSAGE));
                            
                          Columnas.añadir(elemento);
                        break 
                        case 2:
                          Columnas.mostrar();
                             
                          break;
                           default :
                              
                                JOptionPane.showInputDialog(null,"Esta opcion no esta disponible","Incorrecto ",
                                    JOptionPane.INFORMATION_MESSAGE);
                    }
                    }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
                }
            }while(opcion !=2);
    }
    
}
