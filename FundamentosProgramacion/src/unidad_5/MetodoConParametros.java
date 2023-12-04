package unidad_5;
import java.util.Scanner;
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
		if(num == 1) {
			return text.toUpperCase();
		}else {
			return text.toLowerCase();
		}
	}
}
