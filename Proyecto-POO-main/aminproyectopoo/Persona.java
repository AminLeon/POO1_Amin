package com.mycompany.proyecto.poo1;
/**
 *En esta clase se guardarán todos los datos de las Personas , inicializamos  las variables con sus tipos de datos , inicializamos el constructor
 * con su datos y creamos un metodo que una el nombre
 * @author Amin Housnane Leon
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    /**Parametros
     * 
     * @param dni Dni de la persona
     * @param nombre Nombre de la persona
     * @param apellido  Apellido de la persona
     * @param telefono Telefono de la persona
     * @param mail Email de la persona
     */
    public Persona(String dni, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
      
     /**
      * Devuelve:
      * @return Devuelve la union del nombre y apellido en este metodo llamado nombre Completo
      */
    public String nombreCompleto() {
      return nombre+" "+apellido;
     
    
    }
    
}
