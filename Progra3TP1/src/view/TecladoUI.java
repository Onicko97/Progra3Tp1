package view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.VentanaPrincipal.TecladoListener;
import view.components.Tecla;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TecladoUI extends JPanel{
	private final String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i","j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","dl", "ENTER"};
	private List<Tecla> teclas;
	private TecladoListener listener;
	
	public TecladoUI() {
		propiedadesPorDefecto();
	}
	
	public void propiedadesPorDefecto() {
		this.teclas = new ArrayList<Tecla>();
		this.setLayout(new GridLayout(4, 7, 5, 5));
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
                        listener.teclaPresionada(tecla.getText());
                    }
                }
            });
        }
    }
}
	

