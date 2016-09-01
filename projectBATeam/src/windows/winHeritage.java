package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class winHeritage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelPrincipal;


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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.LIGHT_GRAY);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JButton btnNextButton = new JButton(">");
		btnNextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNextButton.setBounds(341, 28, 25, 22);
		panelPrincipal.add(btnNextButton);
		
		JButton btnLastButton = new JButton(">>");
		btnLastButton.setBounds(371, 28, 25, 22);
		panelPrincipal.add(btnLastButton);
		
		JButton btnPreviousButton = new JButton("<");
		btnPreviousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPreviousButton.setBounds(304, 28, 25, 22);
		panelPrincipal.add(btnPreviousButton);
		
		JButton btnFirstButton = new JButton("<<");
		btnFirstButton.setBounds(273, 28, 25, 22);
		panelPrincipal.add(btnFirstButton);
		
		JLabel imgPagePrincipale = new JLabel("");
		imgPagePrincipale.setBounds(10, 28, 100, 41);
		panelPrincipal.add(imgPagePrincipale);
		imgPagePrincipale.setRequestFocusEnabled(false);
		imgPagePrincipale.setVerifyInputWhenFocusTarget(false);
		imgPagePrincipale.setAlignmentX(Component.CENTER_ALIGNMENT);
		imgPagePrincipale.setIcon(new ImageIcon(winHeritage.class.getResource("/elementsGraphiques/Images/BATeam.jpg")));
		
		JMenuItem mntmFichierMenuItem = new JMenuItem("Fichier");
		mntmFichierMenuItem.setBounds(0, 0, 80, 15);
		panelPrincipal.add(mntmFichierMenuItem);
		
		
	}
}
