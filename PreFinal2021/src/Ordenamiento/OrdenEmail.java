package Ordenamiento;

import java.util.Comparator;
import Videos.VideoSimple;

public class OrdenEmail implements Comparator<VideoSimple>{
    @Override
    public int compare(VideoSimple v1, VideoSimple v2){
        return v1.getUsuario().getEmail().compareTo(v2.getUsuario().getEmail());
    }
}
