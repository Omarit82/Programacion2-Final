public class ClienteExigente extends Cliente{
    
    public ClienteExigente(String nombre, String apellido, int dni, String direccion, int descuento){
        super(nombre,apellido,dni,direccion,descuento);
    }

    @Override
    public boolean gustaProducto(Impresion producto){
        if(super.gustaProducto(producto)){
            for(int i =0; i<generosFavoritos.size();i++){
                if (producto.contieneGenero(generosFavoritos.get(i))){
                    return true;
                }
            }
        }
        return false;
    }

}
