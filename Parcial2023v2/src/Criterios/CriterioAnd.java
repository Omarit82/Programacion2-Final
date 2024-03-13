package Criterios;

import Piezas.Pieza;

public class CriterioAnd extends Criterio{
    private Criterio criterio1;
    private Criterio criterio2;

    public CriterioAnd(Criterio criterio1, Criterio criterio2){
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Pieza pieza){
        return criterio1.cumple(pieza)&&criterio2.cumple(pieza);
    }
    
}
