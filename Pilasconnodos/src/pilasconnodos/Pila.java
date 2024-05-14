/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasconnodos;

import javax.swing.JOptionPane;

/**
 *
 * @author vrall
 */
public class Pila {
    private Nodo Sima;
    private int longitud;
    
    public Pila(){
        Sima=null;
        longitud=0;
        
    }
    public int longitud (){
        return longitud;
    }
    public boolean esVacia(){
        return (Sima==null);
    }
    
    public void añadir(String dato){
        
        Nodo n = new Nodo(dato);
        if(esVacia()){
        Sima=n;
        }

        n.siguiente=Sima;
        Sima=n;
                longitud++;
    }
    public void mostrar(){
    Nodo auxiliar = Sima.siguiente;
    String cadena="";
    do{
        cadena=cadena+"{"+auxiliar.cadena+"}";    
        auxiliar=auxiliar.siguiente;
        }while(auxiliar!=Sima.siguiente);
        JOptionPane.showMessageDialog(null,  cadena, "Mostrando los objetos de la pila",JOptionPane.INFORMATION_MESSAGE);
    }

    
  
}
