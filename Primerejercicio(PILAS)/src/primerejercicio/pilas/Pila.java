/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerejercicio.pilas;

/**
 *
 * @author vrall
 */
public class Pila {
    Nodo primerodelapila;
    public Pila(){
        primerodelapila=null;
    }
    public boolean estavacia(){
        return primerodelapila==null;
    }
    public void apilar(String elemento){
        Nodo nuevo = new Nodo(elemento);
        if (estavacia()){
          
           primerodelapila=nuevo;
        }else{
      nuevo.siguiente=primerodelapila;
      primerodelapila=nuevo;
        }
    }
   public void borrar(){
       if (estavacia()){
           //MENSAJE DE ERROR
       }else{
           primerodelapila=primerodelapila.siguiente;
       }
   } 
}
