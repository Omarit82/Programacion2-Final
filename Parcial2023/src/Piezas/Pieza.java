package Piezas;

import java.util.ArrayList;
import Criterios.Busqueda;

public abstract class Pieza {
    
    private String nombre;
    private String descripcion;
    private static double costoSegundo;
    private static double precioPla;
   
    
    public Pieza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        costoSegundo = 45;
        precioPla = 12;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public static double getCostoSegundo() {
        return costoSegundo;
    }

    public static void setCostoSegundo(double costoSegundo) {
        Pieza.costoSegundo = costoSegundo;
    }

    public static double getPrecioPla() {
        return precioPla;
    }

    public static void setPrecioPla(double precioPla) {
        Pieza.precioPla = precioPla;
    }
    /*Metodo template */
    public double getCosto(){
        return (getPlaNecesario()*getPrecioPla())+(getTiempoEstimado()*getCostoSegundo());
    }

    public abstract double getPlaNecesario();
    public abstract int getTiempoEstimado();
    public abstract ArrayList<String> getColores();
    public abstract int cantidadPiezasSimples();
    public abstract ArrayList<Pieza>buscar(Busqueda criterio);

    @Override
    public String toString() {
        return "Pieza nombre: " + nombre + ", descripcion: " + descripcion+"\n";
    }

    
}
