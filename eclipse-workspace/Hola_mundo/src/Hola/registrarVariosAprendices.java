package Hola;
import java.util.Scanner;
public class registrarVariosAprendices {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cantidad;
		String nombre;
		
		System.out.print("Cuantos aprendices desea ingresar: ");
		cantidad = scanner.nextInt();
		
		scanner.nextLine();
		
		for (int i = 1; i <= cantidad; i = i+1) {
			System.out.print("Ingrese el nombre del aprendiz " + i + ": ");
			nombre = scanner.nextLine();
			
			System.out.println("Aprendiz Registrado");
		}
		System.out.print("Registro finalizado");
		scanner.close();
		
	}
}
