package unidad_5;
import java.util.Scanner;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 1-Unidad 5. Calculadora con metodos
 * */
public class Calculadora {

	public static void main(String[] args) {
		menuOperaciones();
	}
	public static void menuOperaciones() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int num1 = sc.nextInt();
		System.out.println("Ingrese otro numero:");
		int num2 = sc.nextInt();
		int input = 0;
		do {
			menuImpresiones();
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("Resultado: " + sum(num1, num2));
				break;
			case 2:
				System.out.println("Resultado: " + rest(num1, num2));
				break;
			case 3:
				System.out.println("Resultado: " + mult(num1, num2));
				break;
			case 4:
				System.out.println("Resultado: " + div(num1, num2));
				break;
			case 5:
				System.out.println("Resultado: " + pot(num1, num2));
				break;
			case 6:
				System.out.println("Resultado: " + raiz(num1));
				break;
			case 7:
				System.out.println("Resultado: " + residuo(num1, num2));
				break;
			case 8:
				System.out.println("Resultado: " + valor(num1));
				break;
			case 9:
				System.out.println("Resultado: " + divEntera(num1, num2));
				break;
			}
		}while(input > 0 && input < 6);
	}
	public static void menuImpresiones() {
		System.out.println("1) Suma de los dos numeros");
		System.out.println("2) Resta de los dos numeros");
		System.out.println("3) Multiplicacion de los dos numeros");
		System.out.println("4) Division de los dos numeros");
		System.out.println("5) Potencia de los dos numeros");
		System.out.println("6) Raiz de los dos numeros");
		System.out.println("7) Residuo de los dos numeros");
		System.out.println("8) Valor Absoluto de los dos numeros");
		System.out.println("9) Division entera de los dos numeros");
		System.out.println("Digite la accion que desea realizar: ");
	}
	public static int sum(int num1, int num2) {
		return num1+num2;
	}public static int rest(int num1, int num2) {
		return num1-num2;
	}public static int mult(int num1, int num2) {
		return num1*num2;
	}public static double div(int num1, int num2) {
		return num1/num2;
	}public static int pot(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}public static int raiz(int num1) {
		return (int)Math.sqrt(num1);
	}public static int residuo(int num1, int num2) {
		return num1%num2;
	}public static int valor(int num1) {
		return Math.abs(num1);
	}public static int divEntera(int num1, int num2) {
		return (int)num1/num2;
	}
}
