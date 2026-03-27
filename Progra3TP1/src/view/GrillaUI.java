package view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.components.CeldaComponent;

public class GrillaUI extends JPanel {

	private List<CeldaComponent> celdas;
	
	public GrillaUI() {
		propiedadesPorDefecto();
	}
	
	public void propiedadesPorDefecto() {
		this.celdas = new ArrayList<>();
		this.setLayout(new GridLayout(6, 5, 10, 10));
		crearGrilla( );
		
	}
	
	public void crearGrilla( ) {
		for(int i = 0; i < 30; i++) {
			CeldaComponent celda = new CeldaComponent();
			celdas.add(celda);
			this.add(celda);
		}
	}
	
	public List<CeldaComponent> getCeldas() {
		return celdas;
	}
}
