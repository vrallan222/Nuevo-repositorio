/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author vrall
 */
public class Pila {
    Nodo auxiliar;
    public Nodo Sima;
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
  public void Borrar(){
       if(Sima == null){
            //mensaje de error
        }
        Nodo auxiliar = Sima;
        Sima=null;
        Sima.siguiente=null;
        auxiliar.siguiente=null;
   
  } public void Mostar(){
        if(auxiliar == null){
            //mensaje de error
        }
        Sima=auxiliar;
        auxiliar=null;
        Sima.siguiente=null;
  }
  public String  mostrar2 (){
        Nodo auxiliar=Sima.siguiente;
        String cadena="";
        do{
        cadena=cadena+"{"+Sima+"}";    
        auxiliar=auxiliar.siguiente;
        }while(auxiliar!=Sima.siguiente);
       return cadena; 
    }
  public String Mostrar3(){
          return Sima.dato;
      }
    
}
