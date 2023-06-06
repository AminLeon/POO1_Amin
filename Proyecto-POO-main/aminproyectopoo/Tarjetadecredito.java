package com.mycompany.proyecto.poo1;
/**
 *Clase publica Tarjeta de credito donde se van a guardar las variables .
 * @author Amin Housnane Leon
 */
public class Tarjetadecredito {
     private String entidadBancaria;
    private String numero;
    private double saldo;
    private EntidadF entidadFinaciera;
    private Persona titular;
    
    /**
     * 
     * @param entidadBancaria
     * @param numero
     * @param saldo
     * @param titular e
     * @param entidadFinaciera
     */
    

    public Tarjetadecredito(String entidadBancaria, String numero, double saldo, Persona titular , EntidadF entidadFinaciera) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.entidadFinaciera = entidadFinaciera;
        this.titular = titular;
    }

    @Override
    
   
    public String toString() {
        return "Tarjetadecredito{" + "entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", entidadFinaciera=" + entidadFinaciera + ", titular=" + titular + '}';
    }

    /**
     * Parametros que se usaran
     * @param montoFinal
     * @return 
     */
    public boolean tieneSaldoDisponible(double montoFinal) {
       return saldo>=montoFinal;
       
      
        
    }
/**
 * Parametros que se usaran
 * @param monto 
 */
     public void descontar(double monto) {
       saldo=saldo-monto;
    }
/**
 * Devuelve
 * @return el nombre del titular 
 */
    public String nombreCompletoDelTitular() {
      return titular.nombreCompleto();
    }
    
}
