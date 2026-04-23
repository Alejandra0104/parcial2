import java.util.Scanner;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) 
    {
        Stack<PaginaWeb> historial = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Metodos met = new Metodos();
        boolean seguir = true;

        
        while(seguir) {
            met.mostrarMenu();

            int opcion;

            System.out.print("Ingrese la opcion que desea: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sc.nextLine(); 

                    String url;
                    String nombre;

                    System.out.print("Ingrese la url que desea visitar: ");
                    url = sc.nextLine();

                    System.out.print("Ingrese el titulo de la pagina: ");
                    nombre = sc.nextLine();

                    historial = met.visitarPagina(url, nombre, historial);

                    break;
            
                case 2:
                    met.retroceder(historial);

                    break;
                case 3:
                    met.verHistorial(historial);

                    break;
                case 4:
                    System.out.println("Saliendo...");
                    seguir = false;
                    break;
                default:
                    System.out.println("Esa opción no existe, por favor intentelo de nuevo.");

                    break;
            }
        }
    }
}
