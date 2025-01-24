package edu.alonso.Tema3;

public class Circunferencia {

		private double radio;
		
		public Circunferencia(double radio) {
			this.radio = radio;
		}
		
		public double getRadio() {
			return radio;
		}
		
		public void setRadio (double radio) {
			this.radio = radio;
		}
		
		@Override
		public String toString () {
			return "El radio es: " + radio + ", el area es: " + area(radio) + ", el perimetro es: " + perimetro(radio);
		}
		
		public double area (double radio) {
			return  Math.PI * Math.pow(radio, 2);
		}
		
		public double perimetro (double radio) {
			return 2 * Math.PI * radio;
		}
		
}
