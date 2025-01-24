package edu.alonso.Tema3;

public class CocheMain {
	
	public static void main(String[] args) {
		
		Coche dacia= new Coche("DACIA", "Logan");
		Coche dacia2 = dacia;
		Coche peugeot= new Coche("peugeot", "205", 456);
		
		int litros = 20;
		
		boolean valorRetorno = dacia.validaAceite(litros);
			System.out.println("Valida?: " + valorRetorno );
	}

}
