import javax.swing.JFrame;
import javax.swing.JLabel;

public class Perfil extends JFrame {
	public Perfil() {
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(40, 57, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(40, 99, 61, 16);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(40, 142, 61, 16);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(40, 188, 61, 16);
		getContentPane().add(label_2);
	}
}
