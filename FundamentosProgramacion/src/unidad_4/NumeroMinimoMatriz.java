package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 25-Unidad 4. Halla el numero minimo de toda la matriz
 * */
public class NumeroMinimoMatriz {

	public static void main(String[] args) {
		SumaElementosMatrices obj = new SumaElementosMatrices();
		int[][] matriz = obj.crearMatriz(4);
		obj.impresionMatriz(matriz);
		System.out.println();
		numeroMinimoMatriz(matriz);
	}
	public static void numeroMinimoMatriz(int[][] matriz) {
		int min = matriz[0][0];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if(min>matriz[i][j]) {
					min = matriz[i][j];
				}
			}
		}
		System.out.println("El numero de minimo es: "+ min);
	}
}
