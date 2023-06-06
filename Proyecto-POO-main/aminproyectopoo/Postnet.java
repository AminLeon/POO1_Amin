package com.mycompany.proyecto.poo1;
/**
 *Esta clase esta designada a  a generar un ticket
 * @author Amin Housnane Leon
 */
public class Postnet {
    public static final double RECARGO_POR_CUOTA=0.03;
    public static final int MIN_CANT_CUOTAS=1;
    public static final int MAX_CANT_CUOTAS=12;
    /**Parametros
     *
     * @param tarjeta   clase tarjetadecredito
     * @param montoAbonar  dinero que hay que pagar
     * @param cantCuotas  cantidad de cuotas
     * @return 
     */

       public ticket efectuarPago(Tarjetadecredito tarjeta, double montoAbonar , int cantCuotas){
          

            ticket ticket=null;
            if(datosValidos(tarjeta, montoAbonar , cantCuotas)){
                double montoFinal=montoAbonar+montoAbonar*recargoSegunCuotas(cantCuotas);
                if (tarjeta.tieneSaldoDisponible(montoFinal)){
                    tarjeta.descontar(montoFinal);
                    String nomApe=tarjeta.nombreCompletoDelTitular();
                    double montoPorCuota=montoFinal/cantCuotas;
                    ticket=new ticket(nomApe,montoFinal,montoPorCuota);
                    
                }
            }
           return ticket;
       }
       /**Parametros
        * 
        * @param tarjeta
        * @param monto
        * @param cant
        * @return
        */
       private boolean datosValidos(Tarjetadecredito tarjeta , double monto , int cant){
           /**Parametros
            *
            *
            * @return devolvera  si es true igual a tarjeta  valida
            * @return devolvera  si true igual a  monto valido
            * @return devolvera un boolean true si cantidad de cuotas esta entre validas
            * 
            */
           boolean esTarjetaValida=tarjeta != null;
           boolean esMontoValido = monto>0;
           boolean cantCuotaValida= cant>=MIN_CANT_CUOTAS && cant<=MAX_CANT_CUOTAS;
           return esTarjetaValida&&esMontoValido&&cantCuotaValida;
       }
       /**Parametros
        * 
        * @param cantCuotas Es la cantidad de coutas que vas a introducir
        * @return 
        */
       private double recargoSegunCuotas(int cantCuotas){
           return (cantCuotas-1)* RECARGO_POR_CUOTA;
           /**
            * @return nos devolvera la cantidad de dinero a pagar por cuota dependiendo de cuantas haya 
            */
       }
}
