package controleurs;

import javax.swing.JOptionPane;

import windows.winPrincipale;


public class ctrlPrincipale {

	private winPrincipale fenetre;
	public ctrlPrincipale(winPrincipale fenetre) {
		
   this.fenetre = fenetre;
	}
	
	public  void ActionBtn(int bouton)
	{
		switch (bouton)
		   { case 1 : JOptionPane.showMessageDialog(null, "La gestion des chambres est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
	       	          break;
		     case 2 : JOptionPane.showMessageDialog(null, "La gestion des clients est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
		     		  break;
		     case 3 : JOptionPane.showMessageDialog(null, "La gestion des reservations est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
		     		  break;
		     case 4 : JOptionPane.showMessageDialog(null, "La gestion des arrivees est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE); 
		     		  break;
		     case 5 : JOptionPane.showMessageDialog(null, "La gestion des departs est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE); 
    		  		  break;
		     /*case 6 : ModConnexion.getInstance().deconnexion();
		     		  fenetre.dispose();
		     		  break; */
		     
		   }
		
	}
}
