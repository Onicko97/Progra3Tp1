package view.components;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonInstrucciones extends JButton {

	public BotonInstrucciones() {
		propiedadesPorDefecto();
	}
	
	public void propiedadesPorDefecto() {
		this.setBackground(Color.BLACK);
		this.setBorder(null);
		setButtonIcon();
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				javax.swing.JOptionPane.showMessageDialog(null, "COMO JUGAR\n Adivina la palabra en 6 aciertos\n En cada intento veras distintos colores que te diran que tan cerca estas de acertar la palabra.", "Instrucciones", javax.swing.JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	}
	
	public void setButtonIcon() {
		ImageIcon original = new ImageIcon(Tecla.class.getResource("/resources/libro-de-instrucciones.png"));
		
		Image imgEscalada = original.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		this.setIcon(new ImageIcon(imgEscalada));
	}
	
}
