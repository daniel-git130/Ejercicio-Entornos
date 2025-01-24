package edu.alonso.Tema3;

public class Coche {
	//atributos de la clase coche
	private String marca;
	private String modelo;
	private int kms;
	private int litrosAceite;
	
	private final int LITROS_MINIMOS = 20;
	
	private static int contador = 0;
	private int contadorNoStatic = 0;
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		contador++;
		//contadorNoStatic;
	}
	
	public Coche(String marca, String modelo, int kms) {
		this.marca = marca;
		this.modelo = modelo;
		this.kms = kms;
		contador++;
		contadorNoStatic++;
	}
	
	public boolean validaAceite (int litrosIntroducidos ) {

		litrosAceite += litrosIntroducidos;
		if(litrosAceite >= LITROS_MINIMOS) {
			return true;
		} 
		return false;
 }	
	
} 
