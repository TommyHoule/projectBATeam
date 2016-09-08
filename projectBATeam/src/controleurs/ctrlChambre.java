package controleurs;

import javax.swing.JOptionPane;

import windows.winArriver;
import windows.winChambre;
import windows.winPrincipale;


public class ctrlChambre {

	private winChambre fenetre;
	public ctrlChambre(winChambre fenetre) {
		
		   this.fenetre = fenetre;
			}
	public void ActionBtn(int bouton) 
	{
		// TODO Auto-generated method stub
		switch (bouton)
		   { case 1 :  JOptionPane.showMessageDialog(null, "La gestion des clients est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
  		  				break;
		     case 2 :  JOptionPane.showMessageDialog(null, "La gestion des clients est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
		     		    break;
		     case 3 :  JOptionPane.showMessageDialog(null, "La gestion des reservations est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
		     		    break;
		     case 4 :  JOptionPane.showMessageDialog(null, "La gestion des clients est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
    		  			break;
		     case 5 :  JOptionPane.showMessageDialog(null, "La gestion des departs est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE); 
 		  		  		break;
		     case 6 :  JOptionPane.showMessageDialog(null, "La gestion des departs est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE); 
		  				break;
		     case 7 :  JOptionPane.showMessageDialog(null, "La gestion des clients est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
 						break;
			 case 8 :  JOptionPane.showMessageDialog(null, "La gestion des clients est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
			 			break;
			 case 9 :  JOptionPane.showMessageDialog(null, "La gestion des reservations est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
			  		    break;
			 case 10 : JOptionPane.showMessageDialog(null, "La gestion des clients est en construction","En cours de développement...",JOptionPane.PLAIN_MESSAGE);
				  		break;
		     case 11 : winPrincipale fenPrincipale = new winPrincipale();
		     		   fenPrincipale.setVisible(true);
 			   		   fenetre.dispose();
		     
		   }
	}
}
