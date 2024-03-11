public class ClienteDescuento extends Cliente{

    private int descuento;

    public ClienteDescuento(String nombre, String apellido, int dni, String direccion, int descuento) {
        super(nombre, apellido, dni, direccion);
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecioProducto(Impresion producto){
        return producto.getPrecio()-(producto.getPrecio()*descuento/100);
    }

    
}
