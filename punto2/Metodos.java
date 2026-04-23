import java.util.Queue;

public class Metodos 
{
    public static void mostrarMenu() {
        System.out.println("--------------------------------");
        System.out.println("Sistema Banco");
        System.out.println("--------------------------------");
        System.out.println("1. Nuevo cliente");
        System.out.println("2. Atender cliente");
        System.out.println("3. Ver proximo cliente");
        System.out.println("4. Clientes en espera");
        System.out.println("5. Todos los turnos");
        System.out.println("6. Salir");
    }

    public String agendar(cliente c, Queue<cliente> cola) {
        cola.add(c);
        return "Cliente agregado a la cola";
    }

    public cliente atenderCliente(Queue<cliente> cola, Queue<cliente> atendidos) {
        if (cola.isEmpty()) {
            return null;
        } else {
            cliente c = cola.poll();
            c.setEstado(true);
            atendidos.add(c);
            return c;
        }
    }

    public cliente verSiguiente(Queue<cliente> cola) {
        return cola.peek(); // devuelve null si está vacía
    }

    public String verCola(Queue<cliente> cola) {
        if (cola.isEmpty()) {
            return "No hay clientes en espera";
        }

        String resultado = "Clientes en espera:\n";
        for (cliente c : cola) {
            resultado += c.toString() + "\n";
        }
        return resultado;
    }

    public String mostrarTurnos(Queue<cliente> cola, Queue<cliente> atendidos) {
        String resultado = "clientes atendidos\n";

        for (cliente c : atendidos) {
            resultado += c.toString() + "\n";
        }

        resultado += "Clientes pendientes\n";

        for (cliente c : cola) {
            resultado += c.toString() + "\n";
        }

        return resultado;
    }
}