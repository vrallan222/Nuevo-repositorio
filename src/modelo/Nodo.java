/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vrall
 */
public class Nodo {
    String jugadores;
    Nodo siguiente;
    public Nodo(String players){
        jugadores=players;
        siguiente=this;
}

 
}
