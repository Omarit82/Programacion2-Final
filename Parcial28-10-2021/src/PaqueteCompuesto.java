import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteCompuesto extends Paquete{
    private ArrayList<Paquete> paquetes;
    
    public PaqueteCompuesto(int id, int cantidadPasajeros) {
        super(id, cantidadPasajeros);
        paquetes = new ArrayList<>();
    }

    @Override
    public LocalDate fechaPago() {
        /*fecha de pago(ultima fecha de pago de los viajes contenidos siempre y cuando esten todas las fechas de pago acordadas */
        boolean acordadas = true;
        LocalDate fecha = null;
        for (Paquete paquete : paquetes) {
            if(paquete.fechaPago() != null){
                acordadas = false;
            }
        }

    }

    @Override
    public double getCosto() {
        /*Sumatoria de todos los costos */
        double total = 0;
        for (Paquete paquete : paquetes) {
            total += paquete.getCosto();
        }
        return total;
    }

    @Override
    public String getOrigen() {
        if(!paquetes.isEmpty()){
            return paquetes.get(0).getOrigen();
        }
        return null;
    }

    @Override
    public String getDestino() {
        if(!paquetes.isEmpty()){
            return paquetes.get(paquetes.size()-1).getDestino();
        }
        return null;
    }
    /*Paquete superViaje :  viaje de larga duracion compuesto por combinaciones de otros paquetes. 
    * id propio,fecha de pago(ultima fecha de pago de los viajes contenidos siempre y cuando esten todas las fechas de pago acordadas */
    
}
