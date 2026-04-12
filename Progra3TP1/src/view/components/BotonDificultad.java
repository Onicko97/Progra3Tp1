package view.components;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import presenter.JuegoPresenter;

public class BotonDificultad extends JButton{
	
	private JuegoPresenter juego;
	private String idioma;
	
	public BotonDificultad(JuegoPresenter juego) {
		this.idioma = juego.obtenerIdioma();
		propiedadesPorDefecto(juego);
	}

	public void propiedadesPorDefecto(JuegoPresenter juego) {
		
		this.setBackground(Color.BLACK);
		this.setBorder(null);
		if(idioma.equals("Español")) {
			this.setText("Dificultad ");
		}
		else {
			this.setText("Difficulty ");
		}
		this.setForeground(Color.WHITE);
		this.juego = juego;
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(idioma.equals("Español")) {
					String[] dificultades = {"Normal", "Dificil"};
					int dificultadElegida = javax.swing.JOptionPane.showOptionDialog(null, "Se reiniciara el juego", "Elija la dificultad", 0, 3, null, dificultades, dificultades[0]);
					if(dificultadElegida != -1) {
						juego.cambiarDificultad(dificultadElegida);
					}
				}else {
					String[] dificultades = {"Normal", "Hard"};
					int dificultadElegida = javax.swing.JOptionPane.showOptionDialog(null, "The game will restart", "Select difficulty", 0, 3, null, dificultades, dificultades[0]);
					if(dificultadElegida != -1) {
						juego.cambiarDificultad(dificultadElegida);
					}
				}
			}
		});
	}
}
