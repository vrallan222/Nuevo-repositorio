/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author vrall
 */
public class Lista {
    public Nodolista auxiliar;
    public Nodolista ultimo;
    public Lista(){
        ultimo=null;
    }
    public void añadir(String elemento){
        
        
        Nodolista nuevo = new Nodolista(elemento);
        if(esVacia()){
        ultimo=nuevo;
        }
         nuevo.siguiente=ultimo;
        ultimo=nuevo;
           
    }
     public boolean esVacia(){
        return (ultimo==null);
    }
      public void mostrar (){
           if(auxiliar == null){
            //mensaje de error
        }
     ultimo=auxiliar;
        auxiliar=null;
        ultimo.siguiente=null;
        
    
    }
      public void Borrar(){
          if(ultimo == null){
            //mensaje de error
        }
        Nodolista auxiliar = ultimo;
        ultimo=null;
        ultimo.siguiente=null;
        auxiliar.siguiente=null;
      }
      public String  mostrar2 (){
        Nodolista auxiliar=ultimo;
        String cadena="";
        do{
        cadena=cadena+"{"+ultimo.dato+"}";    
        auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
       return cadena; 
    }
      public String Mostrar3(){
          return ultimo.dato;
      }
    }

