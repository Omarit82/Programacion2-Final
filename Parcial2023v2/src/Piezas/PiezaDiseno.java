package Piezas;

import Criterios.Criterio;

public class PiezaDiseno extends PiezaCompuesta{
    private Criterio criterio;

    public PiezaDiseno(String nombre, String descripcion){
        super(nombre, descripcion);
    }
    public PiezaDiseno(String nombre, String descripcion, int tiempoExtra,double pesoExtra,Criterio criterio){
        super(nombre, descripcion,tiempoExtra,pesoExtra);
        this.criterio = criterio;
    }

    @Override
    public void agregarPieza(Pieza pieza){
        if (criterio.cumple(pieza)){
            piezas.add(pieza);
        }
    }    
}
