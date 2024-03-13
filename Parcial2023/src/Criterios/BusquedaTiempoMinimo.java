package Criterios;

import Piezas.Pieza;

public class BusquedaTiempoMinimo extends Busqueda{

    private int tiempo;

    public BusquedaTiempoMinimo(int tiempo){
        this.tiempo = tiempo;
    }

    public boolean cumple(Pieza pieza){
        if(pieza.getTiempoEstimado()>tiempo){
            return true;
        }else{
            return false;
        }
    }
    
}
