package unidad_5;
import java.util.Random;

/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 7-Unidad 5. Ordenar arreglo de manera ascendente
 * */
public class OrdenArreglo {

	public static void main(String[] args) {
		OrdenArreglo obj = new OrdenArreglo();
		int[] arr = obj.crearArreglo(5);
		obj.impresion(arr);
		System.out.println();
		int[] arrOrdenado = obj.ordenCadenaArreglo(arr);
		obj.impresion(arrOrdenado);
		
	}
	public void impresion(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public int[] crearArreglo(int size) {
		Random rd = new Random();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(21);
		}
		return arr;
	}
	public int[] ordenCadenaArreglo(int[] arr) {
		int[] arreglo = arr;
		int numActual = 0, numSiguiente = 0;
		for(int i = 0; i < arreglo.length; i++) {
			for(int j = 0; j < arreglo.length-1; j++) {
				//obtencion del actual y el siguiente elemento del arreglo
				numActual = arreglo[j];
				numSiguiente = arreglo[j+1];
				//Sí el actual es mayor al siguiente:
				if(numActual > numSiguiente) {
					//cambia la posicion del siguiente al actual y viceversa
					arreglo[j] = numSiguiente;
					arreglo[j+1] = numActual;
					numActual = arreglo[j+1];
					numSiguiente = arreglo[j];
				}
			}
		}
		return arreglo;
	}
}
