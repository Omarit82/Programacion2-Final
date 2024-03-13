package Productos;

import java.util.ArrayList;

public abstract class Producto {
    protected ArrayList<String> categorias;

    public Producto(){
        categorias = new ArrayList<>();
    }

    public  void addCategoria();
    public abstract double getPeso();
    public abstract double getPrecio();
}
