package Vistas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Window;

import javax.swing.JButton;

public class Perfil extends JFrame {

	private JLabel lblID;
	private JLabel lblTipo;
	private JLabel lblTelefono;
	private JLabel lblClave;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lbEmail;
	private JLabel lblDireccion;

	private JTextField textFieldNumeroID;
	private JTextField textFieldTipoUsuario;
	private JTextField textFieldClave;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldEmail;
	private JTextField textFieldDireccion;
	private JTextField textFieldTelefono;
	
	private JButton btnActualizarDatos;
	private JButton btnEliminarCuenta;

	public Perfil() {
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		setSize(400, 450);

		// **** ETIQUETAS **** //

		lblID = new JLabel("Número ID");
		lblID.setBounds(40, 30, 80, 16);
		lblTipo = new JLabel("Tipo de Usuario");
		lblTipo.setBounds(40, 70, 100, 16);
		lblClave = new JLabel("Clave");
		lblClave.setBounds(40, 110, 80, 16);
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(40, 150, 80, 16);
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(40, 190, 80, 16);
		lbEmail = new JLabel("Email");
		lbEmail.setBounds(40, 230, 80, 16);
		lblDireccion = new JLabel("Dirección");
		lblDireccion.setBounds(40, 270, 80, 16);
		lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(40, 310, 80, 16);

		// **** CAMPOS DE INFORMACIÓN **** //

		textFieldNumeroID = new JTextField();
		textFieldNumeroID.setColumns(10);
		textFieldNumeroID.setBounds(186, 25, 190, 26);

		textFieldTipoUsuario = new JTextField();
		textFieldTipoUsuario.setColumns(10);
		textFieldTipoUsuario.setBounds(186, 65, 190, 26);

		textFieldClave = new JTextField();
		textFieldClave.setColumns(10);
		textFieldClave.setBounds(186, 105, 190, 26);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(186, 145, 190, 26);

		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(186, 185, 190, 26);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(186, 225, 190, 26);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		textFieldDireccion.setBounds(186, 265, 190, 26);

		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(186, 305, 190, 26);

		// **** BOTONES **** //

		btnActualizarDatos = new JButton("ACTUALIZAR DATOS");
		btnActualizarDatos.setBounds(20, 360, 140, 51);
		btnEliminarCuenta = new JButton("ELIMINAR CUENTA");
		btnEliminarCuenta.setBounds(216, 360, 140, 51);

		// **** AÑADIR **** //
		getContentPane().add(lblID);
		getContentPane().add(lblTipo);
		getContentPane().add(lblClave);
		getContentPane().add(lblNombre);
		getContentPane().add(lblApellidos);
		getContentPane().add(lbEmail);
		getContentPane().add(lblDireccion);
		getContentPane().add(lblTelefono);

		getContentPane().add(textFieldNumeroID);

		getContentPane().add(textFieldTipoUsuario);

		getContentPane().add(textFieldClave);

		getContentPane().add(textFieldNombre);

		getContentPane().add(textFieldApellidos);

		getContentPane().add(textFieldEmail);

		getContentPane().add(textFieldDireccion);

		getContentPane().add(textFieldTelefono);

		getContentPane().add(btnActualizarDatos);

		getContentPane().add(btnEliminarCuenta);
	}
}
