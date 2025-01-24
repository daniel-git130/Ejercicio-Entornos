package edu.alonso.Tema3;

import java.util.Scanner;

public class CircunferenciaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		
		Circunferencia circunferencia = new Circunferencia(radio);
		System.out.println(circunferencia);
		
		sc.close();
	}
}
