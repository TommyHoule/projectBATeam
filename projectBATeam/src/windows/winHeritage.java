package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class winHeritage extends JFrame {

	protected JMenuBar menuBar;
	protected JMenu mnEntretien;
	protected JMenuItem mnitemAjouter;
	protected JMenuItem mnitemModifier;
	protected JMenuItem mnitemDtruire ;
	protected JMenu mnListes;
	protected JMenu mnRapports;
	protected JMenu mnQuitter;
	protected JMenuItem mnitemListeDesBons;
	
	

	
	protected JPanel contentPane;
	protected JButton btnAnnuler;
	protected JButton btnSuivant;
	protected JButton btnDernier;
	protected JButton btnPrecedent;
	protected JButton btnPremier;
	protected JButton btnAjouter;
	protected JButton btnSupprimer;
	protected JButton btnConsulter;
	protected JButton btnModifier;
	protected JButton btnQuitter;
	protected JButton btnEnregistrer;


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//c'est une classe abstraite, on ne peux pas l'instancier
					//winHeritage frame = new winHeritage();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public winHeritage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setIcon(new ImageIcon(winHeritage.class.getResource("/elementsGraphiques/Images/BATeam.jpg")));
		lblLogo.setBounds(6, 6, 100, 41);
		contentPane.add(lblLogo);
		
		btnSuivant = new JButton(">");
		btnSuivant.setBounds(242, 16, 30, 22);
		contentPane.add(btnSuivant);
		
		btnDernier = new JButton(">>");
		btnDernier.setBounds(284, 16, 30, 22);
		contentPane.add(btnDernier);
		
		btnPrecedent = new JButton("<");
		btnPrecedent.setBounds(200, 16, 30, 22);
		contentPane.add(btnPrecedent);
		
	    btnPremier = new JButton("<<");
		btnPremier.setBounds(158, 16, 30, 22);
		contentPane.add(btnPremier);
		
		btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(6, 102, 150, 50);
		contentPane.add(btnAjouter);
		
		btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(6, 191, 150, 50);
		contentPane.add(btnSupprimer);
		
		btnConsulter = new JButton("Consulter");
		btnConsulter.setBounds(6, 368, 150, 50);
		contentPane.add(btnConsulter);
		
		btnModifier = new JButton("Modifier");
		btnModifier.setBounds(6, 282, 150, 50);
		contentPane.add(btnModifier);
		
		btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(6, 450, 150, 50);
		contentPane.add(btnQuitter);
		
		btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(6, 577, 150, 30);
		contentPane.add(btnEnregistrer);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(6, 620, 150, 30);
		contentPane.add(btnAnnuler);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnEntretien = new JMenu("Entretien");
		menuBar.add(mnEntretien);
		
		mnitemAjouter = new JMenuItem("Ajouter");
		mnEntretien.add(mnitemAjouter);
		
		mnitemModifier = new JMenuItem("Modifier");
		mnEntretien.add(mnitemModifier);
		
		mnitemDtruire = new JMenuItem("Détruire");
		mnEntretien.add(mnitemDtruire);
		
		mnListes = new JMenu("Listes");
		menuBar.add(mnListes);
		
		mnitemListeDesBons = new JMenuItem("Liste des bons d'achats pour un intervalle de date");
		mnListes.add(mnitemListeDesBons);
		
		mnRapports = new JMenu("Rapports");
		menuBar.add(mnRapports);
		
		mnQuitter = new JMenu("Quitter");
		menuBar.add(mnQuitter);
	}
}
