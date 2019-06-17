import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vistas.Busqueda;
import Vistas.NuevaAsignatura;
import Vistas.NuevaCarrera;
import Vistas.NuevoCurso;
import Vistas.Inicio;
import Vistas.Login;

public class ControladorInicio {
	private Inicio ventana;
	private Login login;
	private Perfil perfil;

	public ControladorInicio() {
		this.ventana = new Inicio();
		ventana.setVisible(true);

		ventana.getMntmNuevaCarrera().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaCarrera NC = new NuevaCarrera();
				ventana.getEscritorio().add(NC);
				NC.show();

			}
		});

		ventana.getMntmVerCarreras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda B = new Busqueda();
				ventana.getEscritorio().add(B);
				B.show();

			}
		});

		ventana.getMntmNuevoCurso().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoCurso NCU = new NuevoCurso();
				ventana.getEscritorio().add(NCU);
				NCU.show();

			}
		});

		ventana.getMntmVerCursos().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda B = new Busqueda();
				ventana.getEscritorio().add(B);
				B.show();

			}
		});

		ventana.getMntmNuevaAsignatura().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaAsignatura NA = new NuevaAsignatura();
				ventana.getEscritorio().add(NA);
				NA.show();

			}
		});

		ventana.getMntmVerAsignatura().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Busqueda B = new Busqueda();
				ventana.getEscritorio().add(B);
				B.show();

			}
		});

		ventana.getMntmConfiguracion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				Perfil perfil = new Perfil();
				perfil.setVisible(true);
			}
		});
		
		ventana.getMntmIniciarSesion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				Login L = new Login();
				ventana.getEscritorio().add(L);
				L.show();
			}
		});

	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControladorInicio controlador = new ControladorInicio();

				} catch (Exception e) {
					e.printStackTrace();
				}
				// System.out.println("Primero");

			};
		});
	}
}
