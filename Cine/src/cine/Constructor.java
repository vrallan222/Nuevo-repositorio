/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;
import cine.Cine;
import java.util.Scanner;
/**
 *
 * @author vrall
 */
public class Constructor {
    String nombre;
    int edad;
    int telefono;
    int documento;
String administrador;
     private Cine view;
      
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
    
        Cine e1=new  Cine("El señor de los anillos: La comunidad del anillo ",2,1,3);
    Cine e2=new  Cine("El caballero oscuro ",4,3,6);
    Cine e3=new  Cine("El Padrino, parte II  ",2,8,1);
    Cine e4=new  Cine("Doce hombres sin piedad ",8,1,7);
   
   e1.registro();
   e1.registroadministrador();
   e1.opcion1();
   e2.opcion1();
   e3.opcion1();
   e4.opcion1();
   System.out.print("Ingrese el numero de la opcion que usted desea ver");
   int contador =leer.nextInt();
        if (contador == 1) {
         e1.opcioncliente();
            
        }
        if (contador == 2) {
         e2.opcioncliente();
            
        }
        if (contador == 3) {
         e3.opcioncliente();
            
        }
        if (contador == 4) {
         e4.opcioncliente();
            
        }
   
   
           
 
   
    }
   
}
