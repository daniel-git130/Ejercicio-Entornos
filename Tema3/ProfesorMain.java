package edu.alonso.Tema3;

public class ProfesorMain {

	public static void main(String[] args) {
		Profesor fran = new Profesor("Fran", 25);
		System.out.println("Contenido del objeto fran: " + fran);
		
		Profesor Javi = new Profesor("Javi", 40, "Base de datos");
		System.out.println("Contenido de Javi: " + Javi);
		
		
		ProfesorInterino pedro = new ProfesorInterino ("Pedro", 30, "Base de datos", "Avila" );
		
		ProfesorDefinitivo luis = new ProfesorDefinitivo ("Luis", 30, "Ávila", 10 );
		
		System.out.println("Luis cobra: " + CalculaSueldo.calculadoraSueldo(luis));
		System.out.println("Pedro cobra: " + CalculaSueldo.calculadoraSueldo(pedro));
	}
}
