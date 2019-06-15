package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre = new JTextField();
	private JTextField Clave = new JTextField();
	private JTextField Email = new JTextField();
	private JTextField Direccion = new JTextField();
	private JTextField Apuntes = new JTextField();

	private JLabel lblNombre = new JLabel("USUARIO: ");
	private JLabel lblClave = new JLabel("CLAVE: ");
	private JLabel lblEmail = new JLabel("EMAIL: ");
	private JLabel lblDireccion = new JLabel("DIRECCION: ");
	private JLabel lblApuntes = new JLabel("APUNTES: ");
	private JButton btnActualizar = new JButton("ACTUALIZAR");
	private JButton btnBaja = new JButton("ELIMINAR CUENTA");

	public Perfil() {
		setTitle("PERFIL");
		setSize(400, 320);
		setLocation(new Point(300, 200));
		getContentPane().setLayout(null);
		setResizable(false);

		initComponent();
		initEvent();
	}

	private void initComponent() {

		Nombre.setBounds(132, 35, 199, 20);
		Clave.setBounds(132, 75, 199, 20);
		Email.setBounds(132, 115, 199, 20);
		Direccion.setBounds(132, 155, 199, 20);
		Apuntes.setBounds(132, 195, 199, 20);

		lblNombre.setBounds(39, 35, 80, 20);
		lblClave.setBounds(39, 75, 80, 20);
		lblEmail.setBounds(39, 115, 80, 20);
		lblDireccion.setBounds(39, 155, 80, 20);
		lblApuntes.setBounds(39, 195, 80, 20);

		btnActualizar.setBounds(33, 237, 132, 40);
		btnBaja.setBounds(245, 237, 132, 40);

		getContentPane().add(Nombre);
		getContentPane().add(Clave);
		getContentPane().add(Email);
		getContentPane().add(Direccion);
		getContentPane().add(Apuntes);

		getContentPane().add(lblNombre);
		getContentPane().add(lblClave);
		getContentPane().add(lblEmail);
		getContentPane().add(lblDireccion);
		getContentPane().add(lblApuntes);

		getContentPane().add(btnActualizar);
		getContentPane().add(btnBaja);

	}

	private void initEvent() {

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}
