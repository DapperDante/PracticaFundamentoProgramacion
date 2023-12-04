package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm 
 * Programa: 12-Unidad 5. Conteo de palabras de un texto
 * */
public class ConteoPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String input = sc.nextLine();
		System.out.println("El numero de palabras es: "+conteoPalabras(input));
	}
	public static int conteoPalabras(String text) {
		return text.length();
	}
}
