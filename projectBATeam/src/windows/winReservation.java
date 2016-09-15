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
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class winReservation extends winHeritage {

	private JPanel contentPane;
	private JPanel panelChambre;
	
	private ctrlChambre leControllerChambre ;
	private winReservation instance;
	public JTable tProduit;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winHeritage frame = new winReservation();
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
	public winReservation() {
		super();
		instance = this;

		
		

//---------------ACTION DES BOUTON DE LA FRAME----------------------------
		btnAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnEnregistrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				winPrincipale fenPrincipale = new winPrincipale();
	     		fenPrincipale.setVisible(true);
				winReservation.this.dispose();			
			}
		});
		btnModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnConsulter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "En construction", "Désolé",JOptionPane.ERROR_MESSAGE);
			}
		});
		
		
		
//---------------ACTION DU MENU DE LA FRAME----------------------------

		mnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				winPrincipale fenPrincipale = new winPrincipale();
	     		fenPrincipale.setVisible(true);
				winReservation.this.dispose();			
				}
		});		
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
		
		ModeConsultation();

	}

	private void ModeConsultation() {
		
		leControllerChambre = new ctrlChambre(instance);
		
	   //Composants graphiques des chambres	    
		panelChambre = new JPanel();
		panelChambre.setBackground(SystemColor.windowBorder);
		panelChambre.setBounds(204, 108, 469, 205);
		getContentPane().add(panelChambre);
		panelChambre.setLayout(null);
		
		JLabel lblClientNo = new JLabel("Client no :");
		lblClientNo.setBounds(20, 30, 72, 16);
		panelChambre.add(lblClientNo);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(172, 25, 65, 26);
		panelChambre.add(textField);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(20, 65, 72, 16);
		panelChambre.add(lblAdresse);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(168, 60, 258, 26);
		panelChambre.add(textField_1);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(249, 30, 39, 16);
		panelChambre.add(lblNom);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(296, 25, 130, 26);
		panelChambre.add(textField_2);
		
		JLabel lblTelephone = new JLabel("Téléphone :");
		lblTelephone.setBounds(20, 100, 86, 16);
		panelChambre.add(lblTelephone);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(107, 95, 130, 26);
		panelChambre.add(textField_3);
		
		JLabel lblFax = new JLabel("Fax :");
		lblFax.setBounds(249, 100, 39, 16);
		panelChambre.add(lblFax);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(296, 95, 130, 26);
		panelChambre.add(textField_4);
		
		JLabel lblTypeDeCarte = new JLabel("Type de Carte :");
		lblTypeDeCarte.setBounds(20, 135, 110, 16);
		panelChambre.add(lblTypeDeCarte);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(207, 130, 219, 26);
		panelChambre.add(textField_5);
		
		JLabel lblExpiration = new JLabel("Expiration :");
		lblExpiration.setBounds(20, 170, 86, 16);
		panelChambre.add(lblExpiration);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(132, 165, 105, 26);
		panelChambre.add(textField_6);
		
		JLabel lblSoldeDu = new JLabel("Solde dû :");
		lblSoldeDu.setBounds(249, 170, 65, 16);
		panelChambre.add(lblSoldeDu);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(315, 165, 110, 26);
		panelChambre.add(textField_7);
		
		
		//composante graphique de Ayant
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 370, 890, 205);
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(709, 108, 385, 205);
		getContentPane().add(panel);
		
		JLabel label_8 = new JLabel("No.Reservation :");
		label_8.setBounds(42, 30, 110, 16);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Réservé le :");
		label_9.setBounds(42, 65, 110, 16);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Date de début :");
		label_10.setBounds(42, 100, 110, 16);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Date de fin :");
		label_11.setBounds(42, 135, 110, 16);
		panel.add(label_11);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(183, 25, 130, 26);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(183, 60, 130, 26);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(183, 95, 130, 26);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(183, 130, 130, 26);
		panel.add(textField_23);
		
		JLabel lblInformationSurLe = new JLabel("Information sur le client qui réserve :");
		lblInformationSurLe.setBounds(204, 80, 269, 16);
		getContentPane().add(lblInformationSurLe);
		
		JLabel lblInformationSurLa = new JLabel("Information sur la réservation :");
		lblInformationSurLa.setBounds(709, 80, 269, 16);
		getContentPane().add(lblInformationSurLa);
		
		//Gestion de la souris sur le menu et la navigation
		
		btnPremier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.Premier(instance);
			}
		});
		btnPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.BonPrecedent(instance);
			}
		});
		btnDernier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.Dernier(instance);
			}
		});
		btnSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				leControllerChambre.BonSuivant(instance);
			}
		});
	}
}
