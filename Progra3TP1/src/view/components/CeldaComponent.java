
package view.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CeldaComponent extends JPanel {
	
	private JLabel letraLabel;
	public CeldaComponent() {
		propiedadesPorDefecto();
	}
	
	public void propiedadesPorDefecto() {
		this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        this.setForeground(Color.WHITE);
        this.setBackground(Color.WHITE);

        letraLabel = new JLabel("", SwingConstants.CENTER);
        letraLabel.setFont(new Font("Arial", Font.BOLD, 30));
        this.add(letraLabel, BorderLayout.CENTER);
	}
	
	public void setColorFondo(Color colorFondo) {
		this.setBackground(colorFondo);
	}
	
	public void setLetra(String letra) {
		letraLabel.setText(letra);
	}
	
	
}
