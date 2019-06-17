package Vistas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Busqueda extends JInternalFrame {

	private JToolBar toolBar;
	private JLabel lblSeleccioneUnaCarrera;
	private JComboBox<String> comboBoxCarreras;
	private JLabel lblSeleccioneUnCurso;
	private JComboBox<String> comboBoxCursos;
	private JLabel lblSeleccioneUnaAsignatrua;
	private JComboBox<String> comboBoxAsignaturas;
	private JButton btnBuscar;

	public Busqueda() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		setTitle("Búsqueda de apuntes");

		toolBar = new JToolBar();
		lblSeleccioneUnaCarrera = new JLabel("CARRERAS");
		comboBoxCarreras = new JComboBox<String>();
		lblSeleccioneUnCurso = new JLabel("CURSOS");
		comboBoxCursos = new JComboBox<String>();
		lblSeleccioneUnaAsignatrua = new JLabel("ASIGNATURAS");
		comboBoxAsignaturas = new JComboBox<String>();
		btnBuscar = new JButton("BUSCAR");

		getContentPane().add(toolBar, BorderLayout.NORTH);
		toolBar.add(lblSeleccioneUnaCarrera);
		toolBar.add(comboBoxCarreras);
		toolBar.add(lblSeleccioneUnCurso);
		toolBar.add(comboBoxCursos);
		toolBar.add(lblSeleccioneUnaAsignatrua);
		toolBar.add(comboBoxAsignaturas);
		toolBar.add(btnBuscar);
		;

	}

	public JToolBar getToolBar() {
		return toolBar;
	}

	public void setToolBar(JToolBar toolBar) {
		this.toolBar = toolBar;
	}

	public JLabel getLblSeleccioneUnaCarrera() {
		return lblSeleccioneUnaCarrera;
	}

	public void setLblSeleccioneUnaCarrera(JLabel lblSeleccioneUnaCarrera) {
		this.lblSeleccioneUnaCarrera = lblSeleccioneUnaCarrera;
	}

	public JComboBox<String> getComboBoxCarreras() {
		return comboBoxCarreras;
	}

	public void setComboBoxCarreras(JComboBox<String> comboBoxCarreras) {
		this.comboBoxCarreras = comboBoxCarreras;
	}

	public JLabel getLblSeleccioneUnCurso() {
		return lblSeleccioneUnCurso;
	}

	public void setLblSeleccioneUnCurso(JLabel lblSeleccioneUnCurso) {
		this.lblSeleccioneUnCurso = lblSeleccioneUnCurso;
	}

	public JComboBox<String> getComboBoxCursos() {
		return comboBoxCursos;
	}

	public void setComboBoxCursos(JComboBox<String> comboBoxCursos) {
		this.comboBoxCursos = comboBoxCursos;
	}

	public JLabel getLblSeleccioneUnaAsignatrua() {
		return lblSeleccioneUnaAsignatrua;
	}

	public void setLblSeleccioneUnaAsignatrua(JLabel lblSeleccioneUnaAsignatrua) {
		this.lblSeleccioneUnaAsignatrua = lblSeleccioneUnaAsignatrua;
	}

	public JComboBox<String> getComboBoxAsignaturas() {
		return comboBoxAsignaturas;
	}

	public void setComboBoxAsignaturas(JComboBox<String> comboBoxAsignaturas) {
		this.comboBoxAsignaturas = comboBoxAsignaturas;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

}
