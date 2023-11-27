package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 24-Unidad 4. Intercambio de dos lados de una matriz
 * */
public class IntercambioLadoMatriz {

	public static void main(String[] args) {
		SumaElementosMatrices obj = new SumaElementosMatrices();
		int[][] matriz = obj.crearMatriz(4);
		obj.impresionMatriz(matriz);
		System.out.println();
		int[][] matrizInvertida = cambioLadosMatriz(matriz);
		obj.impresionMatriz(matrizInvertida);
	}
	public static int[][] cambioLadosMatriz(int[][] matriz) {
		int[][] matrizInvertida = new int[matriz.length][matriz.length];
		for(int i = 0; i < matriz.length; i++) {
			matrizInvertida[i][0] = matriz[i][1];
			matrizInvertida[i][1] = matriz[i][0];
			for(int j = 2; j < matriz[i].length; j++) {
				matrizInvertida[i][j] = matriz[i][j];
			}
		}
		return matrizInvertida;
	}
}
