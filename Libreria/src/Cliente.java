import java.util.ArrayList;

public abstract class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private ArrayList<String>autoresFavoritos;
    protected ArrayList<String>generosFavoritos;
    private ArrayList<Impresion> listadoCompras;
    private int descuento;
    

    
    public Cliente(String nombre, String apellido, int dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        autoresFavoritos = new ArrayList<>();
        generosFavoritos = new ArrayList<>();
        listadoCompras = new ArrayList<>();
    }

    public Cliente(String nombre, String apellido, int dni, String direccion,int descuento) {
        this(nombre, apellido, dni, direccion);
        this.descuento = descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void agregarGeneroFavorito(String genero){
        if(!generosFavoritos.contains(genero)){
            generosFavoritos.add(genero);
        }
    }
    
    public void agregarAutorFavorito(String autor){
        if(!autoresFavoritos.contains(autor)){
            autoresFavoritos.add(autor);
        }
    }

    public boolean tieneAutorFavorito(String autor){
        if(autoresFavoritos.contains(autor)){
            return true;
        }else{
            return false;
        }
    }

    public boolean tieneGenero(String genero){
        if(generosFavoritos.contains(genero)){
            return true;
        }else{
            return false;
        }
    }

    public int cantidadGeneros(){
        return generosFavoritos.size();
    }

    public void nuevaCompra(Impresion nueva){
        listadoCompras.add(nueva);
    }
    
    public int getDescuento(){
        return descuento;
    }

    public boolean compro(Impresion producto){
        if(listadoCompras.contains(producto)){
            return true;
        }else{
            return false;
        }
    }
    public boolean gustaProducto(Impresion producto){
        return tieneAutorFavorito(producto.getAutor());
    }
}
