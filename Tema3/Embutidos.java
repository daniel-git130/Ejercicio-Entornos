package edu.alonso.Tema3;

public class Embutidos {
	
	private String tipo;
	private double kg;
	private String origen ;
	
	public Embutidos (String tipo, double kg) {
		this.tipo = tipo;
		this.kg = kg;
	}
	
	public Embutidos(String tipo, double kg, String origen) {
		this.tipo = tipo;
		this.kg = kg;
		this.origen = origen;
	}
	
	//GET Y SET
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getKg() {
		return kg;
	}
	
	public void setKg(double kg) {
		this.kg = kg;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	@Override
	public String toString() {
		return "Tipo: " + tipo +", kg: " + kg + ", origen: "+ origen;
	}
}