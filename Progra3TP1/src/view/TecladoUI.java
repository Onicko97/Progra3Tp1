package view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.components.Tecla;

public class TecladoUI extends JPanel{
	private final String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i","j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	private List<Tecla> teclas;
	public TecladoUI() {
		propiedadesPorDefecto();
	}
	
	public void propiedadesPorDefecto() {
		this.teclas = new ArrayList<Tecla>();
		this.setLayout(new GridLayout(3, 3, 10, 10));
		crearTeclado();
	}
	
	public void crearTeclado() {
		for(int i = 0; i < abecedario.length; i++) {
			Tecla tecla = new Tecla(abecedario[i]);
			teclas.add(tecla);
			this.add(tecla);
			}
		
	}
	
	public List<Tecla> getTeclas() {
		return teclas;
	}
}
