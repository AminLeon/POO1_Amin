package com.mycompany.proyecto.poo1;
/**
 * @author Amin Housnane Leon
 */
public class Main {

        public static void main(String[] args) {
        /**
        *En este apartado es donde se pondran todos los datos del usuario que queremos crear con sus parametros y printea el ticket generado
         * mas la tarjeta despues del pago
        */
        
        Postnet Postnet =new Postnet();
        
        Persona p= new Persona("422500872S","Amin","Housnane","654432542","aminsennin0@gmail.com");
        Tarjetadecredito t=new Tarjetadecredito("Caixa","1234",30,p, EntidadF.BIRZA);
        System.out.println("Tarjeta antes del pago...");
        System.out.println(t);
        
       ticket ticketgenerado= Postnet.efectuarPago(t,10,3);
       System.out.println("Ticket generado.");
       System.out.print(ticketgenerado);
       
       System.out.println("Tarjeta después del pago");
       System.out.println(t);
       
    }
    
}
