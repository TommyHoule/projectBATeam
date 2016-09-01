package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import elementsGraphiques.btnOption;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Component;

import javax.swing.JTextArea;

import controleurs.CtrlWinPrincipal;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WinPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static WinPrincipal instance;
	private JPanel panelPrincipal;

	private CtrlWinPrincipal instanceCtrlFenPrinc;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinPrincipal.instance  = new WinPrincipal();
					WinPrincipal.instance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public WinPrincipal() {
		
		
		instanceCtrlFenPrinc = new CtrlWinPrincipal(this);
		setResizable(false);
		setTitle("SYSTÈME CLÉ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 461);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.LIGHT_GRAY);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JPanel panelFonctions = new JPanel();
		panelFonctions.setBounds(24, 24, 227, 380);
		panelPrincipal.add(panelFonctions);
		panelFonctions.setLayout(null);
		
		btnOption btnAchat = new btnOption((String) null);
		btnAchat.setBounds(6, 6, 215, 29);
		panelFonctions.add(btnAchat);
		btnAchat.setText("ACHATS");
		
		btnOption btnInventaire = new btnOption((String) null);
		btnInventaire.setBounds(6, 47, 215, 29);
		panelFonctions.add(btnInventaire);
		btnInventaire.setText("INVENTAIRE");
		
		btnOption btnPret = new btnOption((String) null);
		btnPret.setBounds(6, 88, 215, 29);
		panelFonctions.add(btnPret);
		btnPret.setText("PRÊTS");
		
		btnOption btnAdmin = new btnOption((String) null);
		btnAdmin.setBounds(6, 129, 215, 29);
		panelFonctions.add(btnAdmin);
		btnAdmin.setText("ADMINISTRATION");
		
		btnOption btnQuitter= new btnOption((String) null);
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				instanceCtrlFenPrinc.ActionBtn(5);
				//JOptionPane.showMessageDialog(null, "En construction","Désolé",JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnQuitter.setBounds(6, 170, 215, 29);
		panelFonctions.add(btnQuitter);
		btnQuitter.setText("QUITTER");
		
		JLabel imgPagePrincipale = new JLabel("");
		imgPagePrincipale.setRequestFocusEnabled(false);
		imgPagePrincipale.setVerifyInputWhenFocusTarget(false);
		imgPagePrincipale.setAlignmentX(Component.CENTER_ALIGNMENT);
		imgPagePrincipale.setIcon(new ImageIcon(WinPrincipal.class.getResource("/elementsGraphiques/Images/autres/imageCle.png")));
		imgPagePrincipale.setBounds(36, 211, 149, 150);
		panelFonctions.add(imgPagePrincipale);
		
		JTextPane txtBienvenuDansLe = new JTextPane();
		txtBienvenuDansLe.setEditable(false);
		txtBienvenuDansLe.setAutoscrolls(false);
		txtBienvenuDansLe.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		txtBienvenuDansLe.setBorder(null);
		txtBienvenuDansLe.setBackground(Color.LIGHT_GRAY);
		
		txtBienvenuDansLe.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
		txtBienvenuDansLe.setText("Bienvenu dans le Système CLÉ\n\n\nCe système d'information simule la gestion de \nprêt d'équipement. Il permet de gérer les achats d'équipement, \nl'inventaire, les prêts ainsi que la gestion administrative du système.\n\nIl sert de démonstrateur dans le cadre du cours \n420-B7B-SW Développement de logiciel d'entreprise II.  \nÀ cet fin, seule la gestion des achats, au niveau de la consultation \net l'ajout d'un bon d'achat, a été développée.\n\n\t\t\t\t\t\t\t\t\t\t\t\tFrance Jean");
		txtBienvenuDansLe.setBounds(274, 81, 553, 299);
		panelPrincipal.add(txtBienvenuDansLe);
		
		
	}	
}
