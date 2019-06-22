package Vistas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registro extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public Registro() {
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		setSize(400,400);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(40, 43, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(40, 78, 61, 16);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(40, 117, 61, 16);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(40, 153, 61, 16);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(40, 181, 61, 16);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(40, 213, 61, 16);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(40, 251, 61, 16);
		getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setBounds(204, 38, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 73, 130, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(204, 112, 130, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(204, 148, 130, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(204, 191, 130, 26);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(204, 241, 130, 26);
		getContentPane().add(textField_5);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(17, 290, 140, 51);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(217, 312, 117, 29);
		getContentPane().add(button);
	}
}
