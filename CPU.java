public class CPU extends Proceso{
    private int numero1;
    private int numero2;
    private int resultado; //añadi este atributo para que funcionara el metodo ejecutarAccion

    public CPU(int pid, String nombre, int numero1, int numero2) {
        super(pid, nombre); //llama al constructor de proceso
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public void ejecutarAccion() {
        resultado = numero1 + numero2;
    }

    @Override
    public String toString() {
        return "la suma realizada tiene como resultado: " + resultado;
    }
}


