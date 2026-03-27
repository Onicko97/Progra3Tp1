package tp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

import model.Palabras;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Interfaz {

	private JFrame frame;
	Codigo codigo = new Codigo();
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() 
	{
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Perpetua Titling MT", Font.PLAIN, 11));
		frame.setBounds(100, 100, 801, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(codigo.damePalabra());
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(301, 59, 155, 80);
		frame.getContentPane().add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setText("");
		txt1.setBounds(329, 142, 86, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		//Botones
		
		JButton btnA = new JButton("a");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				codigo.botonPresionado(txt1, btnA.getText());
			}
		});
		btnA.setFont(btnA.getFont().deriveFont(btnA.getFont().getSize() + 9f));
		btnA.setBounds(114, 261, 50, 50);
		frame.getContentPane().add(btnA);
		
		JButton btnS = new JButton("s");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnS.getText());
			}
		});
		btnS.setFont(btnS.getFont().deriveFont(btnS.getFont().getSize() + 9f));
		btnS.setBounds(174, 261, 50, 50);
		frame.getContentPane().add(btnS);
		
		JButton btnD = new JButton("d");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnD.getText());
			}
		});
		btnD.setFont(btnD.getFont().deriveFont(btnD.getFont().getSize() + 9f));
		btnD.setBounds(234, 261, 50, 50);
		frame.getContentPane().add(btnD);
		
		JButton btnW = new JButton("w");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnW.getText());
			}
		});
		btnW.setFont(btnW.getFont().deriveFont(btnW.getFont().getSize() + 9f));
		btnW.setBounds(174, 200, 50, 50);
		frame.getContentPane().add(btnW);
		
		JButton btnQ = new JButton("q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnQ.getText());
			}
		});
		btnQ.setFont(btnQ.getFont().deriveFont(btnQ.getFont().getSize() + 9f));
		btnQ.setBounds(114, 200, 50, 50);
		frame.getContentPane().add(btnQ);
		
		JButton btnE = new JButton("e");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnE.getText());
			}
		});
		btnE.setFont(btnE.getFont().deriveFont(btnE.getFont().getSize() + 9f));
		btnE.setBounds(234, 200, 50, 50);
		frame.getContentPane().add(btnE);
		
		JButton btnR = new JButton("r");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnR.getText());
			}
		});
		btnR.setFont(btnR.getFont().deriveFont(btnR.getFont().getSize() + 9f));
		btnR.setBounds(294, 200, 50, 50);
		frame.getContentPane().add(btnR);
		
		JButton btnT = new JButton("t");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnT.getText());
			}
		});
		btnT.setFont(btnT.getFont().deriveFont(btnT.getFont().getSize() + 9f));
		btnT.setBounds(354, 200, 50, 50);
		frame.getContentPane().add(btnT);
		
		JButton btnY = new JButton("y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnY.getText());
			}
		});
		btnY.setFont(btnY.getFont().deriveFont(btnY.getFont().getSize() + 9f));
		btnY.setBounds(414, 200, 50, 50);
		frame.getContentPane().add(btnY);
		
		JButton btnU = new JButton("u");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnU.getText());
			}
		});
		btnU.setFont(btnU.getFont().deriveFont(btnU.getFont().getSize() + 9f));
		btnU.setBounds(474, 200, 50, 50);
		frame.getContentPane().add(btnU);
		
		JButton btnI = new JButton("i");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnI.getText());
			}
		});
		btnI.setFont(btnI.getFont().deriveFont(btnI.getFont().getSize() + 9f));
		btnI.setBounds(534, 200, 50, 50);
		frame.getContentPane().add(btnI);
		
		JButton btnO = new JButton("o");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnO.getText());
			}
		});
		btnO.setFont(btnO.getFont().deriveFont(btnO.getFont().getSize() + 9f));
		btnO.setBounds(594, 200, 50, 50);
		frame.getContentPane().add(btnO);
		
		JButton btnP = new JButton("p");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnP.getText());
			}
		});
		btnP.setFont(btnP.getFont().deriveFont(btnP.getFont().getSize() + 9f));
		btnP.setBounds(654, 200, 50, 50);
		frame.getContentPane().add(btnP);
		
		JButton btnF = new JButton("f");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnF.getText());
			}
		});
		btnF.setFont(btnF.getFont().deriveFont(btnF.getFont().getSize() + 9f));
		btnF.setBounds(294, 261, 50, 50);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("g");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnG.getText());
			}
		});
		btnG.setFont(btnG.getFont().deriveFont(btnG.getFont().getSize() + 9f));
		btnG.setBounds(354, 261, 50, 50);
		frame.getContentPane().add(btnG);
		
		JButton btnH = new JButton("h");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnH.getText());
			}
		});
		btnH.setFont(btnH.getFont().deriveFont(btnH.getFont().getSize() + 9f));
		btnH.setBounds(414, 261, 50, 50);
		frame.getContentPane().add(btnH);
		
		JButton btnJ = new JButton("j");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnJ.getText());
			}
		});
		btnJ.setFont(btnJ.getFont().deriveFont(btnJ.getFont().getSize() + 9f));
		btnJ.setBounds(474, 261, 50, 50);
		frame.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("k");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnK.getText());
			}
		});
		btnK.setFont(btnK.getFont().deriveFont(btnK.getFont().getSize() + 9f));
		btnK.setBounds(534, 261, 50, 50);
		frame.getContentPane().add(btnK);
		
		JButton btnL = new JButton("l");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnL.getText());
			}
		});
		btnL.setFont(btnL.getFont().deriveFont(btnL.getFont().getSize() + 9f));
		btnL.setBounds(594, 261, 50, 50);
		frame.getContentPane().add(btnL);
		
		JButton btnZ = new JButton("z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnZ.getText());
			}
		});
		btnZ.setFont(btnZ.getFont().deriveFont(btnZ.getFont().getSize() + 9f));
		btnZ.setBounds(114, 322, 50, 50);
		frame.getContentPane().add(btnZ);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnX.getText());
			}
		});
		btnX.setFont(btnX.getFont().deriveFont(btnX.getFont().getSize() + 9f));
		btnX.setBounds(174, 322, 50, 50);
		frame.getContentPane().add(btnX);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnC.getText());
			}
		});
		btnC.setFont(btnC.getFont().deriveFont(btnC.getFont().getSize() + 9f));
		btnC.setBounds(234, 322, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnV = new JButton("v");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnV.getText());
			}
		});
		btnV.setFont(btnV.getFont().deriveFont(btnV.getFont().getSize() + 9f));
		btnV.setBounds(294, 322, 50, 50);
		frame.getContentPane().add(btnV);
		
		JButton btnB = new JButton("b");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnB.getText());
			}
		});
		btnB.setFont(btnB.getFont().deriveFont(btnB.getFont().getSize() + 9f));
		btnB.setBounds(354, 322, 50, 50);
		frame.getContentPane().add(btnB);
		
		JButton btnN = new JButton("n");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnN.getText());
			}
		});
		btnN.setFont(btnN.getFont().deriveFont(btnN.getFont().getSize() + 9f));
		btnN.setBounds(414, 322, 50, 50);
		frame.getContentPane().add(btnN);
		
		JButton btnM = new JButton("m");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnM.getText());
			}
		});
		btnM.setFont(btnM.getFont().deriveFont(btnM.getFont().getSize() + 9f));
		btnM.setBounds(474, 322, 55, 50);
		frame.getContentPane().add(btnM);
		
		JButton btnSpace = new JButton(" ");
		btnSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnSpace.getText());
			}
		});
		btnSpace.setFont(btnSpace.getFont().deriveFont(btnSpace.getFont().getSize() + 9f));
		btnSpace.setBounds(234, 383, 290, 39);
		frame.getContentPane().add(btnSpace);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.botonPresionado(txt1, btnDelete.getText());
			}
		});
		btnDelete.setFont(btnDelete.getFont().deriveFont(btnDelete.getFont().getSize() + 9f));
		btnDelete.setBounds(534, 383, 113, 39);
		frame.getContentPane().add(btnDelete);
		
		
	}
}
