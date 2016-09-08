package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controleurs.ctrlChambre;
import controleurs.ctrlPrincipale;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class winChambre extends winHeritage {

	private JPanel contentPane;
	private JPanel panelChambre;
	private JLabel lblNoChambre;
	private JLabel lblEtage;
	private JLabel lblCodeType;
	private JLabel lblCodelocalisation;
	private JLabel lblEtat;
	private JLabel lblPrix;
	private JLabel lblDescriptionCodeType;
	private JLabel lblDescriptionCodeLocalisation;
	private JTextField txtNoChambre;
	private JTextField txtEtage;
	private JTextField txtEtat;
	private JTextField txtCodeType;
	private JTextField textField;
	private JTextField txtPrix;
	private JTextField txtDescriptionCodeType;
	private JTextField txtDescriptionCodeLocalisation;
	private JTextField txtMemo;
	
	private ctrlChambre leControllerChambre ;
	private winChambre instance;
	public JTable tProduit;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winHeritage frame = new winChambre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public winChambre() {
		super();
		instance = this;

		
		
		panelChambre = new JPanel();
		panelChambre.setBackground(SystemColor.windowBorder);
		panelChambre.setBounds(204, 108, 890, 205);
		getContentPane().add(panelChambre);
		panelChambre.setLayout(null);
		
		lblNoChambre = new JLabel("No. Chambre :");
		lblNoChambre.setBounds(6, 6, 92, 16);
		panelChambre.add(lblNoChambre);
		
		lblEtage = new JLabel("Etage :");
		lblEtage.setBounds(6, 48, 82, 16);
		panelChambre.add(lblEtage);
		
		lblEtat = new JLabel("Etat :");
		lblEtat.setBounds(6, 103, 82, 16);
		panelChambre.add(lblEtat);
		
		txtNoChambre = new JTextField();
		txtNoChambre.setEditable(false);
		txtNoChambre.setBounds(100, 1, 130, 26);
		panelChambre.add(txtNoChambre);
		txtNoChambre.setColumns(10);
		
		txtEtage = new JTextField();
		txtEtage.setEditable(false);
		txtEtage.setColumns(10);
		txtEtage.setBounds(100, 43, 130, 26);
		panelChambre.add(txtEtage);
		
		txtEtat = new JTextField();
		txtEtat.setEditable(false);
		txtEtat.setColumns(10);
		txtEtat.setBounds(100, 98, 130, 26);
		panelChambre.add(txtEtat);
		
	    lblCodeType = new JLabel("Code_Type :");
		lblCodeType.setBounds(255, 6, 130, 16);
		panelChambre.add(lblCodeType);
		
		lblCodelocalisation = new JLabel("Code_Localisation :");
		lblCodelocalisation.setBounds(255, 48, 130, 16);
		panelChambre.add(lblCodelocalisation);
		
		lblPrix = new JLabel("Prix :");
		lblPrix.setBounds(255, 103, 130, 16);
		panelChambre.add(lblPrix);
		
		txtCodeType = new JTextField();
		txtCodeType.setEditable(false);
		txtCodeType.setBounds(389, 1, 130, 26);
		panelChambre.add(txtCodeType);
		txtCodeType.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(389, 43, 130, 26);
		panelChambre.add(textField);
		
		txtPrix = new JTextField("$",10);
		txtPrix.setEditable(false);
		txtPrix.setColumns(10);
		txtPrix.setBounds(389, 98, 130, 26);
		panelChambre.add(txtPrix);
		
		lblDescriptionCodeType = new JLabel("Description :");
		lblDescriptionCodeType.setBounds(556, 6, 130, 16);
		panelChambre.add(lblDescriptionCodeType);
		
		lblDescriptionCodeLocalisation = new JLabel("Description :");
		lblDescriptionCodeLocalisation.setBounds(556, 48, 130, 16);
		panelChambre.add(lblDescriptionCodeLocalisation);
		
		txtDescriptionCodeType = new JTextField();
		txtDescriptionCodeType.setEditable(false);
		txtDescriptionCodeType.setColumns(10);
		txtDescriptionCodeType.setBounds(656, 1, 130, 26);
		panelChambre.add(txtDescriptionCodeType);
		
		txtDescriptionCodeLocalisation = new JTextField();
		txtDescriptionCodeLocalisation.setEditable(false);
		txtDescriptionCodeLocalisation.setColumns(10);
		txtDescriptionCodeLocalisation.setBounds(656, 43, 130, 26);
		panelChambre.add(txtDescriptionCodeLocalisation);
		
		txtMemo = new JTextField();
		txtMemo.setText("Description spéciale de la chambre");
		txtMemo.setEditable(false);
		txtMemo.setBounds(556, 103, 230, 81);
		panelChambre.add(txtMemo);
		txtMemo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 370, 890, 205);
		getContentPane().add(scrollPane);

//---------------ACTION DES BOUTON DE LA FRAME----------------------------
		btnAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(10);
			}
		});
		btnEnregistrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(9);
			}
		});
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(11);
			}
		});
		btnModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(8);
			}
		});
		btnConsulter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(7);
			}
		});
		btnSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(6);
			}
		});
		btnAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(5);
			}
		});
		btnPremier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(4);
			}
		});
		btnPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(3);
			}
		});
		btnDernier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(2);
			}
		});
		btnSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(1);
			}
		});
		mnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.ActionBtn(11);
			}
		});
		
//---------------ACTION DU MENU DE LA FRAME----------------------------
		
		mnRapports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		mnListes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		mnEntretien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});

	}
}
