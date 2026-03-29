package presenter;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import view.VentanaPrincipal;
import view.components.CeldaComponent;
import view.components.Tecla;

public class JuegoPresenter {
	private VentanaPrincipal ventana;
	private int filaActual;
	private int columnaActual;
	
	public JuegoPresenter(VentanaPrincipal ventana) {
		this.ventana = ventana;
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
		configurarListenerBotonesTeclado();
	}
	
	public int getFilaActual() {
		return this.filaActual;
	}
	public int getColumnaActual() {
		return this.columnaActual;
	}
	
	public void addColumnaActual() {
		this.columnaActual += 1;
	}
	public void addFilaActual() {
		this.filaActual += 1;
	}
	
	public void configurarListenerBotonesTeclado() {
		List<Tecla> teclas = ventana.getTecladoUI().getTeclas();
		CeldaComponent[][] celdas = ventana.getGrillaUI().getCeldas();
		for(JButton tecla: teclas ) {
			tecla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("hello world");
				celdas[getFilaActual()][getColumnaActual()].setLetra(tecla.getText());
				addFilaActual();
				
			}

			
		}
					
					);
		}
	}
	
}
