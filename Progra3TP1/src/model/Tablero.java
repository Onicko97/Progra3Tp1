package model;

public class Tablero {

	private final int FILAS = 6;
	private final int COLUMNAS = 5;
	private int filaActual;
	private int columnaActual;
	private Celda[][] celdas;
	
	
	public Tablero( ) {
		this.filaActual = 0;
		this.columnaActual = 0;
		construirTablero();
		
	}
	
	public void construirTablero() {
		this.celdas = new Celda[FILAS][COLUMNAS];
		for(int fila = 0; fila < FILAS; fila++ ) {
			for(int col = 0; col < COLUMNAS; col++) {
				this.celdas[fila][col] = new Celda();
			}
		}
	}
	
	public int getFilaActual() {
		return this.filaActual;
	}
	
	public void setFilaActual(int fila) {
		this.filaActual = fila;
	}
	
	public int getColumnaActual() {
		return this.columnaActual;
	}
	
	public void setColumnaActual(int col) {
		this.columnaActual = col;
	}
	public void addColumnaActual() {
		this.columnaActual += 1;
	}
	public void subtractColumnaActual() {
		this.columnaActual -= 1;
	}
	public void addFilaActual() {
		this.filaActual += 1;
	}
	
	public boolean verificarPalabraConFila(String palabra) {
		int fila = this.getFilaActual();
		Celda[] arrayCeldas = celdas[fila];
		return true;
	}
	public boolean verificarPosicionLetra() {return true; }
	
	
}
