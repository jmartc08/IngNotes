import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Vistas.Login;

public class ControladorLogin {
	private Login ventana;

	public ControladorLogin(Login ventana) {
		this.ventana = ventana;

		ventana.getBtnAcceso().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
}
