package Piezas;

import java.util.ArrayList;
import Criterios.Criterio;

public class PiezaSimple extends Pieza{
    /*Atributos */
    private double cantidadPla;
    private int tiempoEstimado;
    private String color;
    /*Constructor */
    public PiezaSimple(String nombre, String descripcion,double cantidadPla, int tiempoEstimado, String color) {
        super(nombre, descripcion); 
        this.cantidadPla = cantidadPla;
        this.tiempoEstimado = tiempoEstimado;
        this.color = color;
    }
    /*Getters & Setters */
    @Override
    public double getCantidadPlaNecesario() {
        return cantidadPla;
    }
    public void setCantidadPlaNecesario(double cantidadPla){
        this.cantidadPla = cantidadPla;
    }
    @Override
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }
    public void setTiempoEstimado(int tiempoEstimado){
        this.tiempoEstimado = tiempoEstimado;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public ArrayList<String> getColores(){
        ArrayList<String> aux = new ArrayList<>();
        aux.add(getColor());
        return aux;
    }
    @Override
    public int getPiezasSimples(){
        return 1;
    }
    @Override
    public ArrayList<Pieza> busqueda(Criterio criterio){
        ArrayList<Pieza> aux = new ArrayList<>();
        if(criterio.cumple(this)){
            aux.add(this);
        }
       return aux;
    }
}
