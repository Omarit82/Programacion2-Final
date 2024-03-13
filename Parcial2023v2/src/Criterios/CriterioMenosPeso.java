package Criterios;

import Piezas.Pieza;

public class CriterioMenosPeso extends Criterio{
    private double pesoReferencia;
    public CriterioMenosPeso(double pesoReferencia){
        this.pesoReferencia = pesoReferencia;
    }
    @Override
    public boolean cumple(Pieza pieza){
        return pieza.getCantidadPlaNecesario()<pesoReferencia;
    }
}
