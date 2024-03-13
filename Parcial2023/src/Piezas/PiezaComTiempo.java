package Piezas;

public class PiezaComTiempo extends PiezaCompuesta{

    private int tiempo;

    public PiezaComTiempo(String nombre, String descripcion,int tiempo,int materialAgregado) {
        super(nombre, descripcion,materialAgregado);
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int getTiempoEstimado(){
        int tiempoTotal = 0;
        for (Pieza pieza : piezas) {
            tiempoTotal += pieza.getTiempoEstimado()+tiempo;
        }
        return tiempoTotal;
    }
    
}
