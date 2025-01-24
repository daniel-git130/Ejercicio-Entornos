 
	 package edu.alonso.Tema3;


public class Rombo {

		public static void main(String[] args) {
			//TODO scanner
			//TODO comprobacion impar
			
			int alturaRombo = 5;
			
			int alturaMitadRombo = (alturaRombo +1) /2;
			
			//Triangulo superior
			for (int fila = 1; fila <= alturaMitadRombo; fila++) {
				
				//Bucle para Espacios
				for (int columna = 1; columna <= alturaMitadRombo - fila; columna++) {
					System.out.print(" ");
				}
				
				//Bucle para Asteriscos
				for (int columna = 1; columna < (fila * 2); columna++) {
					System.out.print("*");
					
				}
				
				System.out.println();
			}
				//Triangulo Inferior
				for (int fila = 1; fila < alturaMitadRombo; fila++) {
					
					
					//Espacios
					for (int columna = 1; columna <= fila; columna++) {
						System.out.print(" ");
					}
					
					//Asteriscos
					for (int columna = 1; columna < (alturaMitadRombo - fila) * 2; columna++) {
						System.out.print("*");
					}
					System.out.println();
					
				}
			
			}
		}

