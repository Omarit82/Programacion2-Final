package Piezas;

import java.util.ArrayList;
import Criterios.Criterio;

public abstract class Pieza {
    /*Atributos */
    
    private String nombre;
    private String descripcion;
    private static double precioGramoPla;
    private static double costoSegundo;

    /*Constructor */
    public Pieza(String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        precioGramoPla = 1;
        costoSegundo =1;
    }
    /* Getters & Setters */
    public static void setPrecioGramoPla(double precioGramoPla){
        Pieza.precioGramoPla = precioGramoPla;
    }
    public static void setCostoSegundo(double costoSegundo){
        Pieza.costoSegundo = costoSegundo;
    }
    public static double getPrecioGramoPla(){
        return precioGramoPla;
    }
    public static double getCostoSegundo(){
        return costoSegundo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    public double getCosto(){
        return getCantidadPlaNecesario()*precioGramoPla + getTiempoEstimado()*costoSegundo;
    }
    
    /* Metodos abstractos que se definiran en los clases que hereden */
    public abstract double getCantidadPlaNecesario();
    public abstract int getTiempoEstimado();
    public abstract ArrayList<String> getColores();
    public abstract int getPiezasSimples();
    public abstract ArrayList<Pieza> busqueda(Criterio criterio);
    
}
