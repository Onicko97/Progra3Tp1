package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class SeleccionIdioma extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String idiomaSeleccionado = "Español";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SeleccionIdioma dialog = new SeleccionIdioma();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SeleccionIdioma() {
		setTitle("Wordle");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JRadioButton botonEspaniol = new JRadioButton("Español");
		buttonGroup.add(botonEspaniol);
		botonEspaniol.setBounds(207, 70, 109, 23);
		contentPanel.add(botonEspaniol);
		
		JRadioButton buttonEnglish = new JRadioButton("English");
		buttonGroup.add(buttonEnglish);
		buttonEnglish.setBounds(207, 103, 109, 23);
		contentPanel.add(buttonEnglish);
		
		JLabel lblNewLabel = new JLabel("Seleccionar Idioma: ");
		lblNewLabel.setBounds(74, 74, 127, 14);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(buttonEnglish.isSelected()) {
							idiomaSeleccionado = "English";
						}
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	
	public String getIdiomaSeleccionado() {
		return this.idiomaSeleccionado;
	}
}
