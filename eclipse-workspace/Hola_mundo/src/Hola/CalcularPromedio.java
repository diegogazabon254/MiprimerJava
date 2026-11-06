package Hola;
import java.util.Scanner;
public class CalcularPromedio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String nombre ;
		float nota1 ;
		float nota2 ;
		float nota3 ;
		double minima = 3.6;
		
		System.out.print("Ingres su nombre: ");
		nombre = scanner.nextLine();
		
		System.out.print("Ingrese la nota1: ");
		nota1 = Float.parseFloat(scanner.next().replace(",","."));
		System.out.print("Ingres la nota2: ");
		nota2 = Float.parseFloat(scanner.next().replace(",","."));
		System.out.print("Ingres la nota3: ");
		nota3 = Float.parseFloat(scanner.next().replace(",","."));
		
		double promedio = ((nota1 + nota2 + nota3) / 3);
		String resultado = (promedio < minima) ? " perdio el trimestre" : " gano el trimestre";
		
		System.out.printf("El aprendiz %s Tiene un promedio de %.1f \n",nombre, promedio);
		System.out.print("El aprendiz " + nombre + resultado);
		scanner.close();
	}

}
