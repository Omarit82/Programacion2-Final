package Criterios;

import Piezas.*;

public class CriterioColor extends Criterio{

    private String color;

    public CriterioColor (String color){
        this.color = color;
    }
    @Override
    public boolean cumple(Pieza pieza){
        return pieza.getColores().contains(color);
    }
}
