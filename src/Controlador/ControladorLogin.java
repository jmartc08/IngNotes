package Controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import Vistas.Inicio;
import Vistas.Login;


public class ControladorLogin {
	private Login ventana;

	public ControladorLogin(Inicio principal) {
		ventana = new Login();
		
		principal.getEscritorio().add(ventana);
		ventana.show();

		ventana.getBtnAcceso().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		ventana.getRegistro().addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				ventana.getRegistro().setForeground(new Color(255, 69, 0));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ventana.getRegistro().setForeground(new Color(0, 0, 255));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}


	public void JInternalFrame(JInternalFrame ventana) {
		this.ventana = (Login) ventana;

	}
}
