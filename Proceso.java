public abstract class Proceso {
    protected int pid;
    protected String nombre;

    public Proceso(int pid, String nombre) {
        this.pid = pid;
        this.nombre = nombre;
    }

    //metodo abstracto que utilizaran las clases hijas
    public abstract void ejecutarAccion();
    
    
}
