package Videos;

import java.util.ArrayList;

import Criterios.Criterio;

public class VideoConAdd extends VideoCompuesto{
    private VideoSimple trailer;

    public VideoConAdd(String titulo) {
        super(titulo);
        trailer = new VideoSimple("Matrix 4",null,100,0,0,0,2024);
    }

    public VideoSimple getTrailer() {
        return trailer;
    }

    public void setTrailer(VideoSimple trailer) {
        this.trailer = trailer;
    }
    
    @Override
    public ArrayList<VideoSimple> busqueda(Criterio criterio){
        ArrayList<VideoSimple> aux = new ArrayList<>();
        aux.addAll(super.busqueda(criterio));
        aux.add(trailer);
        return aux;
    }
}
