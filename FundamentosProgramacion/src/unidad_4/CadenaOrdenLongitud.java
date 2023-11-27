package unidad_4;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 16-Unidad 4. Ordenar Cadena por longitud
 * 
 * */
public class CadenaOrdenLongitud {

	public static void main(String[] args) {
		CadenaOrdenLongitud obj = new CadenaOrdenLongitud();
		String[] input = obj.entradaCadena(5);
		obj.impresionArreglos(input);
		System.out.println();
		String[] inputReverse = obj.ordenCadenaArreglo(input);
		obj.impresionArreglos(inputReverse);
	}
	//inicialización y asignacion de un arreglo de cadenas
	public  String[] entradaCadena(int n) {
		Scanner sc = new Scanner(System.in);
		String[] cadena = new String[n];
		for(int i = 0; i < cadena.length; i++) {
			cadena[i] = sc.nextLine();
		}
		return cadena;
	}
	//impresion del arreglo
	public  void impresionArreglos(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	//orden de menor a mayor de un arreglo con la longitud de la cadena: Metodo burbuja
	public  String[] ordenCadenaArreglo(String[] cadena) {
		String[] reverso = cadena;
		String cadenaActual = "", cadenaSiguiente = "";
		for(int i = 0; i < reverso.length; i++) {
			for(int j = 0; j < reverso.length-1; j++) {
				//obtencion del actual y el siguiente elemento del arreglo
				cadenaActual = reverso[j];
				cadenaSiguiente = reverso[j+1];
				//Sí el actual es mayor al siguiente:
				if(cadenaActual.length() > cadenaSiguiente.length()) {
					//cambia la posicion del siguiente al actual y viceversa
					reverso[j] = cadenaSiguiente;
					reverso[j+1] = cadenaActual;
					cadenaActual = reverso[j+1];
					cadenaSiguiente = reverso[j];
				}
			}
		}
		return reverso;
	}
}
