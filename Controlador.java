import java.util.ArrayList;

public class Controlador {
    private ArrayList<Proceso> procesos;
    private Vista menu;

    public Controlador() {
        procesos = new ArrayList<>();
        menu = new Vista();
    }

    public void registrarProceso() {
        String nombre = menu.pedirIdentificacion();
        int numero1 = menu.pedirNumeros();
        int numero2 = menu.pedirNumeros();

        Proceso proceso1 = new CPU(1, nombre, numero1, numero2);
        // Proceso proceso2 = new ProcesoIO(1, nombre, identificacion);
        Proceso proceso3 = new CPU(1, nombre, numero1, numero2);

        procesos.add(proceso1);
        procesos.add(proceso3);
    }

    public void ejecutar() {
        for (Proceso proceso : procesos) {
            proceso.ejecutarAccion();
        }

        menu.mostrarResultados(procesos.get(0), procesos.get(1), procesos.get(2));
    }
   
}
