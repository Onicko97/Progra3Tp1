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
	//deje perro para probarr
	//	palabraRandom="PERRO";
		obtenerPalabraJuego();
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
	public String getPalabraRandom() {
		return this.palabraRandom;
	}
	
	//limites de filas y columnas
	public boolean puedeInsertarLetra() {
		return columnaActual<COLUMNAS;
	}
	public boolean quedanIntentos() {
		return filaActual<FILAS;
	}
	//
	public void insertarLetra(String l) {
		if(puedeInsertarLetra()) {
			celdas[filaActual][columnaActual].setLetra(l);
			columnaActual++;
		}
	}
	
	public void borrarUltimaLetra() {
	    if (columnaActual > 0) {
	        columnaActual--; 
	        
	        celdas[filaActual][columnaActual].removeLetra();
	    }
	}
	
	public void obtenerPalabraJuego() {
		String palabra = Palabras.obtenerPalabraRandom();
		this.palabraRandom = palabra;
	}
	
	public void avanzarFila() {
	    if (quedanIntentos()){
	        this.filaActual++;    
	        this.columnaActual = 0;
	    }
	}
	
	public String concatenarLetrasFila() {
	    StringBuilder palabra = new StringBuilder();
	    int fila = this.getFilaActual();
	   
	    for (int c = 0; c < COLUMNAS; c++) {
	        String letra = celdas[fila][c].getLetra();	      
	        if (!letra.isEmpty()) {
	            palabra.append(letra);
	        }
	    }
	    	    return palabra.toString().toLowerCase();
	}	
	
	
	
	public boolean verificarPalabraConFila() {
	    String palabraJugador = concatenarLetrasFila();
	    return palabraRandom.equalsIgnoreCase(palabraJugador);
	}
	
	
	
	public EstadoLetra verificarCoincidePosicionLetra(int columna) {
	    String letraJugador = celdas[filaActual][columna].getLetra();
	    String letraCorrecta = Palabras.stringToArray(palabraRandom)[columna];
	    
	    if (letraJugador.equals(letraCorrecta)) {
	        return EstadoLetra.BIEN;
	    }
	    if (palabraRandom.contains(letraJugador)) {
	        return EstadoLetra.CASI;
	    }
	    return EstadoLetra.MAL;
	}
	
	public void reiniciarJuego() { //debe reiniciar todo y elegir una nueva palabra random
		filaActual = 0;
		columnaActual = 0;
		obtenerPalabraJuego();
		for(int fila = 0; fila < celdas.length; fila++) {
			for(int col = 0; col < celdas[0].length; col++) {
				celdas[fila][col].removeLetra();
			}
		}
	}
	
}
