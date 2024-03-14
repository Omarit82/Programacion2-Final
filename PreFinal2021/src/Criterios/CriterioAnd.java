package Criterios;

import Videos.VideoSimple;

public class CriterioAnd extends Criterio{
    private Criterio criterio1;
    private Criterio criterio2;

    public CriterioAnd(Criterio criterio1,Criterio criterio2){
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(VideoSimple video){
        return criterio1.cumple(video)&&criterio2.cumple(video);
    }
}
