package edu.alonso.Tema3;

public class ProfesorInterino extends Profesor {
	private String centroActual;
	private String provEleccion;
	
	public static int SUELDO_BASE = 18000;
	
	public ProfesorInterino (String nombre, int edad, String provEleccion) {
		super(nombre, edad);
		this.provEleccion = provEleccion;
	}
	
	public ProfesorInterino (String nombre, int edad, String asignatura, String provEleccion) {
		super(nombre, edad, asignatura);
		this.provEleccion = provEleccion;
	}
	
	public String getCentroActual() {
		return centroActual;
	}
	
	public void setCiudadActual(String centroActual) {
		this.centroActual = centroActual;
	}
	
	public String getProvEleccion() {
		return provEleccion;
	}
	
	public void setProvEleccion(String provEleccion) {
		this.provEleccion = provEleccion;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", centro actual: " + centroActual + ", provincia de eleccion: " + provEleccion;
	}
}
