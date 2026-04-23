import java.time.LocalDateTime;
import java.util.Stack;

public class Metodos
{
    
    public static void mostrarMenu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a brave");
        System.out.println("--------------------------------");
        System.out.println("Escoja la accion que desea realizar: ");
        System.out.println("1. Visitar pagina nueva");
        System.out.println("2. Retroceder");
        System.out.println("3. Ver historial actual");
        System.out.println("4. salir");
    }

    public static Stack<PaginaWeb> visitarPagina(String url, String nombre, Stack<PaginaWeb> historial) {
        
        String fecha = LocalDateTime.now().toString();
        PaginaWeb nuevaPagina = new PaginaWeb(url, nombre, fecha);
        
        historial.push(nuevaPagina);

        System.out.println("Ahora estás en la pagina " + nombre);
        return historial;
    }

    public static PaginaWeb retroceder(Stack<PaginaWeb> historial) {

        Stack<PaginaWeb> aux = new Stack<>();
        
        
        if(!historial.isEmpty() && historial.size() > 1) {
            
            aux.push( historial.pop());

            PaginaWeb paginaActual = historial.peek();

            historial.push(aux.pop());

            System.out.println("Ahora estás en la página " + paginaActual.getNombre());
            System.out.println(paginaActual.toString());
            return paginaActual;

        } else {
        
            System.out.println("No existe pagina anterior");
            return historial.peek();
        }
    }

    public static void verHistorial(Stack<PaginaWeb>historial) {
       
       Stack<PaginaWeb> aux = new Stack<>();

        if(!historial.isEmpty()) {
            for(PaginaWeb paginaActual : historial) {
                System.out.println(paginaActual.toString());
            }
        } else 
            System.out.println("No hay historial aún"); 
   }
}