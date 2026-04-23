import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Queue<cliente> cola = new LinkedList<>();
        Queue<cliente> atendidos = new LinkedList<>();

        Metodos m = new Metodos();
        boolean seguir = true;

        while (seguir) 
        { 
            m.mostrarMenu();

            System.out.print("Ingrese la accion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
               case 1:
                    sc.nextLine();

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Servicio: ");
                    String servicio = sc.nextLine();

                    cliente c = new cliente(nombre, servicio, LocalDateTime.now(), false, id);
                    System.out.println(m.agendar(c, cola));
                    break;

                case 2:
                    cliente atendido = m.atenderCliente(cola, atendidos);
                    if (atendido == null) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("\nCliente atendido:\n" + atendido);
                    }
                    break;

                case 3:
                    cliente siguiente = m.verSiguiente(cola);
                    if (siguiente == null) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("\nSiguiente cliente:\n" + siguiente);
                    }
                    break;

                case 4:
                    System.out.println(m.verCola(cola));
                    break;

                case 5:
                    System.out.println(m.mostrarTurnos(cola, atendidos));
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    seguir = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}