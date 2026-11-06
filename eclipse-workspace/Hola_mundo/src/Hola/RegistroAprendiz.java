package Hola;
import java.util.Scanner;

public class RegistroAprendiz {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        String nombre;
        int edad;
        int ficha;
        String programa;
        boolean activo;
        String trimestre;
        
        
        System.out.println("=== REGISTRO DE APRENDIZ ===");
        
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        
        System.out.print("Ingrese el numero de su Ficha: ");
        ficha = scanner.nextInt();
        
      
        scanner.nextLine();
        
        System.out.print("Programa de formacion: ");
        programa = scanner.nextLine();
        
        System.out.print("¿En que estado se encuentra? (true = activo, false = no activo): ");
        activo = scanner.nextBoolean();
        

        scanner.nextLine();
        
        System.out.print("Trimestre en que se encuentra: ");
        trimestre = scanner.nextLine();
        
        
        String resultado = activo ? "activo" : "no activo";
        
       
        System.out.println("\n--- INFORMACIÓN DEL APRENDIZ ---");
        System.out.println("El aprendiz " + nombre + " tiene " + edad + " años,\n" 
                + "hace parte de la ficha: " + ficha + " del programa de formación " + programa + 
                ", su estado actual es " + resultado + " en el " + trimestre + " trimestre.");

        scanner.close();
    }
}