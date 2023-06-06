package com.mycompany.proyecto.poo1;
/**
 *Esta es la clase donde se guardaran todos los parametros que el usuario pase del ticket.
 * @author Amin
 */
public class ticket {

     private String nombreApellido;
    private double Montonporpagar;
    private double montonPorcuota;
    
    /**
     * Parametros que se usaran
     * @param nombreApellido
     * @param Montonporpagar
     * @param montondecuota
     */

    public ticket(String nombreApellido, double Montonporpagar, double montondecuota) {
        this.nombreApellido = nombreApellido;
        this.Montonporpagar = Montonporpagar;
        this.montonPorcuota = montondecuota;
    }

    @Override
    public String toString() {
        return "ticket{" + "nombreApellido=" + nombreApellido + ", Montonporpagar=" + Montonporpagar + ", montonPorcuota=" + montonPorcuota + '}';
    }
}
