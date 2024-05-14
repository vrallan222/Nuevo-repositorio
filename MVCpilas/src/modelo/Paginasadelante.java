/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import modelo.Paginaweb;
/**
 *
 * @author vrall
 */
public class Paginasadelante {
  private Paginaweb sima;  
  private int longitud;
    public Paginasadelante(){
        sima=null;
        longitud=0;
        
    }
   public int longitud (){
        return longitud;
         
    }
   public boolean esVacia(){
        return (sima==null);
    }
   public void añadir(String dato,String dato2){
        
        Paginaweb n = new Paginaweb(dato);
        if(esVacia()){
        sima=n;
        }

        n.siguiente=sima;
        sima=n;
                longitud++;
    }
   public void mostrar(){
     Paginaweb n =sima;
     while (n != null) {
            System.out.println(n.URL);
            n = n.siguiente;
        }
        }
   }

