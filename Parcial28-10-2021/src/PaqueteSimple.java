import java.time.LocalDate;

public class PaqueteSimple extends Paquete{

    private String ciudadOrigen;
    private String ciudadDestino;
    private double costo;
    private LocalDate fechaPago;
    private String datosAlojamiento;
    
    public PaqueteSimple(String ciudadOrigen, String ciudadDestino, double costo, LocalDate fechaPago,int cantidadPasajeros,int id) {
        super(id,cantidadPasajeros);
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.costo = costo;
        this.fechaPago = fechaPago;
    }

    @Override
    public LocalDate fechaPago() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fechaPago'");
    }

    @Override
    public double getCosto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCosto'");
    }

    @Override
    public String getOrigen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrigen'");
    }

    @Override
    public String getDestino() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDestino'");
    }

    public String getDatosAlojamiento() {
        return datosAlojamiento;
    }

    public void setDatosAlojamiento(String datosAlojamiento) {
        this.datosAlojamiento = datosAlojamiento;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
    
}
