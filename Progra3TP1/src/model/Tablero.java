package model;

public class Tablero {

	private final int FILAS = 6;
	private int columnas = 5;
	private int filaActual;
	private int columnaActual;
	private Celda[][] celdas;
	private String palabraRandom;
	private String idioma;
	private int dificultad = 0;		//0=normal, 1=dificil
	
	public Tablero(String idioma) {
		this.filaActual = 0;
		this.columnaActual = 0;
		this.idioma = idioma;
		construirTablero();
		//Palabras.guardarPalabras();
		obtenerPalabraJuego();
	}
	
	public void construirTablero() {
		this.celdas = new Celda[FILAS][columnas];
		for(int fila = 0; fila < FILAS; fila++ ) {
			for(int col = 0; col < columnas; col++) {
				this.celdas[fila][col] = new Celda();
			}
		}
	}
	
	public String getIdioma() {
		return this.idioma;
	}
	
	public int getFilaActual() {
		return this.filaActual;
	}
	
	public void setFilaActual(int fila) {
		this.filaActual = fila;
	}
	
	public int getColumnas() {
		return this.columnas;
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
	
	public int getDificultad() {
		return dificultad;
	}
	
	//limites de filas y columnas
	public boolean puedeInsertarLetra() {
		return columnaActual<columnas;
	}
	public boolean quedanIntentos() {
		return filaActual<FILAS;
	}
	
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
		String palabra = Palabras.obtenerPalabraRandom(dificultad, idioma);
		this.palabraRandom = palabra;
		//System.out.println(palabraRandom); //para probar
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
	   
	    for (int c = 0; c < columnas; c++) {
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
	
	public void cambiarDificultad(int dificultad) {
		this.dificultad = dificultad;
		if(dificultad == 1)
			columnas = 7;
		else {
			columnas = 5;
		}
		construirTablero();
	}
		
	public boolean esPalabraValida() {
	    String palabraJugador = concatenarLetrasFila(); 
	    return Palabras.verificarExistenciaPalabra(palabraJugador);
	}
}
