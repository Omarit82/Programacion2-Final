public class App {
    public static void main(String[] args) throws Exception {
      /* Agencia de turismo
       * 
       * Ofrece distintos paquetes turisticos
       * 
       * Vida en la naturaleza en familia: avion o auto rentado a un destino ligado a la naturaleza
       * alojamiento para la cantidad de miembros - Posee un id, datos del alojamiento, ciudad origen y destino, fecha de pago y costo
       * 
       * Viaje con Amigos: avion o auto rentado a un destino con vida nocturna
       * alojamiento para la cantidad de amigos - Posee un id,datos del alojamiento, ciudad origen y detino , fecha de pago y costo
       *
       * Paquete superViaje :  viaje de larga duracion compuesto por combinaciones de otros paquetes. 
       * id propio,fecha de pago(ultima fecha de pago de los viajes contenidos siempre y cuando esten todas las fechas de pago acordadas
       * caso contrario es null).
       * Los paquetes intermedios son agregados en orden, por lo tanto debe coincidir la ciudad de origen de un nuevo paquete con la de destino del previo
       * Si esto no se cumple no se debe permitir el ingreso del nuevo viaje). 
       * Asi, la ciudad de origen de un paquete SuperViaje sera la ciudad de origen del primer paquete y 
       * la de destino sera la ciudad destino del ultimo paquete.
       * Condicion fundamental : todos los paquetes deben contener la misma cantidad de pasajeros
       * El costo del paquete es la suma de todos los paquetes.
       */
    }
}
