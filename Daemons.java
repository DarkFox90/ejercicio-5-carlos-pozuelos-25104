public class Daemons extends Proceso {
    //eliminé inicio y fin ya que no hacían nada
    private String mensaje = ""; //añadi este atributo para poder usarlo en ejecutarAccion

    public Daemons(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public void ejecutarAccion() {
        for (int i = 1; i <= 5; i++) {
            mensaje += nombre + " (" + i + "): prueba daemon\n";
        }
    }

    @Override
    public String toString() {
        return mensaje;
    }
}


