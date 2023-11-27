package unidad_4;
import java.util.Random;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 18-Unidad 4. Multiplicar elementos por un escalar.
 * */
public class MultiplicarElementos {

	public static void main(String[] args) {
		MultiplicarElementos obj = new MultiplicarElementos();
		Scanner sc = new Scanner(System.in);
		int[] arreglo = obj.crearArreglo(5);
		obj.impresionArregloInt(arreglo);
		System.out.println("\nIngrese el numero a multiplicar:");
		int escalar = sc.nextInt();
		int[] arrMultiplicacion = obj.multiplicacionArreglo(arreglo, escalar);
		obj.impresionArregloInt(arrMultiplicacion);
	}
	public int[] crearArreglo(int size) {
		Random rd = new Random();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(21);
		}
		return arr;
	}
	public void impresionArregloInt(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public int[] multiplicacionArreglo(int[] arr, int escalar) {
		int[] arrMultiplicacion = new int[arr.length];
		for(int i = 0; i < arrMultiplicacion.length;i++) {
			arrMultiplicacion[i] = arr[i] * escalar; 
		}
		return arrMultiplicacion;
	}
}
