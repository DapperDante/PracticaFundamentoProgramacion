package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 9-Unidad 5. Conversion de temperaturas
 * */
public class ConversionTemperaturas {

	public static void main(String[] args) {
		controlConversion();
	}
	public static double tempFahrenheit(double celsius) {
		return (celsius*1.8)+32;
	}
	public static double tempCelsius(double fahrenheit) {
		return (fahrenheit-32)/1.8;
	}
	public static void controlConversion() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite lo que desea convertir:'\n1)Fahrenheit -> Celsius\n2)Celsius -> Fahrenheit");
		int opc = sc.nextInt();
		if(opc == 1) {
			System.out.println("Ingrese los grados Fahrenheit:");
			int tempF = sc.nextInt();
			System.out.println("Grados Celsius: "+tempCelsius(tempF));
		}else {
			System.out.println("Ingrese los grados Celsius:");
			int tempC = sc.nextInt();
			System.out.println("Grados Fahrenheit: "+tempFahrenheit(tempC));
		}
	}
}
