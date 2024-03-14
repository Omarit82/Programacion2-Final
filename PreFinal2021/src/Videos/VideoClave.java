package Videos;

import Usuario.Usuario;

public class VideoClave extends VideoSimple{

    public VideoClave (String titulo, Usuario usuario, int duracion, int cantidadVisualizaciones, int cantidadMeGusta,int cantidadNoMeGusta, int anioPublicacion){
        super(titulo, usuario, duracion, cantidadVisualizaciones, cantidadMeGusta,cantidadNoMeGusta, anioPublicacion);
    }

    @Override
    public boolean contieneTag(String tag){
        return true;
    }
    
}
