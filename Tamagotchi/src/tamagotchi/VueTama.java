package tamagotchi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import javax.swing.Box;
import java.awt.Font;
import java.awt.Color;

public class VueTama {

	private JFrame frame;
	private JTextField txtSport;
	private JTextField textFieldsport;
	private JTextField textField_laver;
	private JTextField textField_jouer;
	private JTextField textField_dormir;
	private JTextField txtLaver;
	private JTextField txtJouer;
	private JTextField txtDormir;
	private JTextField textField_faim;
	private JTextField txtFaim;
	private Tama monTama;
	private JTextField txtHygiene;
	private JTextField textField_hygiene;
	private JTextField txthumeur;
	private JTextField textField_humeur;
	private JTextField textField;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueTama window = new VueTama();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void actualise() {
		textField_faim.setText(monTama.getFaim()+"");
		textFieldsport.setText(monTama.getSport()+"");
		textField_laver.setText(monTama.getLaver()+"");
		textField_jouer.setText(monTama.getGaming()+"");
		textField_dormir.setText(monTama.getDormir()+"");
		textField_hygiene.setText(monTama.getHygiene()+"");
		textField_humeur.setText(monTama.getHumeur()+"");

	}
	/**
	 * Create the application.
	 */
	public VueTama() {

		initialize();
		String reponse = JOptionPane.showInputDialog("Voulez vous un garçon ou une fille ?");
		if (reponse.equals("fille")) {
			frame.getContentPane().setBackground(Color.PINK);
		}
		else if(reponse.equals("garçon")){
			frame.getContentPane().setBackground(Color.BLUE);
		}
		else {
			System.out.println("Error");
		}
		monTama= new Tama("toto",reponse);
		//		if (monTama.getSexe()=='f') {
		//			frame.getContentPane().setBackground(Color.PINK);
		//			
		//		}
		//		else {
		//			frame.getContentPane().setBackground(Color.BLUE);
		//		}

		String reponse1= JOptionPane.showInputDialog(" Comment voulez vous que votre Tama s'appelle ?");
		actualise();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();     //////// ouvrir la fenetre
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(110, 1, 1));
		panel_1.setBounds(12, 12, 153, 246);
		frame.getContentPane().add(panel_1);   //// bouton rattaché au composant de frame 
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		txtSport = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, txtSport, 10, SpringLayout.WEST, panel_1);
		txtSport.setFont(new Font("URW Bookman L", Font.BOLD, 14));
		txtSport.setEditable(false);
		txtSport.setText("Sport");
		panel_1.add(txtSport);
		txtSport.setColumns(10);

		textFieldsport = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.EAST, txtSport, -17, SpringLayout.WEST, textFieldsport);
		sl_panel_1.putConstraint(SpringLayout.NORTH, textFieldsport, -2, SpringLayout.NORTH, txtSport);
		sl_panel_1.putConstraint(SpringLayout.EAST, textFieldsport, -38, SpringLayout.EAST, panel_1);
		textFieldsport.setEditable(false);
		panel_1.add(textFieldsport);
		textFieldsport.setColumns(10);

		textField_laver = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_laver, 6, SpringLayout.SOUTH, textFieldsport);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_laver, 0, SpringLayout.WEST, textFieldsport);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_laver, 0, SpringLayout.EAST, textFieldsport);
		textField_laver.setEditable(false);
		textField_laver.setColumns(10);
		panel_1.add(textField_laver);

		textField_jouer = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_jouer, 6, SpringLayout.SOUTH, textField_laver);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_jouer, 86, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_jouer, 0, SpringLayout.EAST, textFieldsport);
		textField_jouer.setEditable(false);
		textField_jouer.setColumns(10);
		panel_1.add(textField_jouer);

		textField_dormir = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_dormir, 6, SpringLayout.SOUTH, textField_jouer);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_dormir, 0, SpringLayout.WEST, textFieldsport);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_dormir, -38, SpringLayout.EAST, panel_1);
		textField_dormir.setEditable(false);
		textField_dormir.setColumns(10);
		panel_1.add(textField_dormir);

		Box horizontalBox = Box.createHorizontalBox();
		sl_panel_1.putConstraint(SpringLayout.WEST, horizontalBox, 30, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, horizontalBox, -49, SpringLayout.SOUTH, panel_1);
		panel_1.add(horizontalBox);

		txtLaver = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtLaver, 6, SpringLayout.SOUTH, txtSport);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtLaver, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtLaver, -17, SpringLayout.WEST, textField_laver);
		txtLaver.setFont(new Font("URW Bookman L", Font.BOLD, 14));
		txtLaver.setEditable(false);
		txtLaver.setText("Laver");
		txtLaver.setColumns(10);
		panel_1.add(txtLaver);

		txtJouer = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtJouer, 3, SpringLayout.SOUTH, txtLaver);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtJouer, 0, SpringLayout.WEST, txtSport);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtJouer, -84, SpringLayout.EAST, panel_1);
		txtJouer.setFont(new Font("URW Bookman L", Font.BOLD, 14));
		txtJouer.setEditable(false);
		txtJouer.setText("Jouer");
		txtJouer.setColumns(10);
		panel_1.add(txtJouer);

		txtDormir = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtDormir, 6, SpringLayout.SOUTH, txtJouer);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtDormir, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtDormir, 0, SpringLayout.EAST, txtSport);
		txtDormir.setFont(new Font("URW Bookman L", Font.BOLD, 14));
		txtDormir.setEditable(false);
		txtDormir.setText("Dormir");
		txtDormir.setColumns(10);
		panel_1.add(txtDormir);

		textField_faim = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, textFieldsport, 0, SpringLayout.WEST, textField_faim);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_faim, -38, SpringLayout.EAST, panel_1);
		textField_faim.setEditable(false);
		textField_faim.setColumns(10);
		panel_1.add(textField_faim);

		txtFaim = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, txtFaim, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtFaim, -201, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtFaim, -84, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_faim, -2, SpringLayout.NORTH, txtFaim);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_faim, 17, SpringLayout.EAST, txtFaim);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtSport, 6, SpringLayout.SOUTH, txtFaim);
		txtFaim.setFont(new Font("URW Bookman L", Font.BOLD, 14));
		txtFaim.setText("Faim");
		txtFaim.setEditable(false);
		txtFaim.setColumns(10);
		panel_1.add(txtFaim);

		txtHygiene = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtHygiene, 6, SpringLayout.SOUTH, txtDormir);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtHygiene, 0, SpringLayout.WEST, txtSport);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtHygiene, 6, SpringLayout.EAST, txtSport);
		txtHygiene.setText("Hygiene");
		txtHygiene.setFont(new Font("URW Bookman L", Font.BOLD, 14));
		txtHygiene.setEditable(false);
		txtHygiene.setColumns(10);
		panel_1.add(txtHygiene);

		textField_hygiene = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_hygiene, 6, SpringLayout.SOUTH, textField_dormir);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_hygiene, 56, SpringLayout.WEST, horizontalBox);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_hygiene, 0, SpringLayout.EAST, textFieldsport);
		textField_hygiene.setText("0");
		textField_hygiene.setEditable(false);
		textField_hygiene.setColumns(10);
		panel_1.add(textField_hygiene);

		txthumeur = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txthumeur, 6, SpringLayout.SOUTH, txtHygiene);
		sl_panel_1.putConstraint(SpringLayout.WEST, txthumeur, 0, SpringLayout.WEST, txtSport);
		sl_panel_1.putConstraint(SpringLayout.EAST, txthumeur, 45, SpringLayout.WEST, horizontalBox);
		txthumeur.setText("Humeur");
		txthumeur.setFont(new Font("URW Bookman L", Font.BOLD, 14));
		txthumeur.setEditable(false);
		txthumeur.setColumns(10);
		panel_1.add(txthumeur);

		textField_humeur = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_humeur, 6, SpringLayout.SOUTH, textField_hygiene);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_humeur, 0, SpringLayout.WEST, textFieldsport);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_humeur, 0, SpringLayout.EAST, textField_hygiene);
		textField_humeur.setText("0");
		textField_humeur.setEditable(false);
		textField_humeur.setColumns(10);
		panel_1.add(textField_humeur);

		JButton btnsport = new JButton(" Sport");
		btnsport.setBounds(177, 64, 98, 25);
		frame.getContentPane().add(btnsport);

		JButton btnDormir = new JButton("Dormir");
		btnDormir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monTama.goDormir();
				actualise();

			}
		});
		btnDormir.setBounds(177, 136, 98, 27);
		frame.getContentPane().add(btnDormir);

		JButton btnLaver = new JButton("Laver");
		btnLaver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monTama.goLaver();
				actualise();
			}
		});
		btnLaver.setBounds(177, 88, 98, 25);
		frame.getContentPane().add(btnLaver);

		JButton btnJouer = new JButton("Jouer");
		btnJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monTama.statueGaming();
				actualise();

			}
		});
		btnJouer.setBounds(177, 112, 98, 25);
		frame.getContentPane().add(btnJouer);

		JButton btnManger = new JButton("Manger");
		btnManger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(!monTama.isMort()) {
					monTama.manger();
					actualise();
				}else {
					JOptionPane.showMessageDialog(frame, "Il est mort", "Alert", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnManger.setBounds(177, 39, 98, 25);
		frame.getContentPane().add(btnManger);

		JLabel lblTamagotchi = new JLabel("Tamagotchi ");
		lblTamagotchi.setFont(new Font("Ubuntu", Font.BOLD | Font.ITALIC, 16));
		lblTamagotchi.setBounds(176, 12, 137, 27);
		frame.getContentPane().add(lblTamagotchi);

		textField = new JTextField();
		textField.setBounds(-48, 112, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JTextPane txtpnBob = new JTextPane();
		txtpnBob.setText("bob");
		txtpnBob.setBounds(300, 12, 108, 246);
		frame.getContentPane().add(txtpnBob);
		btnsport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monTama.goSport();
				actualise();

			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
