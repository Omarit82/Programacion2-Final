package Ordenamiento;

import java.util.Comparator;

import Videos.VideoSimple;

public class OrdenCompuesto implements Comparator<VideoSimple>{
    private Comparator<VideoSimple> primero;
    private Comparator<VideoSimple> segundo;

    public OrdenCompuesto(Comparator<VideoSimple> primero, Comparator<VideoSimple> segundo){
        this.primero = primero;
        this.segundo = segundo;
    }

    @Override
    public int compare(VideoSimple v1, VideoSimple v2){
        if(primero.compare(v1, v2) == 0){
            return segundo.compare(v1, v2);
        }else{
            return primero.compare(v1, v2);
        }
    }
}
