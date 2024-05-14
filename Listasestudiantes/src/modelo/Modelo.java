/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vrall
 */
public class Modelo {
   public String nombre;
    public int edad;
 Modelo anterior;  
   Modelo actual= anterior;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Modelo getAnterior() {
        return anterior;
    }

    public void setAnterior(Modelo anterior) {
        this.anterior = anterior;
    }

    public Modelo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Modelo siguiente) {
        this.siguiente = siguiente;
    }
   
    private Modelo siguiente;
    
    public Modelo (int edad){
        this.edad=edad;
    this.anterior=anterior;
        this.siguiente=siguiente;
        
        
    }
  public boolean estaVacia (){
       return getSiguiente()==null;
   }
  public void agregarAlfinaledad(int edad){
      Modelo Nodoedad = Modelo(edad);
      if(estaVacia()){
          anterior = Nodoedad;
          siguiente =Nodoedad;
      } else {
          anterior.setSiguiente(Nodoedad);
      }
  }
  public void Imprimirlista (){
      if (estaVacia()){
          System.out.print("Lista vacia ");
          return;
          
      }

      
  }
  }
  
  
  

    

    

