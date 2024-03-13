package Piezas;

import java.util.ArrayList;

import Criterios.Criterio;

public class PiezaCompuesta extends Pieza{

    private int tiempoExtra;
    private double pesoExtra;
    protected ArrayList<Pieza> piezas;

    public PiezaCompuesta(String nombre, String descripcion) {
        super(nombre, descripcion);
        piezas = new ArrayList<>();
        tiempoExtra = 45;
        pesoExtra =1;
    }

    public PiezaCompuesta(String nombre, String descripcion, int tiempoExtra,double pesoExtra){
        this(nombre, descripcion);
        this.tiempoExtra = tiempoExtra;
        this.pesoExtra = pesoExtra;
    }

    /* Getters & Setters */
    public void setTiempoExtra(int tiempoExtra){
        this.tiempoExtra = tiempoExtra;
    }
    public int getTiempoExtra(){
        return tiempoExtra;
    }
    public void setPesoExtra(double pesoExtra){
        this.pesoExtra = pesoExtra;
    }
    public double getPesoExtra(){
        return pesoExtra;
    }

    public void agregarPieza(Pieza pieza){
        piezas.add(pieza);
    }
    @Override
    public double getCantidadPlaNecesario() {
        double total = 0.0;
        for (Pieza pieza : piezas) {
            total += pieza.getCantidadPlaNecesario();
        }
        return total + this.getPiezasSimples();
    }

    @Override
    public int getTiempoEstimado() {
        int total = 0;
        for (Pieza pieza : piezas) {
            total += pieza.getTiempoEstimado();
        }
        return total+tiempoExtra;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String> aux = new ArrayList<>();
        for (Pieza pieza : piezas) {
            for(int i=0; i<pieza.getColores().size();i++){
                if(!aux.contains(pieza.getColores().get(i))){
                    aux.add(pieza.getColores().get(i));
                }
            }
        }
        return aux;
    }
    
    @Override
    public int getPiezasSimples(){
        int total = 0;
        for(int i=0; i<piezas.size();i++){
            total += piezas.get(i).getPiezasSimples();
        }
        return total;
    }
    @Override
    public ArrayList<Pieza> busqueda (Criterio criterio){
        ArrayList<Pieza> auxiliar = new ArrayList<>();
        for (Pieza pieza : piezas) {
            auxiliar.addAll(pieza.busqueda(criterio));
        }
        return auxiliar;
    }
}
