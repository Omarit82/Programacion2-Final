package Piezas;
import java.util.ArrayList;

import Criterios.Busqueda;
/*Cada pieza compuesta posee un nombre y una descripción */
public class PiezaCompuesta extends Pieza{

    protected ArrayList<Pieza> piezas;
    private int materialAgregado;
    public static final int TIEMPO_EXTRA = 45;
    
    public PiezaCompuesta(String nombre, String descripcion,int materialAgregado) {
        super(nombre, descripcion);
        piezas = new ArrayList<>();
        this.materialAgregado = materialAgregado;
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
            total += pieza.getPlaNecesario();
        }
        return total + (materialAgregado*this.cantidadPiezasSimples());
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

    
    public ArrayList<String> getColores() {
        /* La pieza compuesta no posee un color propio, pero debe ser posible obtener la lista de los 
        colores de las piezas que lo componen (simples o compuestas), sin repetidos. */
        ArrayList<String> resultado = new ArrayList<>();
        for (Pieza pieza : piezas) {
            for (int i=0; i< pieza.getColores().size(); i++) {
                if(!resultado.contains(pieza.getColores().get(i))){
                    resultado.add(pieza.getColores().get(i));
                }
            }
        }
        return resultado;
    }
    
    public int cantidadPiezasSimples(){
        int cantidadPiezasTotales = 0;
        for (Pieza pieza : piezas) {
            cantidadPiezasTotales += pieza.cantidadPiezasSimples();
        }
        return cantidadPiezasTotales;
    }
    @Override
    public ArrayList<Pieza> buscar(Busqueda criterio) {
        ArrayList<Pieza> retorno = new ArrayList<>();
        for (Pieza pieza : piezas) {
            retorno.addAll(pieza.buscar(criterio));
        }
        return retorno;
    }
}
