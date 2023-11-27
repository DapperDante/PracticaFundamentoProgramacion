package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 21-Unidad 4. Suma de elementos en diagonal
 * */
import java.util.Random;
public class SumaElementosMatrices {

	public static void main(String[] args) {
		SumaElementosMatrices obj = new SumaElementosMatrices();
		int[][] matriz = obj.crearMatriz(3);
		obj.impresionMatriz(matriz);
		obj.sumaDiagonal(matriz);

	}
	public int[][] crearMatriz(int size){
		Random rd = new Random();
		int[][] matriz = new int[size][size];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[j][i] = rd.nextInt(101);
			}
		}
		return matriz;
	}
	public void impresionMatriz(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public void sumaDiagonal(int[][] arr) {
		int suma = 0, j = 0;
		for(int i = 0; i < arr.length; i++) {
				suma += arr[i][j++];
		}
		System.out.println("La suma diagonal es: "+ suma);
	}

}
