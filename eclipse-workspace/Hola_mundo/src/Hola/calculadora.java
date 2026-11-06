package Hola;
import java.util.Scanner;
public class calculadora {
	
	public static int sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}
	
	public static int restar(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		return resultado;
	}
	
	public static int multiplicar(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}

	public static void main (String[] lex) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		System.out.println("Bienvenido a la calculadora");
		System.out.println("1 Sumar");
		System.out.println("2 Restar");
		System.out.println("3 Multiplicar");
		System.out.println("4 Salir");
		
		
		
		
		// choose option 
		
		System.out.print("Ingrese la opcion: ");
		int opcion = scanner.nextInt();
		
		if (opcion == 1) {
			System.out.println("Vamos a realizar la suma");
			
			System.out.print("Ingrese el primer numero: ");
			int numero1 = scanner.nextInt();
			
			System.out.print("Ingrese el segundo numero: ");
			int numero2 = scanner.nextInt();
			
			int suma = sumar(numero1,numero2);
			System.out.println("El resultado es: "+ suma);
		}
		
		else if (opcion == 2) {
			System.out.println("Vamos a realizar la Resta");
			
			System.out.print("Ingrese el primer numero: ");
			int numero1 = scanner.nextInt();
			
			System.out.print("Ingrese el segundo numero: ");
			int numero2 = scanner.nextInt();
			
			int resta = restar(numero1,numero2);
			System.out.println("El resultado es: "+ resta);
			
		}
		
		else if (opcion == 3) {
			System.out.println("Vamos a realizar la Multiplicacion");
			
			System.out.print("Ingrese el primer numero: ");
			int numero1 = scanner.nextInt();
			
			System.out.print("Ingrese el segundo numero: ");
			int numero2 = scanner.nextInt();
			
			int multiplicacion = multiplicar(numero1,numero2);
			System.out.println("El resultado es: "+ multiplicacion);
			
		}
		
		else if (opcion == 4) {
			System.out.println("Saliendo de la calculadora");
			break;
		}
		
		else  {
			System.out.println("Eliga una opcion valida");
			
		}
		
		}
		scanner.close();
		
		
	}
}

