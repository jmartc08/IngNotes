import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import Vistas.Inicio;
import Vistas.Login;


public class ControladorLogin {
	private Login ventana;

	public ControladorLogin() {
		this.getVentana();
	

		Login n = new Login();

		ventana.setVisible(true);

		ventana.getBtnAcceso().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
	
	

	public JInternalFrame getVentana() {
		return ventana;
	}

	public void JInternalFrame(JInternalFrame ventana) {
		this.ventana = (Login) ventana;

	}
}
