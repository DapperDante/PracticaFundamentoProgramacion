package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 6-Unidad 5. Contar los digitos de un integer
 * */
public class ConteoIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int input = sc.nextInt();
		System.out.println("Tiene "+conteoOperacion(input)+" digitos");

	}
	public static int conteoOperacion(int num) {
		int conteo = 0, numero = num;
		while(numero != 0) {
			numero /= 10;
			conteo++;
		}
		return conteo;
	}
}
