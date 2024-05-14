/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatareas;

import static java.awt.AWTEventMulticaster.add;
import java.util.Scanner;

/**
 *
 * @author vrall
 */
class Tareas {
 public String agregar[];
    public String completar[];
           
    public String[] Completartareas(){
        Scanner leer = new Scanner(System.in);
      this.completar= new String[9];
      completar[0] = leer.next();
       completar[1] = leer.next();
       completar[2] = leer.next();
       completar[3] = leer.next();
       completar[4] = leer.next();
       completar[5] = leer.next();
       completar[6] = leer.next();
       completar[7] = leer.next();
       completar[8] = leer.next();
       completar[9] = leer.next();            
      
        return completar;
    }
    
        public String Agregartarea(){
              Scanner leer = new Scanner(System.in);
              String agregar = leer.next();
            return agregar;
    }
        }