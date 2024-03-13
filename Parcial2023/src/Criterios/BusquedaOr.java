package Criterios;

import Piezas.Pieza;

public class BusquedaOr extends Busqueda{

    private Busqueda criterio1;
    private Busqueda criterio2;

    public BusquedaOr(Busqueda criterio1, Busqueda criterio2){
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Pieza pieza){
        return criterio1.cumple(pieza)||criterio2.cumple(pieza);
    }
    
}
