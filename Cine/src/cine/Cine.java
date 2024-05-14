/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

import java.util.Scanner;

/**
 *
 * @author vrall
 */
public class Cine {
   String nombre;
    int edad;
    int telefono;
    int documento;
String administrador;
  private String nombrepelicula;
    private int salas;
    private int fila;
    private int columna; 

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }

    public int getSalas() {
        return salas;
    }

    public void setSalas(int salas) {
        this.salas = salas;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
public Cine(String nombrepelicula, int salas,int fila, int columna){
     this.nombrepelicula = nombrepelicula;
        this.salas = salas;
        this.fila = fila;
        this.columna = columna;
}
  
    public void registro( ){
      
         Scanner leer = new Scanner(System.in);
         System.out.print("Ingrese su nombre ");
         String nombres= leer.next();
           this.nombre = nombres;
         System.out.print("Ingrese su edad");
         int edad = leer.nextInt();
         this.edad=edad;
         System.out.println("Ingrese su nuemro telefonico");
         int telefono = leer.nextInt();
         this.telefono=telefono;
         System.out.print("Ingrese su documento de identidad");
         int documento =leer.nextInt();
        this.documento = documento;
      
        
    }
    public void registroadministrador(){
         Scanner leer = new Scanner(System.in);
          System.out.print("Escriba si si usted es administrador y un no si no es administrador");
        String administrador = leer.next();
        this.administrador=administrador;
    }
 public void opcion1(){
       System.out.println("-----Pelicula Uno------");
         System.out.println("La pelicula de"+ nombrepelicula);
           System.out.println("en la sala"+ salas);
             System.out.println("En la fila "+ fila);
   }
    
    public void opcioncliente(){
       System.out.print(this.nombre+ "usted eligio la pelicula"+ nombrepelicula);
       System.out.print("en la sala" + salas);
       System.out.print("y su asiento esta ubicado en la colummna" + columna+ "y en la fila" + fila);
    }
 
    
}
