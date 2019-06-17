package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

	private JButton btnAcceso = new JButton("Acceder");
	private JTextField txtA = new JTextField();
	private JTextField txtB = new JTextField();
	private JLabel lblUsuario = new JLabel("USUARIO: ");
	private JLabel lblClave = new JLabel("CLAVE: ");

	public Login() {
		setTitle("ING - DOCS");
		setSize(400, 200);
		setLocation(new Point(300, 200));
		getContentPane().setLayout(null);
		setResizable(false);
		initComponent();

	}

	private void initComponent() {

		btnAcceso.setBounds(152, 119, 94, 36);
		txtA.setBounds(132, 35, 199, 20);
		txtB.setBounds(132, 81, 199, 20);
		lblUsuario.setBounds(49, 35, 71, 20);
		lblClave.setBounds(49, 81, 71, 20);

		getContentPane().add(btnAcceso);
		getContentPane().add(lblUsuario);
		getContentPane().add(lblClave);
		getContentPane().add(txtA);
		getContentPane().add(txtB);
	}

	public JButton getBtnAcceso() {
		return btnAcceso;
	}

	public void setBtnAcceso(JButton btnAcceso) {
		this.btnAcceso = btnAcceso;
	}

	public JTextField getTxtA() {
		return txtA;
	}

	public void setTxtA(JTextField txtA) {
		this.txtA = txtA;
	}

	public JTextField getTxtB() {
		return txtB;
	}

	public void setTxtB(JTextField txtB) {
		this.txtB = txtB;
	}

	public JLabel getLblUsuario() {
		return lblUsuario;
	}

	public void setLblUsuario(JLabel lblUsuario) {
		this.lblUsuario = lblUsuario;
	}

	public JLabel getLblClave() {
		return lblClave;
	}

	public void setLblClave(JLabel lblClave) {
		this.lblClave = lblClave;
	}

}