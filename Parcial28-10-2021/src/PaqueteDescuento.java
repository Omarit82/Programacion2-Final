import java.time.LocalDate;

public class PaqueteDescuento extends PaqueteSimple{
    private double descuento;

    public PaqueteDescuento(String ciudadOrigen, String ciudadDestino, double costo, LocalDate fechaPago,
            int cantidadPasajeros, int id, double descuento) {
        super(ciudadOrigen, ciudadDestino, costo, fechaPago, cantidadPasajeros, id);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

}
