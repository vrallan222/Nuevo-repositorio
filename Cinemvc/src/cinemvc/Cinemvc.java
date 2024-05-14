
package cinemvc;

/**
 *
 * @author vrall
 */
public class Cinemvc {

    private String nombrepelicula;
    private int salas;
    private int fila;
    private int columna;
    String nombre;
    int documento_identidad;
    int edad;
    int documento;
    int telefono;
    String genero;
    String administrador;

  

    public Cinemvc(String nombrepelicula, int salas, int fila, int columna, String nombre, int documento_identidad, int edad, int documento, int telefono, String genero, String administrador) {
        this.nombrepelicula = nombrepelicula;
        this.salas = salas;
        this.fila = fila;
        this.columna = columna;
        this.nombre = nombre;
        this.documento_identidad = documento_identidad;
        this.edad = edad;
        this.documento = documento;
        this.telefono = telefono;
        this.genero = genero;
        this.administrador = administrador;
    }



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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(int documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

   
  
   public void opcion1(){
       System.out.println("-----Pelicula Uno------");
         System.out.println("La pelicula de"+nombrepelicula);
           System.out.println("en la sala"+ salas);
             System.out.println("En la fila "+fila);
   }
    public void opcion2(){
       System.out.println("-----Pelicula Dos------");
         System.out.println("La pelicula de"+nombrepelicula);
           System.out.println("en la sala"+ salas);
             System.out.println("En la fila "+fila);
   }
    public void opcion3(){
       System.out.println("-----Pelicula Tres------");
         System.out.println("La pelicula de"+nombrepelicula);
           System.out.println("en la sala"+ salas);
             System.out.println("En la fila "+fila);
   }
    public void opcion4(){
       System.out.println("-----Pelicula Cuatro------");
         System.out.println("La pelicula de"+nombrepelicula);
           System.out.println("en la sala"+ salas);
             System.out.println("En la fila "+fila);
   }
    public void opcioncliente(){
       System.out.print(this.nombre+"usted eligio la pelicula"+nombrepelicula);
       System.out.print("en la sala"+salas);
       System.out.print("y su asiento esta ubicado en la colummna" +columna+ "y en la fila" +fila);
    }
}
