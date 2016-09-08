package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JTable;

public class winChambre extends winHeritage {

	private JPanel contentPane;
	private JTextField txtNoChambre;
	private JTextField txtEtage;
	private JTextField txtEtat;
	private JTextField txtCodeType;
	private JTextField textField;
	private JTextField txtPrix;
	private JTextField txtDescriptionCodeType;
	private JTextField txtDescriptionCodeLocalisation;
	private JTextField txtMemo;
	private JTable tblCodCom;

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
		
		JPanel panelChambre = new JPanel();
		panelChambre.setBackground(SystemColor.windowBorder);
		panelChambre.setBounds(204, 108, 890, 205);
		getContentPane().add(panelChambre);
		panelChambre.setLayout(null);
		
		JLabel lblNoChambre = new JLabel("No. Chambre :");
		lblNoChambre.setBounds(6, 6, 92, 16);
		panelChambre.add(lblNoChambre);
		
		JLabel lblEtage = new JLabel("Etage :");
		lblEtage.setBounds(6, 48, 82, 16);
		panelChambre.add(lblEtage);
		
		JLabel lblEtat = new JLabel("Etat :");
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
		
		JLabel lblCodeType = new JLabel("Code_Type :");
		lblCodeType.setBounds(255, 6, 130, 16);
		panelChambre.add(lblCodeType);
		
		JLabel lblCodelocalisation = new JLabel("Code_Localisation :");
		lblCodelocalisation.setBounds(255, 48, 130, 16);
		panelChambre.add(lblCodelocalisation);
		
		JLabel lblPrix = new JLabel("Prix :");
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
		
		JLabel lblDescriptionCodeType = new JLabel("Description :");
		lblDescriptionCodeType.setBounds(556, 6, 130, 16);
		panelChambre.add(lblDescriptionCodeType);
		
		JLabel lblDescriptionCodeLocalisation = new JLabel("Description :");
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
		
		JPanel panelDescription = new JPanel();
		panelDescription.setBackground(SystemColor.windowBorder);
		panelDescription.setBounds(204, 369, 890, 205);
		getContentPane().add(panelDescription);
		
		Object[][] donnees = {
                {"AS", "Standards, rien de spécial"},
                {"BA", "Avec balcon"},
                {"BT", "Avec bain tourbillon"},
                {"CC", "Chambre communicante"},
                {"IN", "Internet"},
                {"MB", "Mini bar"},
                {"HP", "Handicape"},
        };
 
        String[] entetes = {"CODCOM", "Description"};
 
		
		tblCodCom = new JTable(donnees, entetes);
		tblCodCom.setEnabled(false);
		tblCodCom.setCellSelectionEnabled(true);
		tblCodCom.setColumnSelectionAllowed(true);
		tblCodCom.setFillsViewportHeight(true);
		panelDescription.add(new JScrollPane(tblCodCom), BorderLayout.CENTER);
		

	}
}
