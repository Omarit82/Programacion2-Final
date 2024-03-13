package Criterios;

import Piezas.Pieza;

public class BusquedaNot extends Busqueda{

    private Busqueda criterio;

    public BusquedaNot(Busqueda criterio){
        this.criterio = criterio;
    }

    public boolean cumple(Pieza pieza){
        return !criterio.cumple(pieza);
    }
    
}
