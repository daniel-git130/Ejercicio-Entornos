package edu.alonso.Tema3;

public class CalculaSueldo {

	/*public static double calculadoraSueldo(ProfesorInterino profe) {
		return profe.SUELDO_BASE;
	}
	
	public static double calculadoraSueldo(ProfesorDefinitivo profe) {
		return profe.SUELDO_BASE + (profe.getAniosPlaza()*100);
	}*/
	
	public static double calculadoraSueldo(Profesor profe) {
		double sueldo;
		System.out.println(profe);
		if(profe instanceof ProfesorInterino) {
			sueldo = ((ProfesorInterino)profe).SUELDO_BASE;
		}
		else {
			sueldo = ((ProfesorDefinitivo)profe).SUELDO_BASE
					+ (((ProfesorDefinitivo)profe).getAniosPlaza()*100);
		}
		return sueldo;
	}
	
}
