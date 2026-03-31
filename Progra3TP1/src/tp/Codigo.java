package tp;

import java.util.Random;

import javax.swing.JTextField;

public class Codigo {
	
	String listaPalabras[] = {"hola", "pera", "miel", "sapo" , "pala", "hilo", "vaso"};
	
	public String damePalabra() {
		Random random = new Random();
		int indice = random.nextInt(listaPalabras.length);
		return listaPalabras[indice];
	}
	
	public void botonPresionado(JTextField txt, String boton) {
		if(boton == "delete") {
			String aux = txt.getText();	
			aux = aux.substring(0, aux.length()-1);
			txt.setText(aux);
		}
		else {
			txt.setText(txt.getText() + boton);
		}
	}
	
}
