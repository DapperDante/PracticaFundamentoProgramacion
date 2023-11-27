package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 22-Unidad 4. la transpuesta de una matriz
 * */
public class MatrizInversa {

	public static void main(String[] args) {
		SumaElementosMatrices obj = new SumaElementosMatrices();
		int[][] matriz = obj.crearMatriz(3);
		obj.impresionMatriz(matriz);
		System.out.println();
		int[][] matrizInvertida = matrizInvertida(matriz);
		obj.impresionMatriz(matrizInvertida);
	}
	public static int[][] matrizInvertida(int[][] arr){
		int[][] invertida = new int[arr.length][arr.length];
		for(int i = 0; i < invertida.length; i++) {
			for(int j = 0; j < invertida[i].length; j++) {
				invertida[i][j] = arr[j][i];
			}
		}
		return invertida;
	}
}
