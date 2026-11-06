package Hola;
import java.util.Scanner;
public class ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Ingrese el primer numero: ");
		numero1 = scanner.nextInt();
		System.out.print("Ingrese el primer numero: ");
		numero2 = scanner.nextInt();
		
		String respuesta = (numero1 > numero2)    
	            ? "La suma es: " + (numero1 + numero2) + " y la resta es: " + (numero1 - numero2)
	            : "El producto es: " + (numero1 * numero2) + " \nLa division es: " + (numero2 == 0 
	            ? "No se puede dividir entre 0" : ((float)numero1 / numero2));
		
		System.out.println(respuesta);
		scanner.close();
			
		
		

	}

}
