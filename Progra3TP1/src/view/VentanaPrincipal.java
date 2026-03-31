package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.EstadoLetra;

public class VentanaPrincipal extends JFrame {
	private final GrillaUI grilla = new GrillaUI();
	private final TecladoUI teclado = new TecladoUI();
	private final HeaderUI header = new HeaderUI();
	
	public void mostrar() {
	    EventQueue.invokeLater(new Runnable() {
	        @Override
	        public void run() {
	            try {
	            		setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}
	public VentanaPrincipal() {
		super("Wordle");
		propiedadesPorDefecto();
		crearHeader();
		crearGrilla();
		crearTeclado();
		
	}
	
	
	private void propiedadesPorDefecto() {
		this.setBounds(100, 100, 653, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.getContentPane().setLayout(null);
		this.setBackground(Color.BLACK);
	}
	
	public void crearGrilla() {
		this.getContentPane().add(grilla, BorderLayout.CENTER);
	}
	
	public void crearTeclado() {
		this.getContentPane().add(teclado, BorderLayout.SOUTH);
	}
	
	public void crearHeader() {
		this.getContentPane().add(header, BorderLayout.NORTH);
	}
	
	private GrillaUI getGrillaUI() {
		return grilla;
	}
	
	private TecladoUI getTecladoUI() {
		return teclado;
	}
	//esto es para qur el presenter pueda acceder sin un get
	public void setListenerTeclado(TecladoListener listener) {
	    this.teclado.setTecladoListener(listener);
	}
	
	public void mostrarLetraEnGrilla(int fila, int col, String letra) {
	    this.grilla.escribirEnCelda(fila, col, letra);
	}
	public void mostrarMensaje(String mensaje) {
	    JOptionPane.showMessageDialog(this, mensaje);
	}
	public void limpiarCeldaEnGrilla(int fila, int col) {
	    this.grilla.escribirEnCelda(fila, col, "");
	}
	public interface TecladoListener {
	    void teclaPresionada(String valor);
	}
	public void pintarCelda(int fila, int col, EstadoLetra estado) {
	    Color color;
	    switch (estado) {
	    case BIEN:  color = Color.GREEN; break;
        case CASI:  color = Color.YELLOW; break;
        case MAL:   color = Color.GRAY; break;
	    default:    color = Color.WHITE;
	    }
	    
	    this.grilla.pintarCelda(fila, col, color);
	}
	
	public void reiniciarJuego() {
		grilla.reiniciarCeldas();
	}
}
