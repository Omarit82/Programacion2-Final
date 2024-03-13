import java.time.LocalDate;

public abstract class Paquete{
    /*- Posee un id, datos del alojamiento, ciudad origen y destino, fecha de pago y costo */

    private int id;
    private int cantidadPasajeros;
    
    public Paquete(int id, int cantidadPasajeros) {
        this.id = id;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }
    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public abstract LocalDate fechaPago();
    public abstract double getCosto();
    public abstract String getOrigen();
    public abstract String getDestino();
}
