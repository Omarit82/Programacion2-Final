package Criterios;

import Piezas.Pieza;

public class BusquedaColor extends Busqueda{
    private String color;

    public BusquedaColor(String color){
        this.color = color;
    }
    @Override
    public boolean cumple(Pieza pieza) {
        if(pieza.getColores().contains(color)){
            return true;
        }else{
            return false;
        }
    }
    
}
