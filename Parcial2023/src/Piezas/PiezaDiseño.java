package Piezas;

import Criterios.Busqueda;

public class PiezaDiseño extends PiezaCompuesta{

    private Busqueda criterio;
    
    public PiezaDiseño(String nombre, String descripcion, int materialAgregado, Busqueda criterio) {
        super(nombre, descripcion, materialAgregado);
        this.criterio = criterio;
    }
    @Override
    public void agregarPieza(Pieza pieza){
        if(criterio.cumple(pieza)){
            super.agregarPieza(pieza);
        }
    }
}
