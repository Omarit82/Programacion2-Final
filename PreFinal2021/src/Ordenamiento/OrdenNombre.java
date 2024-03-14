package Ordenamiento;

import java.util.Comparator;
import Videos.VideoSimple;

public class OrdenNombre implements Comparator<VideoSimple>{
    @Override
    public int compare(VideoSimple video1,VideoSimple video2){
        return video1.getUsuario().getNombreUsuario().compareTo(video2.getUsuario().getNombreUsuario());
    }
}
