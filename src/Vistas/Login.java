package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame {

  private JButton btnAcceso  = new JButton("Acceder");

  private JTextField txtA = new JTextField();
  private JTextField txtB = new JTextField();

  private JLabel lblUsuario = new JLabel("USUARIO: ");
  private JLabel lblClave = new JLabel("CLAVE: ");

  public Login(){
    setTitle("ING - DOCS");
    setSize(400,200);
    setLocation(new Point(300,200));
    getContentPane().setLayout(null);    
    setResizable(false);

    initComponent();    
    initEvent();    
  }

  private void initComponent(){
	  btnAcceso.setBounds(152,119, 94,36);

    txtA.setBounds(132,35,199,20);
    txtB.setBounds(132,81,199,20);

    lblUsuario.setBounds(49,35,71,20);
    lblClave.setBounds(49,81,71,20);


    getContentPane().add(btnAcceso);

    getContentPane().add(lblUsuario);
    getContentPane().add(lblClave);

    getContentPane().add(txtA);
    getContentPane().add(txtB);
  }

  private void initEvent(){

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
    	  dispose();;
      }
    });

    btnAcceso.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnTutupClick(e);
      }
    });
  }
  
  private void btnTutupClick(ActionEvent evt){
	  dispose();
  }
}