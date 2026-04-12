package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import presenter.JuegoPresenter;
import view.components.BotonDificultad;
import view.components.BotonInstrucciones;

public class HeaderUI extends JPanel {
	
	public HeaderUI(String idioma) {
		propiedadesPorDefecto(idioma);
	}

	public void propiedadesPorDefecto(String idioma) {
	
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
		
		this.setBackground(Color.BLACK);
		
		this.add(Box.createHorizontalGlue());
		this.add(new BotonInstrucciones(idioma));
	}
	
	public void crearBotonDificultad(JuegoPresenter juego) {
		this.add(new BotonDificultad(juego));
	}
}
