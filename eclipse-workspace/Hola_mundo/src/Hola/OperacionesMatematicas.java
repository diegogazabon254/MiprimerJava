package Hola;

public class OperacionesMatematicas {

	public static void main(String[] lex) {
		
		// Imagina que tienes 10 aprendices y queremos organizarlos en grupos de 3 cual es el resultado? 
		
		int aprendices = 10;
		int grupos = 3;
		int resultado = aprendices % grupos;
		
		System.out.println("Los grupos de aprendices se conforman por " + grupos + " miembros por grupo y sobra " + resultado + " Aprendiz");
		
		
	}

}
