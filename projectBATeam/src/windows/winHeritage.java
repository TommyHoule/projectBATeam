package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class winHeritage extends JFrame {

	private JPanel contentPane;
	private final JButton btnAjouter = new JButton("Ajouter");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winHeritage frame = new winHeritage();
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
	public winHeritage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(winHeritage.class.getResource("/elementsGraphiques/Images/BATeam.jpg")));
		lblNewLabel.setBounds(6, 25, 100, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnSuivant = new JButton(">");
		btnSuivant.setBounds(61, 216, 25, 22);
		contentPane.add(btnSuivant);
		
		JButton btnDernier = new JButton(">>");
		btnDernier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDernier.setBounds(87, 216, 25, 22);
		contentPane.add(btnDernier);
		
		JButton btnPrecedent = new JButton("<");
		btnPrecedent.setBounds(33, 216, 25, 22);
		contentPane.add(btnPrecedent);
		
		JButton btnPremier = new JButton("<<");
		btnPremier.setBounds(6, 216, 25, 22);
		contentPane.add(btnPremier);
		btnAjouter.setBounds(0, 78, 117, 29);
		contentPane.add(btnAjouter);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(0, 104, 117, 29);
		contentPane.add(btnSupprimer);
		
		JButton btnConsulter = new JButton("Consulter");
		btnConsulter.setBounds(0, 132, 117, 29);
		contentPane.add(btnConsulter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(0, 160, 117, 29);
		contentPane.add(btnModifier);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(0, 185, 117, 29);
		contentPane.add(btnQuitter);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(6, 243, 117, 15);
		contentPane.add(btnEnregistrer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(6, 260, 117, 15);
		contentPane.add(btnAnnuler);
	}
}
