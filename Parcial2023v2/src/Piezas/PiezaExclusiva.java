package Piezas;

import java.util.ArrayList;
import Criterios.Criterio;

public class PiezaExclusiva extends PiezaSimple{
    private double costoExclusividad;

    public PiezaExclusiva(String nombre, String descripcion, double cantidadPla, int tiempoEstimado, String color,double costoExclusividad) {
        super(nombre, descripcion, cantidadPla, tiempoEstimado, color);
        this.costoExclusividad = costoExclusividad;
    }
    public double getCostoExclusividad(){
        return costoExclusividad;
    }

    public void setCostoExclusividad(double costoExclusividad){
        this.costoExclusividad = costoExclusividad;
    }

    @Override
    public ArrayList<Pieza> busqueda (Criterio criterio){
        return new ArrayList<>();        
    }
    @Override
    public double getCosto(){
        return super.getCosto()+costoExclusividad;
    }
}
