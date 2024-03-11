import java.util.ArrayList;

public class Impresion {
    private String nombre;
    private String autor;
    private double precio;
    private int cantidadPaginas;
    private String resumen;
    private ArrayList<String> generos;
    
    public Impresion(String nombre, String autor, double precio, int cantidadPaginas, String resumen) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidadPaginas = cantidadPaginas;
        this.resumen = resumen;
        generos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public void agregarGenero(String genero){
        if(!generos.contains(genero)){
            generos.add(genero);
        }
    }

}
