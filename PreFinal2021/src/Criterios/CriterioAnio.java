package Criterios;

import Videos.VideoSimple;

public class CriterioAnio extends Criterio{
    private int anio;

    public CriterioAnio(int anio){
        this.anio = anio;
    }

    @Override
    public boolean cumple(VideoSimple video){
        return video.getAnioPublicacion() == anio;
    }
}
