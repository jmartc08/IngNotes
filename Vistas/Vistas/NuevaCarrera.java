package Vistas;

import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class NuevaCarrera extends JInternalFrame {
	
	
	static int openFrameCount = 0;
	
	static final int xPosition = 30, yPosition = 30;

	private JButton btnAñadir = new JButton("AÑADIR");
	private JTextField txtNuevaC = new JTextField();

	public NuevaCarrera() {
		
		super("IFrame #" + (++openFrameCount), 
				true, // redimensionable
				true, // botón cerrar
				false, // maximizable
				true);// iconizable
		
		setSize(300, 300);
		// Set the window's location.
		setLocation(xPosition * openFrameCount, yPosition
			* openFrameCount);

		setTitle("AÑADIR NUEVA CARRERA");
		setSize(300, 150);
		setLocation(new Point(300, 200));
		getContentPane().setLayout(null);
		setResizable(false);

		initComponent();

	}

	private void initComponent() {
		btnAñadir.setBounds(88, 54, 94, 36);
		txtNuevaC.setBounds(38, 22, 199, 20);

		getContentPane().add(btnAñadir);
		getContentPane().add(txtNuevaC);

	}

	public JButton getBtnAñadir() {
		return btnAñadir;
	}

	public void setBtnAñadir(JButton btnAñadir) {
		this.btnAñadir = btnAñadir;
	}

	public JTextField getTxtNuevaC() {
		return txtNuevaC;
	}

	public void setTxtNuevaC(JTextField txtNuevaC) {
		this.txtNuevaC = txtNuevaC;
	}

}
