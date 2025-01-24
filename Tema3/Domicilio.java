package edu.alonso.Tema3;

public class Domicilio {

	private String calle;
	private int numCalle;
	private long codigoPostal;
	
	public Domicilio (String calle, int numCalle, long codigoPostal) {
		this.calle = calle;
		this.numCalle = numCalle;
		this.codigoPostal = codigoPostal;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumCalle() {
		return numCalle;
	}
	public void setNumCalle(int numCalle) {
		this.numCalle = numCalle;
	}
	public long getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(long codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	@Override
	public String toString () {
		return "Calle: " + calle + ", numero de la calle es: " + numCalle + ", codigo postal es: " + codigoPostal;	
	}
}
