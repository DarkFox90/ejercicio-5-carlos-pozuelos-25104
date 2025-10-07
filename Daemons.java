//modelo
public class Daemons extends Proceso {
    //eliminé inicio y fin ya que no hacían nada
    private String mensaje = ""; //añadi este atributo para poder usarlo en ejecutarAccion

    public Daemons(int pid, String nombre) {
        super(pid, nombre);
    }

    //for loop que muestra el mensaje prueba daemon 5 veces
    @Override
    public void ejecutarAccion() {
        for (int i = 1; i <= 5; i++) {
            mensaje += nombre + " (" + i + "): prueba daemon\n";
        }
    }

    //convierte a string mensaje que se crea en ejecutarAccion
    @Override
    public String toString() {
        return mensaje;
    }
}


