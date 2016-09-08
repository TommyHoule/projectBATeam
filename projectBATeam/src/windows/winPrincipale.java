package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;

import controleurs.ctrlPrincipale;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class winPrincipale extends JFrame {

	private static final long serialVersionUID = 1L;
	public static winPrincipale instance;
	private JPanel panelPrincipale;
	
	private ctrlPrincipale instanceCtrlFenPrinc;


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winPrincipale frame = new winPrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public winPrincipale() {
		
		instanceCtrlFenPrinc = new ctrlPrincipale(this);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 500);
		panelPrincipale = new JPanel();
		panelPrincipale.setBackground(SystemColor.windowBorder);
		panelPrincipale.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipale);
		panelPrincipale.setLayout(null);
		
		JButton btnLesChambres = new JButton("Les Chambres");
		btnLesChambres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				instanceCtrlFenPrinc.ActionBtn(1);
			
			}
		});
		btnLesChambres.setBounds(109, 21, 200, 100);
		panelPrincipale.add(btnLesChambres);
		
		JButton btnLesClients = new JButton("Les Clients");
		btnLesClients.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				instanceCtrlFenPrinc.ActionBtn(2);
			
			}
		});
		btnLesClients.setBounds(109, 174, 200, 100);
		panelPrincipale.add(btnLesClients);
		
		JButton btnLesReservations = new JButton("Les Reservations");
		btnLesReservations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				instanceCtrlFenPrinc.ActionBtn(3);
			
			}
		});
		btnLesReservations.setBounds(109, 348, 200, 100);
		panelPrincipale.add(btnLesReservations);
		
		JButton btnLesArriveesdeparts = new JButton("Les Arrivees");
		btnLesArriveesdeparts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				instanceCtrlFenPrinc.ActionBtn(4);
			
			}
		});
		btnLesArriveesdeparts.setBounds(620, 21, 200, 100);
		panelPrincipale.add(btnLesArriveesdeparts);
		
		JButton btnLesDeparts = new JButton("Les Departs");
		btnLesDeparts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				instanceCtrlFenPrinc.ActionBtn(5);
			
			}
		});
		btnLesDeparts.setBounds(620, 174, 200, 100);
		panelPrincipale.add(btnLesDeparts);
		
		JButton btnQuittee = new JButton("Quitter");
		btnQuittee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				instanceCtrlFenPrinc.ActionBtn(6);
			
			}
		});
		btnQuittee.setBounds(620, 348, 200, 100);
		panelPrincipale.add(btnQuittee);
	}
}
