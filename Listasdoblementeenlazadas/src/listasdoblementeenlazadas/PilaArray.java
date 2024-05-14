/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdoblementeenlazadas;

/**
 *
 * @author vrall
 */
public class PilaArray {
private int top=-1;
private Object s[];
private int capacidad =0;
    
  
public PilaArray(){
    this(1000);
}
public PilaArray(int cap){
    capacidad=cap;
    s=new Object[capacidad];
    
}
public int longitud (){
    return(top+1);
}
public boolean esVacia() {
    return(top<0);
}
public void añadir(Object o){
    if (longitud()<capacidad) s[++top]=0;
}
}
