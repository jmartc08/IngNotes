package Vistas;

import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class NuevaAsignatura extends JInternalFrame {
	
	static int openFrameCount = 0;

	static final int xPosition = 30, yPosition = 30;

	private JButton btnAñadir = new JButton("AÑADIR");
	private JTextField txtNuevaC = new JTextField();

	private JLabel lblSeleccioneUnaCarrera;

	private JComboBox<String> comboBoxCarreras;

	private JLabel lblSeleccioneUnCurso;

	private JComboBox<String> comboBoxCursos;

	private JLabel lblNuevAsignatura;

	public NuevaAsignatura() {
		super("IFrame #" + (++openFrameCount), true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable

		// Set the window's location.
		setLocation(xPosition * openFrameCount, yPosition * openFrameCount);
		
		
		setTitle("AÑADIR NUEVA ASIGNATURA");
		setSize(300, 300);
		getContentPane().setLayout(null);
		setResizable(false);
		initComponent();

	}

	private void initComponent() {
		btnAñadir.setBounds(88, 200, 94, 36);
		txtNuevaC.setBounds(38, 168, 199, 20);
		
		lblSeleccioneUnaCarrera = new JLabel("CARRERA");
		lblSeleccioneUnaCarrera.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneUnaCarrera.setBounds(88, 6, 94, 36);
		comboBoxCarreras = new JComboBox<String>();
		comboBoxCarreras.setBounds(36, 29, 201, 36);
		lblSeleccioneUnCurso = new JLabel("CURSO");
		lblSeleccioneUnCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneUnCurso.setBounds(103, 70, 62, 36);
		comboBoxCursos = new JComboBox<String>();
		comboBoxCursos.setBounds(38, 100, 199, 36);
		
		lblNuevAsignatura = new JLabel("INTRODUZCA LA ASIGNATURA");
		lblNuevAsignatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevAsignatura.setBounds(38, 138, 211, 36);

		getContentPane().add(btnAñadir);
		getContentPane().add(txtNuevaC);
		getContentPane().add(lblSeleccioneUnaCarrera);
		getContentPane().add(comboBoxCarreras);
		getContentPane().add(lblSeleccioneUnCurso);
		getContentPane().add(comboBoxCursos);
		getContentPane().add(lblNuevAsignatura);

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
