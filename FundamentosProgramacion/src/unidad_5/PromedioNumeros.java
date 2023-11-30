package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 4-Unidad 5. Hallar el promedio de los numeros ingresados
 * */
public class PromedioNumeros {

	public static void main(String[] args) {
		System.out.println("El promedio los numeros ingresados es: "+ingresoNumeros(5));
	}
	public static int ingresoNumeros(int numIngresos) {
		Scanner sc = new Scanner(System.in);
		int promedio = 0;
		for(int i = 0; i < numIngresos; i++) {

			System.out.println("Ingrese un numero");
			int input = sc.nextInt();
			promedio += input;
		}
		return (int)promedio/numIngresos;
	}

}
