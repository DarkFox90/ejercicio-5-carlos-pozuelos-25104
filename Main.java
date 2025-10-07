/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * Ejercicio 5: polimorfismo via herencia
 * fecha de creación: 4 de octubre de 2025
 * ultima modificación: 6 de octubre de 2025
 */

public class Main {
    public static void main(String[] args) {
       // Crear el controlador
        Controlador controlador = new Controlador();
        
        // Registra los procesos
        controlador.registrarProceso();
        
        // Ejecuta los procesos
        controlador.ejecutar();

    }
}