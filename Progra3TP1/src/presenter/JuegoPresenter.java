package presenter;

import model.EstadoLetra;
import model.Tablero;
import view.VentanaPrincipal;


public class JuegoPresenter {
	private VentanaPrincipal ventana;
	private Tablero modelo;
	
	
	public JuegoPresenter(VentanaPrincipal ventana, Tablero modelo) {
		this.ventana = ventana;
		this.modelo = modelo;
	}
	
	public void iniciar() {
		ventana.crearBotonDificultad(this);
		ventana.mostrar();
		vincularEventos();
	}
	
	
	public void vincularEventos() {
		ventana.setListenerTeclado(new VentanaPrincipal.TecladoListener() {
	        @Override
	        public void teclaPresionada(String valor) {
	            if (valor.equals("ENTER")) {
	                verificarEstadoJuego();
	            } else if (valor.equals("dl")){
	            	procesarBorrar();
	            }
	            	else  {  procesarLetra(valor);
	            }
	        }
	    });
	}
	
	private void modificarBackgroundCelda() {
	    int fila = modelo.getFilaActual();
	    int totalColumnas = modelo.getColumnas(); 

	    for (int col = 0; col < totalColumnas; col++) {
	        EstadoLetra resultado = modelo.verificarCoincidePosicionLetra(col);
	        ventana.pintarCelda(fila, col, resultado);
	    }
	}

	private void procesarBorrar() {
	    if (modelo.getColumnaActual() > 0) {
	        
	        modelo.borrarUltimaLetra();
	        
	        int fila = modelo.getFilaActual();
	        int col = modelo.getColumnaActual();
	        
	        ventana.limpiarCeldaEnGrilla(fila, col);
	    }
	}
	
	private void verificarEstadoJuego() {
	    if (modelo.puedeInsertarLetra()) { 
	        return; 
	    }
	    if (!modelo.esPalabraValida()) {
	        esInvalida();
	        return; 
	    }
	    modificarBackgroundCelda();
	    
	    if (modelo.verificarPalabraConFila()) {
	    	gestionarVictoria();
	    } else {
	        gestionarPerder();
	    }
	    
	}

	private void gestionarPerder() {
		modelo.avanzarFila(); 
		if (!modelo.quedanIntentos()) {
			if(modelo.getIdioma().equals("Español")) {
				ventana.mostrarMensaje("Perdiste, la palabra era: " + modelo.getPalabraRandom());
			}
			else {
				ventana.mostrarMensaje("You lose, the word was: " + modelo.getPalabraRandom());
			}
		    reiniciarJuego();
		}
	}

	private void gestionarVictoria() {
		if(modelo.getIdioma().equals("Español")) {
			ventana.mostrarMensaje("Ganaste");
		}else {
			ventana.mostrarMensaje("You win");
		}    
		reiniciarJuego();
	}

	private void esInvalida() {
		if (modelo.getIdioma().equals("Español")) {
		    ventana.mostrarMensaje("La palabra no existe");
		} else {
		    ventana.mostrarMensaje("Invalid word");
		}
	}
	
	private void procesarLetra(String letra) {
        
		if (modelo.puedeInsertarLetra()) {
            int fila = modelo.getFilaActual();
            int col = modelo.getColumnaActual();
            
            modelo.insertarLetra(letra); 
            ventana.mostrarLetraEnGrilla(fila, col, letra);
        }
	}
	
	public void reiniciarJuego() {
		modelo.reiniciarJuego();
		ventana.reiniciarJuego();
	}
	
	public void cambiarDificultad(int dificultad) {
		modelo.cambiarDificultad(dificultad);
		ventana.cambiarDificultad(dificultad);
		reiniciarJuego();
	}
	
	public String obtenerIdioma() {
	 	return modelo.getIdioma();
	}
	
	
	
}
