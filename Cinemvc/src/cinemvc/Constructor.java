/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemvc;
import java.util.Scanner;
/**
 *
 * @author vrall
 */

public class Constructor {
    String nombre;
        int edad;
        int documento;
        int telefono;
        String genero;
        String administrador;
        
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
      System.out.print("Ingrese su Nombre");
    String nombre =leer.next();
    System.out.println("Ingrese su edad");
    int edad = leer.nextInt();
     System.out.println("Ingrese su documento");
    int documento= leer.nextInt();
    
    System.out.println("Ingrese su telefono");
    int telefono = leer.nextInt();
    
     System.out.println("Ingrese su genero");
    String  genero = leer.next();
     System.out.println("Ingrese si es administrador o no");
    String  administrador = leer.next();
    
    
    
    
    Cinemvc e1=new  Cinemvc("El señor de los anillos: La comunidad del anillo ",2,1,3);
    Cinemvc e2=new  Cinemvc("El señor de los anillos: La comunidad del anillo ",4,3,6);
    Cinemvc e3=new  Cinemvc("El señor de los anillos: La comunidad del anillo ",2,8,1);
    Cinemvc e4=new  Cinemvc("El señor de los anillos: La comunidad del anillo ",8,1,7);
 
    e1.opcion1();
                e2.opcion2();
                    e3.opcion3();
                        e4.opcion4();
                         
        int elleccion=leer.nextInt();
        if (elleccion == 1) {
                e1.opcion1();
        } else {
        }

    }
    
}






























































