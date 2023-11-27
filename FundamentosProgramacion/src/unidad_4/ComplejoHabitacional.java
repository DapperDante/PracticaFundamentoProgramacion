package unidad_4;
import java.util.Random;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17 pm
 * Programa: 26-Unidad 4. Habitantes de un complejo habitacional
 * */
public class ComplejoHabitacional {

	public static void main(String[] args) {
		SumaElementosMatrices obj = new SumaElementosMatrices();
		int[][] matriz = matrizIrregular(10, 8);
		obj.impresionMatriz(matriz);
		operaciones(matriz);
	}
	public static int[][] matrizIrregular(int fila, int columna){
		Random rd = new Random();
		int[][] matriz = new int[fila][columna];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(7);
			}
		}
		return matriz;
	}
	public static void operaciones(int[][] matriz) {
		int habitantes = 0, promedio = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				habitantes += matriz[i][j];
			}
			System.out.println("El promedio de la torre "+ (i+1) +" es: "+ (habitantes /matriz[i].length));
		}
		System.out.println("El numero de habitantes es: "+habitantes);
	}
}
