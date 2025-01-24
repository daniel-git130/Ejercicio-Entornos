package edu.alonso.Tema3;

import java.util.Random;

public class OperacionBancaria {

	private Persona cliente;
	private Domicilio domicilio;
	private String iban;
		
	public OperacionBancaria(Persona cliente, Domicilio domicilio) {
		this.cliente = cliente;
		this.domicilio = domicilio;
		this.iban = iban;
}
	protected String generaIban() {
		Random rand = new Random();
		 int num = rand.nextInt(2)+1;
		 //switch(aleatorio) {
		 //case 1 :
			 //System.out.println();
		 //}
	}
}