
import java.io.Serializable;

//Jhonatan
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L; // Identificador de versión para la serialización
    private int clave;
    private String nombre;
    private String apellido;
    private double lineaDeCredito;

    public Cliente(int clave, String nombre, String apellido, double lineaDeCredito) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lineaDeCredito = lineaDeCredito;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getLineaDeCredito() {
        return lineaDeCredito;
    }

    public void setLineaDeCredito(double lineaDeCredito) {
        this.lineaDeCredito = lineaDeCredito;
    }
}
