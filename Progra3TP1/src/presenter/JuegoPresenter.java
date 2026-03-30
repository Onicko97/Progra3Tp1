package presenter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Tablero;
import view.VentanaPrincipal;
import view.components.CeldaComponent;
import view.components.Tecla;

public class JuegoPresenter {
	private VentanaPrincipal ventana;
	private Tablero modelo;
	private int filaActual;
	private int columnaActual;
	
	public JuegoPresenter(VentanaPrincipal ventana, Tablero modelo) {
		this.ventana = ventana;
		this.modelo = modelo;
	}
	
	public void iniciar() {
		EventQueue.invokeLater(new Runnable() 
				{
					public void run() 
					{
						try 
						{
							ventana.setVisible(true);
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				});
		iniciarJuego();
	}
	
	public void iniciarJuego() {
		configurarListenerBotonesTeclado();
		configurarListenerVentana();
	}
	
	public void modificarBackgroundCelda() {
		CeldaComponent[] celdas = ventana.getGrillaUI().getCeldas()[modelo.getFilaActual()];
		for (int i = 0; i < celdas.length; i++) {
			
			if(modelo.verificarCoincidePosicionLetra(i)) {
				celdas[i].setBackground(Color.GREEN);
			}
			//if(modelo.verificarContieneLetra()) {}
		}
		
	}
	
	public void verificarEstadoJuego() {
		
			if (modelo.verificarPalabraConFila()) {
				JOptionPane.showMessageDialog(null, "usted ha ganado!!!");
			} else {
				modificarBackgroundCelda();
				modelo.setColumnaActual(0);
				modelo.addFilaActual();
			}
		
	}
	
	public boolean jugadorCompletoIntento() {
		return modelo.getColumnaActual() == 4;
	}
	
	
	public void configurarListenerVentana() {
		modelo.imprimirPalabra();
		ventana.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				modelo.imprimirPalabra();
				//verificarEstadoJuego();
				if(e.getKeyCode() == KeyEvent.VK_ENTER && modelo.getColumnaActual() == 5) {
					verificarEstadoJuego();
				}
			}
		});
	}
	
	public void configurarListenerBotonesTeclado() {
		
		List<Tecla> teclas = ventana.getTecladoUI().getTeclas();
		CeldaComponent[][] celdas = ventana.getGrillaUI().getCeldas();
		
		for(JButton tecla: teclas ) {
			tecla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String letra = tecla.getText();
					modelo.modificarCelda(modelo.getFilaActual(), modelo.getColumnaActual(), letra);
					if( tecla.getText() == "dl") {
						borrarLetra(celdas, modelo);
					} else {
						agregarLetra(celdas, modelo, tecla);
					}
//				
//				if(modelo.getColumnaActual()==5) {
//					modelo.setColumnaActual(0);
//					modelo.addFilaActual();
//				}
			
				
			}

			
		}
					
	);
		}
	}
	
	public void agregarLetra (CeldaComponent[][] celdas, Tablero modelo, JButton tecla) {
		celdas[modelo.getFilaActual()][modelo.getColumnaActual()].setLetra(tecla.getText());
		modelo.addColumnaActual();
	}
	
	public void borrarLetra(CeldaComponent[][] celdas, Tablero modelo) {
		celdas[modelo.getFilaActual()][modelo.getColumnaActual()].removeLetra();
		modelo.subtractColumnaActual();
	}
}
