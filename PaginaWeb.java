public class PaginaWeb
{
    private String url;
    private String nombre;
    private String Fecha;


    public PaginaWeb() {
    }
    public PaginaWeb(String url, String nombre, String Fecha) {
        this.url = url;
        this.nombre = nombre;
        this.Fecha = Fecha;

    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    @Override
    public String toString() {
        return "PaginaWeb [url=" + url + ", nombre=" + nombre + ", fecha=" + Fecha + "]";
    }

    

    
}