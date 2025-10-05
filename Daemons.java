public class Daemons extends Proceso {
   
    private int inicio;
    private int fin;

    public Daemons(int pid, String nombre, int inicio, int fin) {
        super(pid, nombre);
        this.inicio = inicio;
        this.fin = fin;
    }


    @Override
    public void ejecutarAccion() {
        
    }
}


