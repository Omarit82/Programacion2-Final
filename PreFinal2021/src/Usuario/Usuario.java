package Usuario;

public class Usuario {
    private String nombreUsuario;
    private int anioRegistro;
    private String email;
    
    public Usuario(String nombreUsuario, int anioRegistro, String email) {
        this.nombreUsuario = nombreUsuario;
        this.anioRegistro = anioRegistro;
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(int anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
