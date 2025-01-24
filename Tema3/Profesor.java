package edu.alonso.Tema3;

public class Profesor {

	protected String nombre;
	private String asignatura;
	private int edad;
	
	//CONSTRUCTORES
	public Profesor (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Profesor (String nombre, int edad, String asignatura) {
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.edad = edad;
	}
	
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getAsignatura() {
		return asignatura;
	}
	
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString () {
		return "Nombre: " + nombre + ", edad: " + edad + ", asignatura: " + asignatura;
	}
	
}
