public class CPU extends Proceso{
    private int numero1;
    private int numero2;

    public CPU(int pid, String nombre, int numero1, int numero2) {
        super(pid, nombre); //llama al constructor de proceso
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

 

    @Override
    public void ejecutarAccion() {
        int resultado = numero1 + numero2;
    }

    @Override
    public String toString() {
        int resultado = numero1 + numero2;
        return "la suma realizada tiene como resultado: " + resultado;
    }
}


