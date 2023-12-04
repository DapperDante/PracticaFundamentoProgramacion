package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16.17pm
 * Programa: 14-Unidad 5.Verificar si un texto en palindromo
 * */
public class Palindromo {

	public static void main(String[] args) {
		CadenaInvertidaMetodos obj = new CadenaInvertidaMetodos();
		System.out.println("Ingrese un texto: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String invertido = obj.cadenaInvertida(input);
		System.out.println("El texto es palindromo: " +(input.equals(invertido)));
	}
}
