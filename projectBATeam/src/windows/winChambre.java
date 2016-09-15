package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private JTextField txtCodeLocalisation;
	private JTextField txtPrix;
	private JTextField txtDescriptionCodeType;
	private JTextField txtDescriptionCodeLocalisation;
	private JTextField txtMemo;
	
	private ctrlChambre leControllerChambre ;
	private winChambre instance;
	public JTable tableAyant;
	private static JScrollPane scrollPane;


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
				winChambre.this.dispose();			
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
				winChambre.this.dispose();			
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

	    lblCodeType = new JLabel("Code_Type :");
		lblCodeType.setBounds(255, 6, 130, 16);
		panelChambre.add(lblCodeType);
		
		lblCodelocalisation = new JLabel("Code_Localisation :");
		lblCodelocalisation.setBounds(255, 48, 130, 16);
		panelChambre.add(lblCodelocalisation);
		
		lblPrix = new JLabel("Prix :");
		lblPrix.setBounds(255, 103, 130, 16);
		panelChambre.add(lblPrix);
		
		lblDescriptionCodeType = new JLabel("Description :");
		lblDescriptionCodeType.setBounds(556, 6, 130, 16);
		panelChambre.add(lblDescriptionCodeType);
		
		lblDescriptionCodeLocalisation = new JLabel("Description :");
		lblDescriptionCodeLocalisation.setBounds(556, 48, 130, 16);
		panelChambre.add(lblDescriptionCodeLocalisation);
				
		panelChambre.add(getTxtNoChambre());
		panelChambre.add(getTxtEtage());
		panelChambre.add(getTxtPrix());
		panelChambre.add(getTxtEtat());
		panelChambre.add(getTxtMemo());
		panelChambre.add(getTxtCodTypeCha());
		panelChambre.add(getTxtDescType());
		panelChambre.add(getTxtCodLoc());
		panelChambre.add(getTxtDescLoc());
	
		//composante graphique de Ayant
		getContentPane().add(getScrollPane());
		
		JLabel lblInfoChambre = new JLabel("Information sur la Chambre :");
		lblInfoChambre.setBounds(204, 74, 196, 16);
		getContentPane().add(lblInfoChambre);
		
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

/*	private Component getScrollPane() {
		// TODO Auto-generated method stub
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 370, 890, 205);
		return scrollPane;
	}
	*/
	public JTable gettProduit()
	{	
		return tableAyant;
	}

	
	private JScrollPane getScrollPane() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 370, 890, 205);
		return scrollPane;		
	}
	
	public static void setjScrollPane(JTable UneTable)
	{
		if (scrollPane == null) 
		   {
			scrollPane = new JScrollPane(UneTable);
			scrollPane.setBounds(20, 7,515, 175);
		   }
		scrollPane.setViewportView(UneTable);
	}
	public JTextField getTxtNoChambre() {
		// TODO Auto-generated method stub
		if(txtNoChambre == null)
		{
			txtNoChambre = new JTextField();
			txtNoChambre.setEditable(false);
			txtNoChambre.setBounds(100, 1, 130, 26);
			txtNoChambre.setColumns(10);
		}
		return this.txtNoChambre;
	}

	public JTextField getTxtEtage() {
		// TODO Auto-generated method stub
		if(txtEtage == null)
		{
			txtEtage = new JTextField();
			txtEtage.setEditable(false);
			txtEtage.setColumns(10);
			txtEtage.setBounds(100, 43, 130, 26);
		}
		return txtEtage;
	}

	public JTextField getTxtPrix() {
		// TODO Auto-generated method stub
		if(txtPrix == null)
		{
			txtPrix = new JTextField("$",10);
			txtPrix.setEditable(false);
			txtPrix.setColumns(10);
			txtPrix.setBounds(389, 98, 130, 26);
		}
		
		return txtPrix;
	}

	public JTextField getTxtMemo() {
		// TODO Auto-generated method stub
		if(txtMemo == null)
		{
			txtMemo = new JTextField();
			txtMemo.setText("Description spéciale de la chambre");
			txtMemo.setEditable(false);
			txtMemo.setBounds(556, 103, 230, 81);
			txtMemo.setColumns(10);
		}
		
		return txtMemo;
	}

	public JTextField getTxtEtat() {
		// TODO Auto-generated method stub
		if(txtEtat == null)
		{
			txtEtat = new JTextField();
			txtEtat.setEditable(false);
			txtEtat.setColumns(10);
			txtEtat.setBounds(100, 98, 130, 26);
		}
		
		return txtEtat;
	}

	public JTextField getTxtCodTypeCha() {
		// TODO Auto-generated method stub
		if(txtCodeType == null)
		{
			txtCodeType = new JTextField();
			txtCodeType.setEditable(false);
			txtCodeType.setBounds(389, 1, 130, 26);
			txtCodeType.setColumns(10);
		}
		
		return txtCodeType;
	}

	public JTextField getTxtDescType() {
		// TODO Auto-generated method stub
		if(txtDescriptionCodeType == null)
		{
			txtDescriptionCodeType = new JTextField();
			txtDescriptionCodeType.setEditable(false);
			txtDescriptionCodeType.setColumns(10);
			txtDescriptionCodeType.setBounds(656, 1, 130, 26);
		}
		
		return txtDescriptionCodeType;
	}

	public JTextField getTxtCodLoc() {
		// TODO Auto-generated method stub
		if(txtCodeLocalisation == null)
		{
			txtCodeLocalisation = new JTextField();
			txtCodeLocalisation.setEditable(false);
			txtCodeLocalisation.setColumns(10);
			txtCodeLocalisation.setBounds(389, 43, 130, 26);
		}
		
		return txtCodeLocalisation;
	}

	public JTextField getTxtDescLoc() {
		// TODO Auto-generated method stub
		if(txtDescriptionCodeLocalisation == null)
		{
			txtDescriptionCodeLocalisation = new JTextField();
			txtDescriptionCodeLocalisation.setEditable(false);
			txtDescriptionCodeLocalisation.setColumns(10);
			txtDescriptionCodeLocalisation.setBounds(656, 43, 130, 26);
		}
		
		return txtDescriptionCodeLocalisation;
	}
}

