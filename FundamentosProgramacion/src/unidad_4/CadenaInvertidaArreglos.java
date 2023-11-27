package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 17-Unidad 4. Reversa de cadena
 * 
 * */
public class CadenaInvertidaArreglos {

	public static void main(String[] args) {
		CadenaOrdenLongitud obj = new CadenaOrdenLongitud();
		String[] cadena = obj.entradaCadena(5);
		obj.impresionArreglos(cadena);
		System.out.println();
		String[] invertido = cadenaInvertida(cadena);
		obj.impresionArreglos(invertido);
		
	}
	public static String[] cadenaInvertida(String[] arr) {
		String[] invertida = new String[arr.length];
		String cadenaInvertida = "";
		for(int i = 0; i < invertida.length; i++) {
			for(int c = arr[i].length()-1; c >= 0; c--) {
				cadenaInvertida += arr[i].charAt(c);
			}
			invertida[i] = cadenaInvertida;
			cadenaInvertida =  "";
		}
		return invertida;
	}
}
