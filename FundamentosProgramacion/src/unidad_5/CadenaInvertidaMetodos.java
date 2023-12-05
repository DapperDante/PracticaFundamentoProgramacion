package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm 
 * Programa: 11-Unida 5. Cadena invertida con parametros
 * */
public class CadenaInvertidaMetodos {

	public static void main(String[] args) {
		CadenaInvertidaMetodos obj = new CadenaInvertidaMetodos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String input = sc.nextLine();
		System.out.println("El texto inverdio es: "+obj.cadenaInvertida(input));
	}
	public String cadenaInvertida(String text) {
		String invertido = "";
		for(int i = text.length(); i > 0; i--) {
			invertido += text.charAt(i-1);
		}return invertido;
	}
}
