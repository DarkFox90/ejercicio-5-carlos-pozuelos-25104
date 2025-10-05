import java.util.ArrayList;

public class Controlador {
    private ArrayList<Proceso> procesos;
    private Vista menu;


    public void registrarProceso(Proceso p) {
        procesos.add(p);
    }
}
