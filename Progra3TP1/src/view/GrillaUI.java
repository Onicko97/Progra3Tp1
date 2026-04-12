package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.components.CeldaComponent;

public class GrillaUI extends JPanel {

	private CeldaComponent[][] celdas;
	private final int FILAS = 6;
	private int COLUMNAS = 5;
	
	public GrillaUI() {
		propiedadesPorDefecto();
	}
	
	public void propiedadesPorDefecto() {
		this.celdas = new CeldaComponent[FILAS][COLUMNAS];
		this.setBorder(new EmptyBorder(10,195,10,195));
		this.setLayout(new GridLayout(6, 5, 5, 5));
		this.setBackground(Color.BLACK);
		crearGrilla( );
		
	}
	
	public void crearGrilla( ) {
		for(int fila = 0; fila < FILAS; fila++) {
			for(int col = 0; col < COLUMNAS; col++ ) {
				
				CeldaComponent celda = new CeldaComponent();
				this.celdas[fila][col] = celda;
				this.add(celda);
			
			}
			
		}
	}
	
	public CeldaComponent[][] getCeldas() {
		return celdas;
	}
	public void pintarCelda(int fila, int col, Color color) {
	    if (fila < FILAS && col < COLUMNAS) {
	        celdas[fila][col].setBackground(color);
	    }
	}
	public void escribirEnCelda(int fila, int col, String letra) {
	    CeldaComponent celda = celdas[fila][col];
	    celda.setLetra(String.valueOf(letra));
	}
	
	public void reiniciarCeldas() {
		for(int fila = 0; fila < FILAS; fila++) {
			for(int col = 0; col < COLUMNAS; col++) {
				pintarCelda(fila,col,Color.WHITE);
				escribirEnCelda(fila,col,"");
			}
		}
	}
	
	public void cambiarGrilla(int dificultad) {
		if(dificultad == 1)
			COLUMNAS = 7;
		else
			COLUMNAS = 5;
		celdas = new CeldaComponent[FILAS][COLUMNAS];
		crearGrilla();
	}
	
}
