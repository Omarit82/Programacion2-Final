package Videos;

import java.util.ArrayList;

import Criterios.Criterio;
import Usuario.Usuario;

public class VideoSimple extends ElementoVideo{
    private Usuario usuario;
    private int duracion;
    private int cantidadVisualizaciones;
    private int cantidadMeGusta;
    private int cantidadNoMeGusta;
    private int anioPublicacion;
    
    public VideoSimple(String titulo, Usuario usuario, int duracion, int cantidadVisualizaciones, int cantidadMeGusta,
            int anioPublicacion, int cantidadNoMeGusta) {
        super(titulo);
        this.usuario = usuario;
        this.duracion = duracion;
        this.cantidadVisualizaciones = cantidadVisualizaciones;
        this.cantidadMeGusta = cantidadMeGusta;
        this.anioPublicacion = anioPublicacion;
        this.cantidadNoMeGusta = cantidadNoMeGusta;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadVisualizaciones() {
        return cantidadVisualizaciones;
    }

    public void setCantidadVisualizaciones(int cantidadVisualizaciones) {
        this.cantidadVisualizaciones = cantidadVisualizaciones;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void setCantidadMeGusta(int cantidadMeGusta) {
        this.cantidadMeGusta = cantidadMeGusta;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /* Criterio de busqueda */
    public ArrayList<VideoSimple> busqueda(Criterio criterio){
        ArrayList<VideoSimple> aux = new ArrayList<>();
        if(criterio.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

    public int cantidadVideos(){
        return 1;
    }

    public int getCantidadNoMeGusta() {
        return cantidadNoMeGusta;
    }

    public void setCantidadNoMeGusta(int cantidadNoMeGusta) {
        this.cantidadNoMeGusta = cantidadNoMeGusta;
    }
}
