package Criterios;

import Videos.VideoSimple;

public class CriterioAutor extends Criterio{
    private String autor;

    public CriterioAutor (String autor){
        this.autor = autor;
    }

    @Override
    public boolean cumple(VideoSimple video){
        return video.getUsuario().getNombreUsuario().equals(autor);
    }
}
