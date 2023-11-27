package unidad_4;
/*
 * Dante Adonai Perez Alvarado
 * Horario: 16-17pm
 * Programa: 20-Unidad 4. Generar clase de alumnos Parte 1
 * */
public class Alumno {
	private String numControl;
	private String nombreCompleto;
	private int calificacion;
	//Constructor
	public Alumno(String numControl, String nombreCompleto, int calificacion) {
		this.numControl = numControl;
		this.nombreCompleto = nombreCompleto;
		this.calificacion = calificacion;
	}
	//Gets y Sets: Control de los atributos de forma individual
	public String getNumControl() {
		return numControl;
	}public void setNumControl(String numControl) {
		this.numControl = numControl;
	}public String getNombreCompleto() {
		return nombreCompleto;
	}public void setNombreCompleto(String nombreCompleto) {
		this.numControl = nombreCompleto;
	}public int getCalificacion() {
		return calificacion;
	}public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
}
