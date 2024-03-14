package Criterios;

import Videos.VideoSimple;

public class CriteriosTag extends Criterio{
    private String tag;

    public CriteriosTag(String tag){
        this.tag = tag;
    }

    @Override
    public boolean cumple(VideoSimple video){
        return video.contieneTag(tag);
    }
    
}
