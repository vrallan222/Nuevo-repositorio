/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vrall
 */
public class Pila {
    private Nodo sima;
    public String contraseña= "asjj";
    public Pila(){
    sima=null;
    }
    public boolean estavacia(){
        return sima==null;
    }
    public void añadir (char elemento){
           Nodo nuevo = new Nodo(elemento);
        if (estavacia()){
         sima=nuevo;
           
        }
        nuevo.siguiente=sima;
        sima=nuevo;
        
    }
    public void cambiodevariable(){
        
        
    }
}
