package examAgnès;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exO1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public String Pass;
	public String log;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exO1 window = new exO1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exO1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblConnexion = new JLabel("Connexion");
		frame.getContentPane().add(lblConnexion, BorderLayout.NORTH);
		
		JLabel lblConnexion_1 = new JLabel("Connexion");
		lblConnexion_1.setFont(new Font("Manjari Regular", Font.BOLD, 14));
		lblConnexion_1.setBounds(138, 12, 173, 48);
		frame.getContentPane().add(lblConnexion_1);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(190, 72, 70, 15);
		frame.getContentPane().add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(163, 99, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(190, 127, 70, 15);
		frame.getContentPane().add(lblPassword);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pass= textField_1.getText();
				log= textField.getText();
				System.out.println("Le mot de passe de "+ log+" est "+ Pass);
				
			}

		});
		btnValider.setFont(new Font("Gargi", btnValider.getFont().getStyle(), btnValider.getFont().getSize()));
		btnValider.setBounds(166, 215, 117, 25);
		frame.getContentPane().add(btnValider);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 157, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}


		
}
