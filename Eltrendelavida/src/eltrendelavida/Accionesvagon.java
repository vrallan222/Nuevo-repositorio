/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eltrendelavida;
import eltrendelavida.Vagones;

public class Accionesvagon {
Vagones cabeza;
 Vagones actual = cabeza;
 

    public Accionesvagon() {
       
    }
    public void Añadirvagon(String vagon){
       
   Vagones  nuevovagon = new Vagones(vagon);

   actual.siguinetes=nuevovagon;
    
    }
    public void Retirarvagon(String vagon){
        cabeza=actual.siguinetes;
    }
}
