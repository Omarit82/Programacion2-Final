package Videos;

import java.util.ArrayList;
import Criterios.Criterio;

public abstract class ElementoVideo {
    private String titulo;
    protected ArrayList<String> palabrasClave;

    public ElementoVideo(String titulo){
        this.titulo = titulo;
        palabrasClave = new ArrayList<>();
    }

    public abstract int getDuracion();
    public abstract int cantidadVideos();
    public abstract ArrayList<VideoSimple> busqueda(Criterio criterio); 
    public ArrayList<String> getPalabrasClave(){
        ArrayList<String> retorno = new ArrayList<>();
        retorno = palabrasClave;
        return retorno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void agregarTag(String tag){
        if(!palabrasClave.contains(tag)){
            palabrasClave.add(tag);
        }
    }
    public boolean contieneTag(String tag){
        return palabrasClave.contains(tag);
    }
}
