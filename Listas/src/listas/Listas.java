/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;
import static java.awt.AWTEventMulticaster.remove;
import static java.awt.AWTEventMulticaster.remove;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import listas.Listas2;
/**
 *
 * @author vrall
 */
public class Listas {
private String lista[];
public int opciones;
  public String[] Nombre(){
           this.lista= new String[5];
          String dato="2";
       lista [0] = "tarea1";
       lista [1] = "tarea2";
       lista[2] = "tarea3";
       lista [3] ="tarea4";
         
           return lista;
  }
  public int generaropciones (){
      Scanner leer = new Scanner(System.in);
      this.opciones=leer.nextInt();
    return opciones;
      
  }
  public void opcion1(){
   
  }
    public static void main(String[] args) {
    
    }
    
}
