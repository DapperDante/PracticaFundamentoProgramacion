package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 8-Unidad 5. Calcular area de un circulo, triangulo y cuadrado
 * */
public class CalculoArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un lado de la figura: ");
		int lado1 = sc.nextInt();
		System.out.println("Ingrese el otro lado de la figura: ");
		int lado2 = sc.nextInt();
		System.out.println("El area de un circulo es: "+areaCirculo(lado1));
		System.out.println("El area de un cuadrado es: "+areaCuadrado(lado1, lado2));
		System.out.println("El area de un triangulo es: "+areaTriangulo(lado1, lado2));
	}
	public static double areaTriangulo(int lado1, int lado2) {
		return (lado1*lado2)/2;
	}
	public static double areaCuadrado(int lado1, int lado2) {
		return lado1*lado2;
	}
	public static double areaCirculo(int lado1) {
		return (Math.PI*Math.pow((lado1/2),2));
	}
}
