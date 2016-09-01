package controleurs;

import javax.swing.JOptionPane;

import modeles.ModConnexion;
import windows.WinPrincipal;



public class CtrlWinPrincipal {

	private WinPrincipal fenetre;
	public CtrlWinPrincipal(WinPrincipal fenetre) {
		
   this.fenetre = fenetre;
	}
	
	public  void ActionBtn(int bouton)
	{
		switch (bouton)
		   { case 1 : JOptionPane.showMessageDialog(null, "La gestion des achats est en construction","Désolé",JOptionPane.PLAIN_MESSAGE);
			   		   break;
		     case 2 : JOptionPane.showMessageDialog(null, "La gestion de l'inventaire est en construction","Désolé",JOptionPane.PLAIN_MESSAGE);
		     		  break;
		     case 3 : JOptionPane.showMessageDialog(null, "La gestion des prêts est en construction","Désolé",JOptionPane.PLAIN_MESSAGE);
		     		  break;
		     case 4 : JOptionPane.showMessageDialog(null, "La gestion administrative est en construction","Désolé",JOptionPane.PLAIN_MESSAGE); 
		     		  break;
		     case 5 : JOptionPane.showMessageDialog(null, "L'option Quitter est en construction","Désolé",JOptionPane.PLAIN_MESSAGE);
		             ModConnexion.getInstance().deconnexion();
		     		 fenetre.dispose();
		     		  break; 
		     
		   }
		
	}

}
