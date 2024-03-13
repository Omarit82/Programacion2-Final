package Criterios;

import Piezas.*;

public class CriterioNot extends Criterio{
    private Criterio criterio;

    public CriterioNot(Criterio criterio){
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Pieza pieza){
        return !criterio.cumple(pieza);
    }
    
}
