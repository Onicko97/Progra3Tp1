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
	
	public void configurarListenerBotonesTeclado() {
		List<Tecla> teclas = ventana.getTecladoUI().getTeclas();
		List<CeldaComponent> celdas = ventana.getGrillaUI().getCeldas();
		for(JButton tecla: teclas ) {
			tecla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("hello world");
				celdas.get(0).setLetra(tecla.getText());
			}
		}
					
					);
		}
	}
	
}
