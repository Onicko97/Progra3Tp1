package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.VentanaPrincipal.TecladoListener;
import view.components.Tecla;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TecladoUI extends JPanel{
	private final String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I","J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z","dl", "ENTER"};
	private List<Tecla> teclas;
	private TecladoListener listener;
	
	public TecladoUI() {
		propiedadesPorDefecto();
	}
	
	public void propiedadesPorDefecto() {
		this.teclas = new ArrayList<Tecla>();
		this.setLayout(new GridLayout(4, 7, 5, 5));
		this.setBorder(new EmptyBorder(10,100,10,100));
		this.setBackground(Color.BLACK);
		crearTeclado();
	}
	
	public void crearTeclado() {
		for(int i = 0; i < abecedario.length; i++) {
			Tecla tecla = new Tecla(abecedario[i]);
			teclas.add(tecla);
			this.add(tecla);
			if(abecedario[i].equals("ENTER")) {
				tecla.setIconoEnter();
			}
			if(abecedario[i].equals("dl")) {
				tecla.setIconoTecla();
			}
			}
		
	}
	
	public List<Tecla> getTeclas() {
		return teclas;
	}
	public void setTecladoListener(TecladoListener listener) {
	    this.listener = listener;
	    configurarBotones();
	}
	public void configurarBotones() {
        for (final Tecla tecla : teclas) {
            tecla.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (listener != null) {
                    	listener.teclaPresionada(tecla.getValorOriginal());
                    }
                }
            });
        }
    }
}
	

