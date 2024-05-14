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
public class Paginasatras {
    Paginaweb auxiliar;
   private Paginaweb sima;  
  private int longitud;
    public Paginasatras(){
        sima=null;
        longitud=0;
        
    }
   public int longitud (){
        return longitud;
         
    }
   public boolean esVacia(){
        return (sima==null);
    }
   public void añadir(String dato){
        
        Paginaweb n = new Paginaweb(dato);
        if(esVacia()){
        sima=n;
        }

        n.siguiente=sima;
        sima=n;
                longitud++;
    }
   public void recorrercima(){
    for (int i = longitud() - 1; i >= 0; i--) {  
        
    } 
   
     
    }
    public void Retroceder(){
        if(sima == null){
            //mensaje de error
        }
        Paginaweb auxiliar = sima;
        sima=null;
        sima.siguiente=null;
        auxiliar.siguiente=null;
   }
    public void avanzar(){
          if(auxiliar == null){
            //mensaje de error
        }
        sima=auxiliar;
        auxiliar=null;
        sima.siguiente=null;
        
    }
        }
   
    

