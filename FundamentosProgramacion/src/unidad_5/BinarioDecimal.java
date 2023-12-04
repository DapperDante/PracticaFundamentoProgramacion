package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 10-Unidad 5. Conversion de binario a decimal
 * */
public class BinarioDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero binario");
		String input = sc.nextLine();
		System.out.println("El numero decimal: "+conversionBinarioDecimal(input));
	}
	public static int conversionBinarioDecimal(String binario) {
		int num = 0, indice = 0;
		for(int i = binario.length(); i > 0; i--) {
			if(binario.charAt(i-1) == '1') {
				num += Math.pow(2, indice);
			}
			indice++;
		}
		return num;
	}
}
