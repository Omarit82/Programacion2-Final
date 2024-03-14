package Videos;

import java.util.ArrayList;
import Criterios.Criterio;
import java.util.Collections;
import Ordenamiento.*;

public class VideoCompuesto extends ElementoVideo{

    private ArrayList<ElementoVideo> videos;
    private int demoraCarga;

    public VideoCompuesto(String titulo){
        super(titulo);
        videos = new ArrayList<>();
        demoraCarga = 5;
    }
    
    public int getDemoraCarga() {
        return demoraCarga;
    }

    public void setDemoraCarga(int demoraCarga) {
        this.demoraCarga = demoraCarga;
    }

    public void agregarVideo(ElementoVideo video){
        videos.add(video);
    }

    public ArrayList<VideoSimple> busqueda(Criterio criterio){
        ArrayList<VideoSimple> aux = new ArrayList<>();
        for (ElementoVideo video : videos) {
            aux.addAll(video.busqueda(criterio));
        }
        Collections.sort(aux, new OrdenCompuesto(new OrdenNombre(),new OrdenEmail()));
        return aux;
    }

    public int getDuracion(){
        int duracion =0;
        for (ElementoVideo video : videos) {
            duracion += video.getDuracion();
        }
        return duracion+demoraCarga;
    }

    public int cantidadVideos(){
        int total = 0;
        for (ElementoVideo video : videos) {            
            total += video.cantidadVideos();
        }
        return total;
    }
    @Override
    public ArrayList<String> getPalabrasClave(){
        ArrayList<String> palabras = new ArrayList<>();
        for (ElementoVideo video : videos) {
            ArrayList<String> auxiliar = new ArrayList<>();
            auxiliar = video.getPalabrasClave();
            for (String tag : auxiliar) {
                if(!palabras.contains(tag)){
                    palabras.add(tag);
                }
            }
        }
        return palabras; 
    } 
}
