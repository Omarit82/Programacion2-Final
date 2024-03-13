import java.util.ArrayList;

public class PiezaCompuesta extends Pieza{
    private ArrayList<Pieza> piezas;
    
    public PiezaCompuesta(String nombre, String descripcion, double plaNecesario, String color, int tiempoEstimado) {
        super(nombre, descripcion, plaNecesario, color, tiempoEstimado);
        piezas = new ArrayList<>();
    }
    
}
