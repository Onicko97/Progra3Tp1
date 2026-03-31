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
		ventana.mostrar();
		configurarControlador();
	}
	
	
	public void configurarControlador() {
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
	    
	    for (int col = 0; col < 5; col++) {
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
	    if (modelo.getColumnaActual() < 5) { 
	        return; 
	    }

	    modificarBackgroundCelda();

	    if (modelo.verificarPalabraConFila()) {
	        ventana.mostrarMensaje("Ganaste");
	    } else {
	        modelo.avanzarFila(); 
	        
	        if (!modelo.quedanIntentos()) {
	            ventana.mostrarMensaje("Perdiste" + modelo.getPalabraRandom());
	        }
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
	
}
