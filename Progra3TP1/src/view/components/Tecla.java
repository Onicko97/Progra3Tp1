package view.components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Tecla extends JButton {

	private static final Color COLOR_DEFECTO = new Color(211, 214, 218); 
	
	public Tecla(String letra) {
		super(letra);
		configuracionPredeterminada();
	}
	
	private void configuracionPredeterminada() {
		this.setFont(this.getFont().deriveFont(this.getFont().getSize() + 9f));
		this.setFocusable(false);
		this.setBackground(COLOR_DEFECTO);
		this.setForeground(Color.BLACK);
		this.setPreferredSize(new Dimension(44, 55));
		
	}
	
	
}
