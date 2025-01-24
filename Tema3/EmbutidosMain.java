package edu.alonso.Tema3;

public class EmbutidosMain {
	
	public static void main(String[] args) {
		
		Embutidos jamon = new Embutidos("Jamon", 5);
		System.out.println("Contenido de Jamon: " + jamon);
		
		Embutidos lomo = new Embutidos("Lomo", 1.5, "Asturiano");
		System.out.println("Contenido de lomo: " + lomo);
		
		Embutidos chorizo = new Embutidos("Chorizo", 0.5, "Gallego");
		System.out.println("Contenido de chorizo: " + chorizo);
		
		// PARA AÑADIR OTRO CAMPO (por ejemplo en Fran)
		jamon.setOrigen("Avileño");
		System.out.println("Contenido de Jamon (nuevo): " + jamon);
	}
}
