package view.components;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonInstrucciones extends JButton {
	
	

	public BotonInstrucciones(String idioma) {
		propiedadesPorDefecto(idioma);
		
	}
	
	public void propiedadesPorDefecto(String idioma) {
		this.setBackground(Color.BLACK);
		this.setBorder(null);
		setButtonIcon();
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(idioma.equals("Español")) {
					javax.swing.JOptionPane.showMessageDialog(null, "COMO JUGAR\n Adivina la palabra en 6 aciertos\n En cada intento veras distintos colores que te diran que tan cerca estas de acertar la palabra.", "Instrucciones", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				}else {
					javax.swing.JOptionPane.showMessageDialog(null, "HOW TO PLAY\n Guess the word in 6 attempts\n In each attempt you will see different colours which will indicate how close you are from guessing the word.", "Instructions",javax.swing.JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
	}
	
	public void setButtonIcon() {
		ImageIcon original = new ImageIcon(Tecla.class.getResource("/resources/libro-de-instrucciones.png"));
		
		Image imgEscalada = original.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		this.setIcon(new ImageIcon(imgEscalada));
	}
	
}
