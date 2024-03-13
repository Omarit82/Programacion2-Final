package Criterios;

import Piezas.Pieza;

public class CriterioTiempoMaximo extends Criterio{
    private int tiempoMaximo;

    public CriterioTiempoMaximo(int tiempoMaximo){
        this.tiempoMaximo = tiempoMaximo;
    }

    @Override
    public boolean cumple(Pieza pieza){
        return pieza.getTiempoEstimado()>tiempoMaximo;
    }
}
