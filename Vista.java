import java.util.Scanner;

public class Vista {
    private Scanner sc;

    public Vista() {
        sc = new Scanner(System.in);
    }

    public String pedirIdentificacion() {
        System.out.print("ingrese su nombre: ");
        return sc.nextLine();
    }

    public int pedirNumeros() {
        System.out.println("ingrese un numero: ");
        int numero = sc.nextInt();
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
