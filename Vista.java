//vista
import java.util.Scanner;

public class Vista {
    private Scanner sc;

    public Vista() {
        sc = new Scanner(System.in);
    }

    //añadí un parametro de mensaje para poder pedir un nombre y un apellido en procesoIO
    public String pedirIdentificacion(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    //pide un numero y lo guarda para usarlo en CPU
    public int pedirNumeros() {
        System.out.print("ingrese un numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    //cambie el valor de retorno a void ya que no estaba haciendo ningun proceso aqui
    public void mostrarResultados(Proceso p1, Proceso p2, Proceso p3) {
        System.out.println("\nResultados de las operaciones:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
