package Piezas;

import java.util.ArrayList;
import Criterios.*;

public class PiezaExclusiva extends PiezaSimple{

    private double costoExclusividad;

    public PiezaExclusiva(String nombre, String descripcion, String color, double plaNecesario, int tiempoEstimado, double costoExclusividad) {
        super(nombre, descripcion, color, plaNecesario, tiempoEstimado);
        this.costoExclusividad = costoExclusividad;
    }
    
    @Override
    public ArrayList<Pieza> buscar(Busqueda criterio){
        ArrayList<Pieza> res = new ArrayList<>();
        return res;
    }
    @Override
    public double getCosto(){
        return super.getCosto()+costoExclusividad;
    }

    public double getCostoExclusividad() {
        return costoExclusividad;
    }

    public void setCostoExclusividad(double costoExclusividad) {
        this.costoExclusividad = costoExclusividad;
    }
}
