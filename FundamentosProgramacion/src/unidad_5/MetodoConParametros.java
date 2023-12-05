package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 15-Unidad 5. Metodo con parametros.
 * */
public class MetodoConParametros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un texto: ");
		String input = sc.nextLine();
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		System.out.println(condiciones(input, num));
	}
	public static String condiciones(String text, int num) {
		return (num==1)?text.toUpperCase() : text.toLowerCase();
	}
}
