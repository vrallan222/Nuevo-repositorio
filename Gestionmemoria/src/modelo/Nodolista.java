/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vrall
 */
public class Nodolista {
    String dato;
    Nodolista siguiente;
    private Nodolista anterior;
    public Nodolista (String dato){
        this.dato=dato;
        siguiente=this;
       anterior=null;
    }
            
    
}
