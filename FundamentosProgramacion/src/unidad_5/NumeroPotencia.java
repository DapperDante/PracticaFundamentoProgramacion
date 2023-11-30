package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 5-Unidad 5. La potencia de un numero
 * */
public class NumeroPotencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		System.out.println("Ingrese una potencia: ");
		int potencia = sc.nextInt();
		System.out.println("Resultado: " +potenciaOperacion(num, potencia));
	}
	public static int potenciaOperacion(int num, int potencia) {
		return (int)Math.pow(num, potencia);
	}

}
