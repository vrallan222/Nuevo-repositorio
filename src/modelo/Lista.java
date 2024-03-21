/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author vrall
 */
public class Lista {
    Nodo ultimo;
    public Lista(){
    ultimo=null;
}
    public boolean estaVacia (){
        return ultimo ==null;
    }
     public Lista insertar(String elemento){
        Nodo nuevo = new Nodo(elemento);
        if(ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        return this;
    }
public void musica() {
    if (ultimo == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Random random = new Random();
    int numeroAleatorio = random.nextInt(15);
          
    Nodo auxiliar = ultimo.siguiente;
    String cadena = "";
    for (int i = 1; i <= numeroAleatorio; i++) {
        cadena = cadena + "{" + auxiliar.jugadores + "}";
        auxiliar = auxiliar.siguiente;    
    }
    cadena = cadena + "{" + auxiliar.jugadores + "}";
    JOptionPane.showMessageDialog(null,  cadena, "Fue eliminado", JOptionPane.INFORMATION_MESSAGE);
}

      
   public void mostrar (){
        Nodo auxiliar=ultimo.siguiente;
        String cadena="";
        do{
        cadena=cadena+"{"+auxiliar.jugadores+"}";    
        auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null,  cadena, "Mostrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
    }
}
        

