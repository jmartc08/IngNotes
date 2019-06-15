package Vistas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Busqueda extends JInternalFrame {

	public Busqueda() {
		setBounds(100, 100, 700, 500);
		
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JLabel lblSeleccioneUnaCarrera = new JLabel("CARRERAS");
		toolBar.add(lblSeleccioneUnaCarrera);
		
		JComboBox comboBoxCarreras = new JComboBox();
		toolBar.add(comboBoxCarreras);
		
		JLabel lblSeleccioneUnCurso = new JLabel("CURSOS");
		toolBar.add(lblSeleccioneUnCurso);
		
		JComboBox comboBoxCursos = new JComboBox();
		toolBar.add(comboBoxCursos);
		
		JLabel lblSeleccioneUnaAsignatrua = new JLabel("ASIGNATURAS");
		toolBar.add(lblSeleccioneUnaAsignatrua);
		
		JComboBox comboBoxAsignaturas = new JComboBox();
		toolBar.add(comboBoxAsignaturas);
		
		JButton btnBuscar = new JButton("BUSCAR");
		toolBar.add(btnBuscar);;


	}

}
