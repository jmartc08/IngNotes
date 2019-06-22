package Vistas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JRadioButtonMenuItem;

public class Inicio extends JFrame {

	private JMenuBar menuBar;
	private JMenu mnInicio;
	private JMenu mnCarreras;
	private JMenuItem mntmVerCarreras;
	private JMenu mnCursos;
	private JMenuItem mntmVerCursos;
	private JMenu mnASIGNATURAS;
	private JMenuItem mntmNuevaAsignatura;
	private JMenuItem mntmVerAsignatura;
	private JMenu mnNewMenu;
	private JMenuItem mntmCerrarSesion;
	private JMenuItem mntmConfiguracion;
	private JPanel contentPane;
	private JDesktopPane escritorio;
	private JMenuItem menuItem;
	private JMenuItem mntmIniciarSesion;
	private JMenuItem mntmActualizar;

	public Inicio() {

		setBounds(100, 100, 1200, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		menuBar = new JMenuBar();
		mnInicio = new JMenu("INICIO");
		mnInicio.setEnabled(false);
		mntmActualizar = new JMenuItem("ACTUALIZAR");
		mnCarreras = new JMenu("CARRERAS");
		mnCarreras.setEnabled(false);
		mntmVerCarreras = new JMenuItem("VER CARRERAS");
		mnCursos = new JMenu("CURSOS");
		mnCursos.setEnabled(false);
		mntmVerCursos = new JMenuItem("VER CURSOS");
		mnASIGNATURAS = new JMenu("ASIGNATURAS");
		mnASIGNATURAS.setEnabled(false);
		mntmNuevaAsignatura = new JMenuItem("AÑADIR ASIGNATURAS");
		mntmVerAsignatura = new JMenuItem("VER ASIGNATURAS");
		mnNewMenu = new JMenu("CUENTA");
		mnNewMenu.setEnabled(false);
		mntmConfiguracion = new JMenuItem("CONFIGURACIÓN");
		mntmIniciarSesion = new JMenuItem("INICIAR SESIÓN");
		mntmCerrarSesion = new JMenuItem("CERRAR SESIÓN");
		

		setJMenuBar(menuBar);
		menuBar.add(mnInicio);
		
		
		mnInicio.add(mntmActualizar);
		menuBar.add(mnCarreras);
		mnCarreras.add(mntmVerCarreras);
		menuBar.add(mnCursos);
		mnCursos.add(mntmVerCursos);
		menuBar.add(mnASIGNATURAS);
		mnASIGNATURAS.add(mntmNuevaAsignatura);
		mnASIGNATURAS.add(mntmVerAsignatura);
		menuBar.add(mnNewMenu);
		mnNewMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		mnNewMenu.add(mntmIniciarSesion);
		mnNewMenu.add(mntmConfiguracion);
		mnNewMenu.add(mntmCerrarSesion);

		escritorio = new JDesktopPane();
		escritorio.setBackground(SystemColor.window);
		setContentPane(escritorio);
		escritorio.setLayout(null);

	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMnInicio() {
		return mnInicio;
	}

	public void setMnInicio(JMenu mnInicio) {
		this.mnInicio = mnInicio;
	}

	public JMenu getMnCarreras() {
		return mnCarreras;
	}

	public void setMnCarreras(JMenu mnCarreras) {
		this.mnCarreras = mnCarreras;
	}

	public JMenuItem getMntmVerCarreras() {
		return mntmVerCarreras;
	}

	public void setMntmVerCarreras(JMenuItem mntmVerCarreras) {
		this.mntmVerCarreras = mntmVerCarreras;
	}

	public JMenu getMnCursos() {
		return mnCursos;
	}

	public void setMnCursos(JMenu mnCursos) {
		this.mnCursos = mnCursos;
	}

	public JMenuItem getMntmVerCursos() {
		return mntmVerCursos;
	}

	public void setMntmVerCursos(JMenuItem mntmVerCursos) {
		this.mntmVerCursos = mntmVerCursos;
	}

	public JMenu getMnASIGNATURAS() {
		return mnASIGNATURAS;
	}

	public void setMnASIGNATURAS(JMenu mnASIGNATURAS) {
		this.mnASIGNATURAS = mnASIGNATURAS;
	}

	public JMenuItem getMntmNuevaAsignatura() {
		return mntmNuevaAsignatura;
	}

	public void setMntmNuevaAsignatura(JMenuItem mntmNuevaAsignatura) {
		this.mntmNuevaAsignatura = mntmNuevaAsignatura;
	}

	public JMenuItem getMntmVerAsignatura() {
		return mntmVerAsignatura;
	}

	public void setMntmVerAsignatura(JMenuItem mntmVerAsignatura) {
		this.mntmVerAsignatura = mntmVerAsignatura;
	}

	public JMenu getMnNewMenu() {
		return mnNewMenu;
	}

	public void setMnNewMenu(JMenu mnNewMenu) {
		this.mnNewMenu = mnNewMenu;
	}

	public JMenuItem getMntmCerrarSesion() {
		return mntmCerrarSesion;
	}

	public void setMntmCerrarSesion(JMenuItem mntmCerrarSesion) {
		this.mntmCerrarSesion = mntmCerrarSesion;
	}

	public JMenuItem getMntmConfiguracion() {
		return mntmConfiguracion;
	}

	public void setMntmConfiguracion(JMenuItem mntmConfiguracion) {
		this.mntmConfiguracion = mntmConfiguracion;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JDesktopPane getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(JDesktopPane escritorio) {
		this.escritorio = escritorio;
	}

	public JMenuItem getMntmIniciarSesion() {
		return mntmIniciarSesion;
	}

	public void setMntmIniciarSesion(JMenuItem mntmIniciarSesion) {
		this.mntmIniciarSesion = mntmIniciarSesion;
	}
}
