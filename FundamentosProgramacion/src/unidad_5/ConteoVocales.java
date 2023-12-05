package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 13-Unidad 5. Conteo de vocales de un texto
 * */
public class ConteoVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String input = sc.nextLine();
		System.out.println("Numero de vocales: "+conteoVocales(input));
	}
	public static int conteoVocales(String text) {
		int conteo = 0;
		String textMinusculas = text.toLowerCase();
		for(int i = 0; i < textMinusculas.length(); i++) {
			int l = textMinusculas.charAt(i);
			if(l=='a' || l=='e'||l=='i'||l=='o' || l=='u') {
				conteo++;
			}
		}
		return conteo;
	}
}
