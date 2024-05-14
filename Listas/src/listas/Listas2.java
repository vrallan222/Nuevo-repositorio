/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author vrall
 */
public class Listas2 {
    private String objetoslistas[];

  

    public String[] getObjetoslistas() {
        return objetoslistas;
    }

    public void setObjetoslistas(String[] objetoslistas) {
        this.objetoslistas = objetoslistas;
    }
    public Listas2 (String objetoslistas[]){
        this.objetoslistas=objetoslistas;
        
    }
    public String[] generarlista(){
     this.objetoslistas=new String [3];
    System.out.println("xd"+objetoslistas);
        return this.objetoslistas;
    }
}
