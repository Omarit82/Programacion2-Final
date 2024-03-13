package Piezas;
import java.util.ArrayList;

import Criterios.Busqueda;

public class PiezaSimple extends Pieza {
    
    private double plaNecesario;
    private String color;
    private int tiempoEstimado;

    public PiezaSimple(String nombre, String descripcion,String color,double plaNecesario,int tiempoEstimado) {
        super(nombre, descripcion);
        this.plaNecesario=plaNecesario;
        this.tiempoEstimado=tiempoEstimado;
        this.color=color;
    }

    public double getPlaNecesario() {
        return plaNecesario;
    }

    public void setPlaNecesario(double plaNecesario) {
        this.plaNecesario = plaNecesario;
    }

    public ArrayList<String> getColores() {
        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(color);
        return resultado;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    @Override
    public int cantidadPiezasSimples(){
        return 1;
    }

    @Override
    public ArrayList<Pieza> buscar(Busqueda criterio) {
        ArrayList<Pieza>retorno = new ArrayList<>();
        if(criterio.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }
}
