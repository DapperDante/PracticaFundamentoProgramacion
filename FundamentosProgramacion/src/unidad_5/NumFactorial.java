package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 2-Unidad 5. el factorial de 
 * */
public class NumFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numereo: ");
		int input = sc.nextInt();
		numFactorial(input);
	}
	public static void numFactorial(int num) {
		int resultado = 1;
		for(int i = 1; i <= num; i++) {
			resultado *= i;
		}
		System.out.println("El numero factorial es: "+resultado);
	}
}
