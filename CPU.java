public class CPU extends Proceso{
    private int numero1;
    private int numero2;
    private int resultado; 
    private int resultado2; 
    private int resultado3;
    //añadí resultado, resultado2 y resultado3 para poder utilizarlos correctamente en ejecutarAccion ya que al ser void necesito guardar las operaciones en una variable para convertirla a string en el toString

    public CPU(int pid, String nombre, int numero1, int numero2) {
        super(pid, nombre); //llama al constructor de proceso
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //guarda una suma una resta y una multiplicación en 3 variables, resultado, resultado2 y resultado3
    @Override
    public void ejecutarAccion() {
        resultado = numero1 + numero2;
        resultado2 = numero1 - numero2;
        resultado3 = numero1 * numero2;
    }

    //permite convertir a String los cálculos hechos en ejecutarAcción
    @Override
    public String toString() {
        return "la suma realizada tiene como resultado: " + resultado + "\n" +
        "la resta realizada tiene como resultado: " + resultado2 + "\n" + 
        "la multiplicación realizada tiene como resultado: " + resultado3;
    }
}


