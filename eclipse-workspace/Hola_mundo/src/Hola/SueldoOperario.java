package Hola;
import java.util.Scanner;

public class SueldoOperario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String operario ;
		int valor_hora = 5;
		int horas_trabajadas;
		
		
		System.out.print("Ingrese su nombre: ");
		operario = scanner.nextLine();
		System.out.print("Ingrese sus horas trabajadas: ");
		horas_trabajadas = scanner.nextInt();
		
		int sueldo_total = valor_hora * horas_trabajadas;
		
		System.out.println("El trabajador " + operario + " Trabajo un total de " + horas_trabajadas + " horas va a cobrar un sueldo neto de " + sueldo_total + "€");
		
		scanner.close();

	}

}
