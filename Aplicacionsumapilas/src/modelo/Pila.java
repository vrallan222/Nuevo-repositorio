/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vrall
 */
public class Pila {
    Nodo sima;
    Nodo auxiliar;
    public Pila(){
       this.sima=null;
    }
    public boolean estavacia(){
        return sima==null;
    }
    public void añadir(double dato){
         Nodo nuevo = new  Nodo(dato);
        if (estavacia()){
           
            nuevo=sima;
        
        }else{
       nuevo.siguiente=sima;
       sima=nuevo;
        }
    }
    public void borrar(){
        Nodo auxiliar = new Nodo(dato);
    }
}
