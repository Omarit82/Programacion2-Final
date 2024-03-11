import java.util.ArrayList;

public class Libreria {

    private ArrayList<Impresion>productos;
    private ArrayList<ClienteDescuento> clientes;
    
    public Libreria (){
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    /*Dado un cliente y un producto debo saber el precio. */

    public double getPrecioParaCliente(Impresion producto, ClienteDescuento cliente){
        return cliente.getPrecioProducto(producto);
    }

    /*Conocer si un cliente compro un producto determinado */
    public boolean comproProducto(Impresion producto, ClienteDescuento cliente){
        return cliente.compro(producto);
    }
    
}
