package unidad_4;
import java.util.Random;/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 20-Unidad 4. Generar clase de alumnos Parte 2
 * */
public class ClaseAlumnos {

	public static void main(String[] args) {
		ClaseAlumnos cl = new ClaseAlumnos();
		Alumno[] al = cl.alumnosClase(20);
		cl.impresionObjeto(al);
		cl.estatusCalificaciones(al);
	}
	public Alumno[] alumnosClase(int numAlumnos) {
		Alumno[] alumno = new Alumno[numAlumnos];
		Random rd = new Random();
		for(int i = 0; i < alumno.length; i++) {
			String numControl = "L23170"+rd.nextInt(201);
			String nombre = "Alumno "+(i+1);
			int calificacion = rd.nextInt(101);
			alumno[i] = new Alumno(numControl, nombre, calificacion);
		}
		return alumno;
	}
	public void impresionObjeto(Alumno[] arr) {
		for(Alumno x: arr) {
			System.out.println(x.getNumControl() +" "+ x.getNombreCompleto() +" "+ x.getCalificacion());
		}
	}
	public void estatusCalificaciones(Alumno[] arr) {
		int aprobados = 0;
		for(Alumno x: arr) {
			if(x.getCalificacion() > 69) {
				aprobados++;
			}
		}
		System.out.println("Aprovados: "+aprobados+"\nReprobados: "+(arr.length - aprobados));
	}
}
