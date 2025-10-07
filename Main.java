/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * Ejercicio 5: polimorfismo via herencia
 * fecha de creación: 4 de octubre de 2025
 * ultima modificación: 6 de octubre de 2025
 */

public class Main {
    public static void main(String[] args) {
        Proceso p1 = new CPU(1, "suma", 89, 56);
        Proceso p2 = new Daemons(2, "repetición de mensaje");
        p1.ejecutarAccion();
        System.out.println(p1);
        p2.ejecutarAccion();
        System.out.println(p2);

    }
}