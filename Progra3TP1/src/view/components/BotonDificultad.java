package view.components;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import presenter.JuegoPresenter;

public class BotonDificultad extends JButton{
	
	private JuegoPresenter juego;
	
	public BotonDificultad(JuegoPresenter juego) {
		propiedadesPorDefecto(juego);
	}

	public void propiedadesPorDefecto(JuegoPresenter juego) {
		
		this.setBackground(Color.BLACK);
		this.setBorder(null);
		this.setText("Dificultad ");
		this.setForeground(Color.WHITE);
		this.juego = juego;
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				String[] dificultades = {"Normal", "Dificil"};
				int dificultadElegida = javax.swing.JOptionPane.showOptionDialog(null, "Se reiniciara el juego", "Elija la dificultad", 0, 3, null, dificultades, dificultades[0]);
				if(dificultadElegida != -1)
					juego.cambiarDificultad(dificultadElegida);
			}
		});
	}
}
