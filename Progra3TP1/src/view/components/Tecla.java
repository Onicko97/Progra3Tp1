package view.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tecla extends JButton {

	private static final Color COLOR_DEFECTO = new Color(211, 214, 218); 
	
	public Tecla(String letra) {
		super(letra);
		configuracionPredeterminada();
	}
	
	private void configuracionPredeterminada() {
		this.setFont(this.getFont().deriveFont(this.getFont().getSize()));
		this.setFocusable(false);
		this.setBackground(Color.GRAY);
		this.setForeground(Color.WHITE);
		this.setPreferredSize(new Dimension(20, 40));
		
		
	}
	
	
	
	public void setFontSizeTecla(int size) {
		this.setFont(new Font("Arial", Font.BOLD, size));
	}
	
	public void setIconoTecla() {

		ImageIcon original = new ImageIcon(Tecla.class.getResource("/resources/borrar.png"));
		
		Image imgEscalada = original.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		this.setIcon(new ImageIcon(imgEscalada));
		
	}
}
