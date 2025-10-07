public class ProcesoIO extends Proceso{
    private Vista vista;
    private String nombre;
    private String apellido;
    //eliminé identificación ya que no estaba haciendo nada y añadí nombre y apellido para que ejecutarAcción almacene ambos datos
    
    //añadí en el constructor nombreUsuario que es el que pide en controlador, almacena el nombre que el usuario ingrese
    public ProcesoIO(int pid, String nombre, Vista vista,  String nombreUsuario) {
        super(pid, nombre);
        this.vista = vista;
        this.nombre = nombreUsuario;
    }

    //le pide al usuario mediante el scanner en vista el apellido 
    @Override
    public void ejecutarAccion() {
        apellido = vista.pedirIdentificacion("ingrese su apellido: ");
    }

    @Override
    public String toString() {
        return "tu nombre es: " + nombre + " y tu apellido es: " + apellido;
    }
}
