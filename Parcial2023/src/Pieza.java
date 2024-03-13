public abstract class Pieza {
    
    private String nombre;
    private String descripcion;
    private double plaNecesario;
    private String color;
    private int tiempoEstimado;
    
    public Pieza(String nombre, String descripcion, double plaNecesario, String color, int tiempoEstimado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.plaNecesario = plaNecesario;
        this.color = color;
        this.tiempoEstimado = tiempoEstimado;
    }
    
    
}
