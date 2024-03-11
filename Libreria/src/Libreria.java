import java.util.ArrayList;

public class Libreria {

    private ArrayList<Impresion>productos;
    private ArrayList<Cliente> clientes;
    
    public Libreria (){
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    /*Dado un cliente y un producto debo saber el precio. */

    public double getPrecioParaCliente(Impresion producto, Cliente cliente){
        return producto.getPrecio() - cliente.getDescuento()*producto.getPrecio()/100;
    }

    /*Conocer si un cliente compro un producto determinado */
    public boolean comproProducto(Impresion producto, Cliente cliente){
        return cliente.compro(producto);
    }
    
}
