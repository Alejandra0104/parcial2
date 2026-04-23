import java.time.LocalDateTime;

public class cliente 
{
    private int id;
    private String Nombre;
    private String Tipo;
    private LocalDateTime Hora;
    private boolean estado;

    public cliente() {
    }

    public cliente(String Nombre, String Tipo,LocalDateTime Hora, boolean estado, int id) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Hora = Hora;
        this.estado = estado;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getHora() {
        return Hora;
    }

    public void setHora(LocalDateTime Hora) {
        this.Hora = Hora;
    }

    @Override
    public String toString() {
        return   id +
               "Nombre: " + Nombre +
               " -Tipo Servicio: " + Tipo +
               " -Hora de llegada: " + Hora+
               " -Atendido: " + estado;
    }

}
