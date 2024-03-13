import java.util.ArrayList;
/*Cada pieza compuesta posee un nombre y una descripción */
public class PiezaCompuesta extends Pieza{

    private ArrayList<Pieza> piezas;
    public static final int MATERIAL_AGREGADO = 1;
    public static final int TIEMPO_EXTRA = 45;
    
    public PiezaCompuesta(String nombre, String descripcion) {
        super(nombre, descripcion);
        piezas = new ArrayList<>();
    }
    public void agregarPieza(Pieza nuevaPieza){
        piezas.add(nuevaPieza);
    }
    @Override
    public double getPlaNecesario() {
        /*una cantidad de PLA necesario que se calcula como la suma del PLA necesario más 
        1 gramo por cada pieza simple que la compone, */
        double total = 0;
        for (Pieza pieza : piezas) {
            total += pieza.getPlaNecesario()+MATERIAL_AGREGADO;
        }
        return total;
    }

    @Override
    public int getTiempoEstimado() {
        /*un tiempo estimado que es la suma de los tiempos de cada parte más 45 segundos extra. */
        int tiempoTotal = 0;
        for (Pieza pieza : piezas) {
            tiempoTotal += pieza.getTiempoEstimado();
        }
        return tiempoTotal+TIEMPO_EXTRA;
    }

    
    public ArrayList<String> getColor() {
        /* La pieza compuesta no posee un color propio, pero debe ser posible obtener la lista de los 
        colores de las piezas que lo componen (simples o compuestas), sin repetidos. */
        ArrayList<String> resultado = new ArrayList<>();
        for (Pieza pieza : piezas) {
            for (int i=0; i< pieza.getColor().size(); i++) {
                if(!resultado.contains(pieza.getColor().get(i))){
                    resultado.add(pieza.getColor().get(i));
                }
            }
        }
        return resultado;
    }
    
    public int cantidadPiezas(){
        int cantidadPiezasTotales = 0;
        for (Pieza pieza : piezas) {
            cantidadPiezasTotales += pieza.cantidadPiezas();
        }
        return cantidadPiezasTotales;
    }
}
