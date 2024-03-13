package Criterios;

import Piezas.Pieza;

public class BusquedaPesoMaximo extends Busqueda{

    private double pesoMaximo;
    
    public BusquedaPesoMaximo(double pesoMaximo){
        this.pesoMaximo = pesoMaximo;
    }

    public boolean cumple(Pieza pieza){
        if(pieza.getPlaNecesario()<pesoMaximo){
            return true;
        }else{
            return false;
        }
    }
}
