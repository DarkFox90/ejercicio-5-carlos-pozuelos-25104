//controlador
import java.util.ArrayList;

public class Controlador {
    private ArrayList<Proceso> procesos;
    private Vista menu;

    public Controlador() {
        procesos = new ArrayList<>();
        menu = new Vista();
    }

    public void registrarProceso() {
        //aqui se inicializan las variables para los constructores de cada proceso. Mediante menu se utiliza scanner para almacenar los datos ingresados por el usuario
        String nombre = menu.pedirIdentificacion("ingrese su nombre: ");
        int numero1 = menu.pedirNumeros();
        int numero2 = menu.pedirNumeros();

        //aqui se crean los 3 procesos diferentes
        Proceso proceso1 = new CPU(1, "suma", numero1, numero2);
        Proceso proceso2 = new ProcesoIO(2, "nombre", menu, nombre);  
        Proceso proceso3 = new Daemons(3, "repetición de texto");  

        //se añaden al arrayList que se usara en main
        procesos.add(proceso1);
        procesos.add(proceso2);
        procesos.add(proceso3);
    }

    public void ejecutar() {
        //por cada proceso en el arrayList procesos va a ejecutar las acciones y  omstrar los resultados
        for (Proceso proceso : procesos) {
            proceso.ejecutarAccion();
        }

        menu.mostrarResultados(procesos.get(0), procesos.get(1), procesos.get(2));
    }
}
