public class Daemons extends Proceso {
   
    private int inicio;
    private int fin;
    private String mensaje = "";

    public Daemons(int pid, String nombre, int inicio, int fin) {
        super(pid, nombre);
        this.inicio = inicio;
        this.fin = fin;
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


