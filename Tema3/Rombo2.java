package edu.alonso.Tema3;

import java.util.Scanner;

public class Rombo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la altura del rombo: ");
		int numero = sc.nextInt();
		
		int alturaMitadRombo = (numero +1) /2;
		
		for (int fila = 1; fila <=alturaMitadRombo; fila++) {
			
			for (int columna = 1; columna <= alturaMitadRombo - fila; columna++) {
				System.out.println(" ");
			}
			for (int columna = 1; columna < (fila * 2); columna++) {
				System.out.println(columna);
			}
			System.out.println();
		}
		for (int fila = 1; fila < alturaMitadRombo; fila++) {
			
			for (int columna = 1; columna < alturaMitadRombo; columna++) {
				System.out.println(" ");
			}
			for (int columna = 1; columna < (alturaMitadRombo - fila) * 2; columna++) {
				System.out.println(columna);
			}
			System.out.println();
		}
	
	}
}
