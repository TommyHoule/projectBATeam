package controleurs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

//import windows.WinBon;
//import windows.WinListBons;
import modeles.modConnexion;
import windows.winPrincipale;


public class ctrlConnexion {
	static ResultSet jeuEnreg = null;
	
	public static void connexion(JDialog fenetre,String nomUsager, String mdp) 
	 {  
		
	    try {
	       
	  	    modConnexion.getInstance().connexion(nomUsager,mdp);   	
	       	
	       	//testConnexion();
	       	
	       	fenetre.dispose();
	        
	      winPrincipale fendebut = new winPrincipale();
	    //	WinListBons fendebut = new WinListBons();
	    // 	WinBon fendebut = new WinBon();
	     	fendebut.setVisible(true);
	      
	          	} 
	    catch (Exception e) 
	    	{
	    		e.printStackTrace();
	     	JOptionPane.showMessageDialog(null, "Information inexistante", "Désolé", JOptionPane.WARNING_MESSAGE);
	    	}
	    
	  }
	

} 


