package Vistas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.FlowLayout;

public class Inicio extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 750);
		
		JDesktopPane escritorio =  new JDesktopPane();
		escritorio.setBackground(SystemColor.window);
		escritorio.setBounds(100,100,100,100);
		getContentPane().add(escritorio);

		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("INICIO");
		menuBar.add(mnInicio);
		
		JMenu mnCarreras = new JMenu("CARRERAS");
		menuBar.add(mnCarreras);
		
		JMenuItem mntmNuevaCarrera = new JMenuItem("AÑADIR CARRERA");
		mntmNuevaCarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaCarrera NC = new NuevaCarrera();
				escritorio.add(NC);
				NC.show();
				
			}
		});
	
		mnCarreras.add(mntmNuevaCarrera);
		
		JMenuItem mntmVerCarreras = new JMenuItem("VER CARRERAS");
		mntmVerCarreras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda B = new Busqueda();
				escritorio.add(B);
				B.show();
				
			}
		});
		
		mnCarreras.add(mntmVerCarreras);
		
		JMenu mnCursos = new JMenu("CURSOS");
		menuBar.add(mnCursos);
		
		JMenuItem mntmNuevoCurso = new JMenuItem("AÑADIR CURSOS");
		mntmNuevoCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoCurso NCU = new NuevoCurso();
				escritorio.add(NCU);
				NCU.show();
				
			}
		});
		mnCursos.add(mntmNuevoCurso);
		
		JMenuItem mntmVerCursos = new JMenuItem("VER CURSOS");
		mntmVerCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda B = new Busqueda();
				escritorio.add(B);
				B.show();
				
			}
		});
		mnCursos.add(mntmVerCursos);
		
		JMenu mnASIGNATURAS = new JMenu("ASIGNATURAS");
		menuBar.add(mnASIGNATURAS);
		
		JMenuItem mntmNuevaAsignatura = new JMenuItem("AÑADIR ASIGNATURAS");
		mntmNuevaAsignatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaAsignatura NA = new NuevaAsignatura();
				escritorio.add(NA);
				NA.show();
				
			}
		});
		mnASIGNATURAS.add(mntmNuevaAsignatura);
		
		
		JMenuItem mntmVerAsignatura = new JMenuItem("VER ASIGNATURAS");
		mntmVerAsignatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda B = new Busqueda();
				escritorio.add(B);
				B.show();
				
			}
		});
		mnASIGNATURAS.add(mntmVerAsignatura);
		
		JMenu mnNewMenu = new JMenu("PERFIL");
		mnNewMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("CERRAR SESIÓN");
		mnNewMenu.add(mntmCerrarSesion);
		
		JMenuItem mntmConfiguracion = new JMenuItem("CONFIGURACIÓN");
		mnNewMenu.add(mntmConfiguracion);
		

		
		
		mntmConfiguracion.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	new Perfil().setVisible(true);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		
		    }
		    
		});
	}
}
