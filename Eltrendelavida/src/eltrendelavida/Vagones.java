/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eltrendelavida;


public class Vagones {
  String vagon;  

     Vagones siguinetes;
  public Vagones (String vagon) {
    this.vagon = vagon ;
    this.siguinetes = null;
}

    public String getVagon() {
        return vagon;
    }

    public void setVagon(String vagon) {
        this.vagon = vagon;
    }

    public Vagones getNuevo() {
        return siguinetes;
    }

    public void setNuevo(Vagones nuevo) {
        this.siguinetes = nuevo;
    }
          


  
}
