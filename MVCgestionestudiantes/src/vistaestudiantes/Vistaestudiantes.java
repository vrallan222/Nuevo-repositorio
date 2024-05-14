
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaestudiantes;

import java.util.Scanner;

/**
 *
 * @author vrall
 */
public class Vistaestudiantes {
    public String nombreEstudiantes[];
    public String id[];
       Scanner leer = new Scanner(System.in);
       public String[] Nombre(){
           this.nombreEstudiantes= new String[5];
           System.out.print("Ingrese su Nombre");
       nombreEstudiantes [0] = leer.next();
       nombreEstudiantes [1] = leer.next();
       nombreEstudiantes [2] = leer.next();
       nombreEstudiantes [3] = leer.next();
       nombreEstudiantes [4] = leer.next();
       
           return nombreEstudiantes;
       }
       public String[] Id(){
           this.id=new String[5];
           System.out.print("Ingrese su id");
           
        id [0]= leer.next();
        id [1]= leer.next();
        id [2]= leer.next();
        id [3]= leer.next();
        id [4]= leer.next();
        
           return id;
       }
    public String[] printDetallesEstudiantes (){
        System.out.print("Binevenido "+ this.nombreEstudiantes[0]+"Su id es "+this.id[0]);
        System.out.print("Binevenido "+ this.nombreEstudiantes[1]+"Su id es "+this.id[1]);
        System.out.print("Binevenido "+ this.nombreEstudiantes[2]+"Su id es "+this.id[2]);
        System.out.print("Binevenido "+ this.nombreEstudiantes[3]+"Su id es "+this.id[3]);
        System.out.print("Binevenido "+ this.nombreEstudiantes[4]+"Su id es "+this.id[4]);
       return this.nombreEstudiantes; 
    }
}
