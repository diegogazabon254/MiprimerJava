package Hola;
import java.util.Scanner;
public class estructuraCondicionalSimple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float sueldo;
		
		System.out.print("Ingrese su sueldo: ");
		sueldo = scanner.nextFloat();
		
		/*if (sueldo > 3000) {
			*System.out.println("Debes pagar impuestos");
		*	
		*} else {
		*	System.out.println("Estas excento de impuestos");
		*/
		String respuesta = (sueldo > 3000) ? "Debes pagar impuests" : "Estas excento a impuestos";
		System.out.println(respuesta);
	}
		
	} 


