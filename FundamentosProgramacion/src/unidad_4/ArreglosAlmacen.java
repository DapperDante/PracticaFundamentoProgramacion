package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm 
 * Programa: Almacenar 25 numeros en un arreglo.
 * */
public class ArreglosAlmacen {

	public static void main(String[] args) {
		MultiplicarElementos obj = new MultiplicarElementos();
		int[] arr = obj.crearArreglo(25);
		obj.impresionArregloInt(arr);
		System.out.println();
		int[] resultado = operacion(arr);
		obj.impresionArregloInt(resultado);
		
	}
	public static int[] operacion(int[] arr) {
		int[] arreglo = new int[arr.length];
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.pow(arr[i], 2);
		}
		return arreglo;
	}
}
