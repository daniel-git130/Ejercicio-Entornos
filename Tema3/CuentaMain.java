package edu.alonso.Tema3;

import java.util.Scanner;

public class CuentaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Creamos 2 cuentas usando ambos constructores
		System.out.println("Primero vamos a crear una cuenta usando el constructor 1 (es decir usando el nomnre del titular y la cantidad de dinero incial)");
		System.out.print("Dime el titular de la primera cuenta: ");
		String titular1 = sc.nextLine();
		
		System.out.print("Indica la cantidad inicial para la primera cuenta: ");
		double cantidad1 = sc.nextDouble();
		Cuenta cuenta1 = new Cuenta(titular1, cantidad1);
		
		sc.nextLine(); //Limpiar el buberr del scanner, para leer el salto de linea
		
		System.out.println("Ahora vamos a crear otra cuenta usando el constructor 2 (es decir usando solo el nombre del titular)");
		System.out.print("Indica el  nombre del titular de esta cuenta: ");
		String titular2 = sc.nextLine();
		Cuenta cuenta2 = new Cuenta(titular2);
		
		//Mostar las cuentas creadas
		System.out.println("Las cuentas que hemos creado son: ");
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		System.out.println("Ahora vamos a ingresar y retirar dinero de la cuenta 1");
		//Ingresar dinero
		System.out.print("Pon la cantidad a ingresar en la cuenta: ");
		double ingreso1 = sc.nextDouble();
		cuenta1.retirar(ingreso1);
		
		//Retirar dinero de la cuenta
		System.out.print("Pon la cantidad a retirar de la cuenta: ");
		double retiro1 = sc.nextDouble();
		cuenta1.retirar(retiro1);
		
		//Mostar el saldo final de las cuentas
		System.out.println("Saldos finales de las cuentas");
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		//Cerrar scanner
		sc.close();
		
	}
}
