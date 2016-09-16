package controleurs;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import modeles.modAyant;
import modeles.modChambre;
import windows.winChambre;
import windows.winPrincipale;


public class ctrlChambre {

	public modChambre modeleChambre = null;
	private int position = 0;
	public modAyant modeleAyant = null;
	public ctrlChambre(winChambre instance) {
		
		modeleChambre = new modChambre();	
		AffecteValeurs(instance,position);

	}
	private void AffecteValeurs(winChambre instance, int ligne) {
			
		 modeleChambre.setCourant((int) modeleChambre.getValueAt(ligne,0));
	    //Affichage des informations de la chambre
		
		
		instance.getTxtNoChambre().setText(modeleChambre.getValueAt(ligne, 0).toString()); 
		instance.getTxtEtage().setText(modeleChambre.getValueAt(ligne, 1).toString());   
		instance.getTxtPrix().setText(modeleChambre.getValueAt(ligne, 2).toString());
		instance.getTxtEtat().setText(modeleChambre.getValueAt(ligne, 3).toString());
		instance.getTxtMemo().setText(modeleChambre.getValueAt(ligne, 4).toString());
		instance.getTxtCodTypeCha().setText(modeleChambre.getValueAt(ligne, 5).toString());
		instance.getTxtDescType().setText(modeleChambre.getValueAt(ligne, 6).toString());
		instance.getTxtCodLoc().setText(modeleChambre.getValueAt(ligne, 7).toString());
		instance.getTxtDescLoc().setText(modeleChambre.getValueAt(ligne, 8).toString());

		
		//Affichage des produits du bon
		modeleAyant = new modAyant((int)modeleChambre.getCourant());
		System.out.println(modeleAyant);
		winChambre.setjScrollPane(new JTable(modeleAyant)); 
		
		//BonSuivant(instance);
	    
	}
	
	public void Premier(winChambre instance) {
		 position = 0;
	     AffecteValeurs(instance,position);		
	}
	public void BonPrecedent(winChambre instance) {
		if (position> 0)
			position--;
		else position= 0;
		modeleChambre.setCourant((int)modeleChambre.getValueAt(position, 0));
		AffecteValeurs(instance,position);	
	}
	public void Dernier(winChambre instance) {
		position = modeleChambre.getLesEnreg().size()-1;
	     AffecteValeurs(instance,position);		
	}
	public void BonSuivant(winChambre instance) {
		if (position< modeleChambre.getLesEnreg().size())
			 position++;
		else position = modeleChambre.getLesEnreg().size()-1;
		modeleChambre.setCourant((int)modeleChambre.getValueAt(position, 0));
		AffecteValeurs(instance,position);		
	}


}
