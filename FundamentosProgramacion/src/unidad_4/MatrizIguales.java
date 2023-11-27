package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 23-Unidad 4. Comprobar si dos matrices son iguales
 * */
public class MatrizIguales {

	public static void main(String[] args) {
		SumaElementosMatrices obj = new SumaElementosMatrices();
		int[][] matriz1 = obj.crearMatriz(3);
		obj.impresionMatriz(matriz1);
		System.out.println();
		int[][] matriz2 = obj.crearMatriz(3);
		obj.impresionMatriz(matriz2);
		System.out.println("\n" + matricesIguales(matriz1, matriz2));		
	}
	public static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[i].length; j++) {
				if(!matriz1.equals(matriz2)) {
					return false;
				}
			}
		}
		return true;
	}

}
