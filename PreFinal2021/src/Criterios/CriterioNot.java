package Criterios;

import Videos.VideoSimple;

public class CriterioNot extends Criterio{
    private Criterio criterio;

    public CriterioNot(Criterio criterio){
        this.criterio = criterio;
    }

    public boolean cumple(VideoSimple video){
        return !criterio.cumple(video);
    }
}
