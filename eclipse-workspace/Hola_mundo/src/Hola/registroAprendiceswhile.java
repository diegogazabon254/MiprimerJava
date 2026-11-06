package Hola;
import java.util.Scanner;

public class registroAprendiceswhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contador = 1;
        int totalAprendices;
        String nombre;
        
        System.out.print("¿Cuántos aprendices deseas registrar?: ");
        totalAprendices = teclado.nextInt();
        teclado.nextLine(); 
        
        while (contador <= totalAprendices) {
            System.out.print("Ingrese el nombre del aprendiz número " + contador + ": ");
            nombre = teclado.nextLine();
            
            System.out.println("Aprendiz registrado: " + nombre);
            
            contador++; 
        }
        
        System.out.println("\nRegistro finalizado con éxito.");
        teclado.close();
    }
}