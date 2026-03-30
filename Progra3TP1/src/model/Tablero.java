package model;

public class Tablero {

	private final int FILAS = 6;
	private final int COLUMNAS = 5;
	private int filaActual;
	private int columnaActual;
	private Celda[][] celdas;
	private String palabraRandom;
	
	
	public Tablero( ) {
		this.filaActual = 0;
		this.columnaActual = 0;
		construirTablero();
		obtenerPalabraJuego();
	}
	
	public void construirTablero() {
		this.celdas = new Celda[FILAS][COLUMNAS];
		for(int fila = 0; fila < FILAS; fila++ ) {
			for(int col = 0; col < COLUMNAS; col++) {
				this.celdas[fila][col] = new Celda("");
			}
		}
	}
	
	//metodo para testear
	public void imprimirPalabra () {
		System.out.println(this.palabraRandom);
	}
	
	public int getFilaActual() {
		return this.filaActual;
	}
	
	public void modificarCelda(int fila, int col, String letra) {
		this.celdas[fila][col].setLetra(letra);
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
	
	public String getPalabraJuego() {
		return this.palabraRandom;
	}
	
	public void obtenerPalabraJuego() {
		String palabra = Palabras.obtenerPalabraRandom();
		this.palabraRandom = palabra;
	}
	
	public boolean verificarPalabraConFila() {
		System.out.println(this.filaActual);
		System.out.println(this.columnaActual);
		
		int fila = this.getFilaActual();
		Celda[] arrayCeldas = celdas[fila];
		String[] letrasArray = {arrayCeldas[0].getLetra(), arrayCeldas[1].getLetra(), arrayCeldas[2].getLetra(),
				arrayCeldas[3].getLetra(), arrayCeldas[4].getLetra()};
		String palabraJugador = String.join("", letrasArray);
		System.out.println(palabraJugador);
		return palabraRandom.equals(palabraJugador);
	}
	public boolean verificarCoincidePosicionLetra(int index) {
		int fila = this.getFilaActual();
		Celda[] arrayCeldas = celdas[fila];
		Celda celda = arrayCeldas[index];
		String[] palabraRandomArray = Palabras.stringToArray(palabraRandom);
		return palabraRandomArray[index].equals(celda.getLetra());
		
	}
	public boolean verificarContieneLetra(int index) {
		int fila = this.getFilaActual();
		Celda[] arrayCeldas = celdas[fila];
		Celda celda = arrayCeldas[index];
		String[] palabraRandomArray = Palabras.stringToArray(palabraRandom);
		return Palabras.contieneLetraEnArray(palabraRandomArray, celda.getLetra());
	}
	
}
