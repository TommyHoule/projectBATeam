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

public class winReservation extends winHeritage {

	private JPanel contentPane;
	private JPanel panelReservationDeGauche;
	private JLabel lblNoClient;
	private JTextField txtNoClient;
	
	private winReservation instance;
	public JTable tableReservationDe;
	private JPanel panelReservationDeDroite;
	private JLabel lblNoreservation;
	private JTextField txtNoReser;
	private JLabel lblNom;
	private JTextField txtNom;
	private JLabel lblAdresse;
	private JTextField txtAdresse;
	private JLabel lblTlphone;
	private JTextField txtTelephone;
	private JTextField txtFax;
	private JLabel lblFax;
	private JLabel lblTypeDeCarte;
	private JTextField txtTypeCarte;
	private JLabel lblExpiration;
	private JTextField txtExpiration;
	private JLabel lblSoldeD;
	private JTextField txtSoldeDu;
	private JLabel lblRservLe;
	private JLabel lblDateDeDbut;
	private JLabel lblDateDeFin;
	private JTextField txtDateReser;
	private JTextField txtDateDebut;
	private JTextField txtDateFin;


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
		  
		panelReservationDeGauche = new JPanel();
		panelReservationDeGauche.setBackground(SystemColor.windowBorder);
		panelReservationDeGauche.setBounds(182, 108, 469, 205);
		getContentPane().add(panelReservationDeGauche);
		panelReservationDeGauche.setLayout(null);
		
		lblNoClient = new JLabel("Client no :");
		lblNoClient.setBounds(20, 10, 77, 16);
		panelReservationDeGauche.add(lblNoClient);
		
		txtNoClient = new JTextField();
		txtNoClient.setEditable(false);
		txtNoClient.setBounds(125, 5, 64, 26);
		panelReservationDeGauche.add(txtNoClient);
		txtNoClient.setColumns(10);
		
		lblNom = new JLabel("Nom :");
		lblNom.setBounds(200, 10, 46, 16);
		panelReservationDeGauche.add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setEditable(false);
		txtNom.setColumns(10);
		txtNom.setBounds(250, 5, 200, 26);
		panelReservationDeGauche.add(txtNom);
		
		lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(20, 50, 77, 16);
		panelReservationDeGauche.add(lblAdresse);
		
		txtAdresse = new JTextField();
		txtAdresse.setEditable(false);
		txtAdresse.setColumns(10);
		txtAdresse.setBounds(125, 45, 200, 26);
		panelReservationDeGauche.add(txtAdresse);
		
		lblTlphone = new JLabel("Téléphone :");
		lblTlphone.setBounds(20, 90, 77, 16);
		panelReservationDeGauche.add(lblTlphone);
		
		txtTelephone = new JTextField();
		txtTelephone.setEditable(false);
		txtTelephone.setColumns(10);
		txtTelephone.setBounds(125, 85, 125, 26);
		panelReservationDeGauche.add(txtTelephone);
		
		txtFax = new JTextField();
		txtFax.setEditable(false);
		txtFax.setColumns(10);
		txtFax.setBounds(325, 85, 125, 26);
		panelReservationDeGauche.add(txtFax);
		
		lblFax = new JLabel("Fax :");
		lblFax.setBounds(275, 90, 35, 16);
		panelReservationDeGauche.add(lblFax);
		
		lblTypeDeCarte = new JLabel("Type de Carte :");
		lblTypeDeCarte.setBounds(20, 130, 100, 16);
		panelReservationDeGauche.add(lblTypeDeCarte);
		
		txtTypeCarte = new JTextField();
		txtTypeCarte.setEditable(false);
		txtTypeCarte.setColumns(10);
		txtTypeCarte.setBounds(125, 123, 200, 26);
		panelReservationDeGauche.add(txtTypeCarte);
		
		lblExpiration = new JLabel("Expiration :");
		lblExpiration.setBounds(20, 170, 100, 16);
		panelReservationDeGauche.add(lblExpiration);
		
		txtExpiration = new JTextField();
		txtExpiration.setEditable(false);
		txtExpiration.setColumns(10);
		txtExpiration.setBounds(125, 165, 100, 26);
		panelReservationDeGauche.add(txtExpiration);
		
		lblSoldeD = new JLabel("Solde dü :");
		lblSoldeD.setBounds(250, 170, 64, 16);
		panelReservationDeGauche.add(lblSoldeD);
		
		txtSoldeDu = new JTextField();
		txtSoldeDu.setEditable(false);
		txtSoldeDu.setColumns(10);
		txtSoldeDu.setBounds(325, 165, 100, 26);
		panelReservationDeGauche.add(txtSoldeDu);
		
		
		//composante graphique de Ayant
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 370, 890, 205);
		getContentPane().add(scrollPane);
		
		panelReservationDeDroite = new JPanel();
		panelReservationDeDroite.setLayout(null);
		panelReservationDeDroite.setBackground(SystemColor.windowBorder);
		panelReservationDeDroite.setBounds(685, 108, 440, 205);
		getContentPane().add(panelReservationDeDroite);
		
		lblNoreservation = new JLabel("No.Reservation :");
		lblNoreservation.setBounds(70, 20, 115, 16);
		panelReservationDeDroite.add(lblNoreservation);
		
		txtNoReser = new JTextField();
		txtNoReser.setEditable(false);
		txtNoReser.setColumns(10);
		txtNoReser.setBounds(225, 15, 130, 26);
		panelReservationDeDroite.add(txtNoReser);
		
		lblRservLe = new JLabel("Réservé le :");
		lblRservLe.setBounds(70, 70, 92, 16);
		panelReservationDeDroite.add(lblRservLe);
		
		lblDateDeDbut = new JLabel("Date de début :");
		lblDateDeDbut.setBounds(70, 120, 115, 16);
		panelReservationDeDroite.add(lblDateDeDbut);
		
		lblDateDeFin = new JLabel("Date de fin :");
		lblDateDeFin.setBounds(70, 170, 92, 16);
		panelReservationDeDroite.add(lblDateDeFin);
		
		txtDateReser = new JTextField();
		txtDateReser.setEditable(false);
		txtDateReser.setColumns(10);
		txtDateReser.setBounds(225, 65, 130, 26);
		panelReservationDeDroite.add(txtDateReser);
		
		txtDateDebut = new JTextField();
		txtDateDebut.setEditable(false);
		txtDateDebut.setColumns(10);
		txtDateDebut.setBounds(225, 115, 130, 26);
		panelReservationDeDroite.add(txtDateDebut);
		
		txtDateFin = new JTextField();
		txtDateFin.setEditable(false);
		txtDateFin.setColumns(10);
		txtDateFin.setBounds(225, 165, 130, 26);
		panelReservationDeDroite.add(txtDateFin);
		
		//Gestion de la souris sur le menu et la navigation
		
		btnPremier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//leControllerChambre.Premier(instance);
			}
		});
		btnPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//leControllerChambre.BonPrecedent(instance);
			}
		});
		btnDernier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//leControllerChambre.Dernier(instance);
			}
		});
		btnSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//leControllerChambre.BonSuivant(instance);
			}
		});
	}

}
