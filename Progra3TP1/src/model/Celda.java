package model;

public class Celda {
	private String letra;
	
	public Celda(String letra) {
		this.letra = letra;
	}
	
	public String getLetra() {
		return this.letra;
	}
	
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public void removeLetra() {
		this.letra = "";
	}
}
