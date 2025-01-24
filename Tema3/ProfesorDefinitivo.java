package edu.alonso.Tema3;

public class ProfesorDefinitivo extends Profesor {
	private String ciudad;
	private int aniosPlaza;
	
	public static int SUELDO_BASE = 20000;

	public ProfesorDefinitivo (String nombre, int edad, String ciudad, int aniosPlaza) {
	super (nombre, edad);
	this.ciudad = ciudad;
	this.aniosPlaza = aniosPlaza;
	}
		
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getAniosPlaza() {
		return aniosPlaza;
	}
	
	public void setAniosPlaza(int aniosPlaza) {
		this.aniosPlaza = aniosPlaza;
	}
	
	@Override
	public String toString() {
		return "Luis esta en: " + ciudad + ", con: " + aniosPlaza + " anios de plaza fija.";
	}
}
