package Criterios;

import Videos.VideoSimple;

public class CriterioMasVisualizaciones extends Criterio{
    
    private int visualizaciones;

    public CriterioMasVisualizaciones(int visualizaciones){
        this.visualizaciones = visualizaciones;
    }

    @Override
    public boolean cumple(VideoSimple video){
        return video.getCantidadVisualizaciones()>visualizaciones;
    }
}
