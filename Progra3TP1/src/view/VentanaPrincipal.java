package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
	private final GrillaUI grilla = new GrillaUI();
	private final TecladoUI teclado = new TecladoUI();
	
	public VentanaPrincipal() {
		super("Wordle");
		propiedadesPorDefecto();
		crearGrilla();
		crearTeclado();
	
	}
	
	private void propiedadesPorDefecto() {
		this.setBounds(100, 100, 653, 458);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.getContentPane().setLayout(null);
		this.setBackground(Color.black);
	}
	
	public void crearGrilla() {
		this.getContentPane().add(grilla, BorderLayout.CENTER);
	}
	
	public void crearTeclado() {
		this.getContentPane().add(teclado, BorderLayout.SOUTH);
	}
	
	public GrillaUI getGrillaUI() {
		return grilla;
	}
	
	public TecladoUI getTecladoUI() {
		return teclado;
	}
	
}
