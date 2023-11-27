package unidad_5;
import java.util.Scanner;
public class NumMayores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int n1 = sc.nextInt();
		System.out.println("Ingrese otro numero: ");
		int n2 = sc.nextInt();
		System.out.println("Ingrese el ultimo numero: ");
		int n3 = sc.nextInt();
		numMayor(n1,n2,n3);
	}
	public static void numMayor(int n1, int n2, int n3) {
		int nMayor = 0;
		if(n1 > n2 && n1 > n3) {
			nMayor = n1;
		}else if(n2 > n3 && n2 > n1){
			nMayor = n2;
		}else {
			nMayor = n3;
		}
		System.out.println("El numero mayor es: "+nMayor);
	}
}
