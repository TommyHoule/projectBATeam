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
	public ctrlChambre(winChambre WinChambre) {
		
		modeleChambre = new modChambre();	
		
		AffecteValeurs(WinChambre,position);

	}
	private void AffecteValeurs(winChambre WinChambre, int ligne) {
			
		modeleChambre.setCourant((int) modeleChambre.getValueAt(ligne,0));
	    //Affichage des informations de la chambre
		
		
		WinChambre.getTxtNoChambre().setText(modeleChambre.getValueAt(ligne, 0).toString()); 
		WinChambre.getTxtEtage().setText(modeleChambre.getValueAt(ligne, 1).toString());   
		WinChambre.getTxtPrix().setText(modeleChambre.getValueAt(ligne, 2).toString());
		WinChambre.getTxtEtat().setText(modeleChambre.getValueAt(ligne, 3).toString());
		WinChambre.getTxtMemo().setText(modeleChambre.getValueAt(ligne, 4).toString());
		WinChambre.getTxtCodTypeCha().setText(modeleChambre.getValueAt(ligne, 5).toString());
		WinChambre.getTxtDescType().setText(modeleChambre.getValueAt(ligne, 6).toString());
		WinChambre.getTxtCodLoc().setText(modeleChambre.getValueAt(ligne, 7).toString());
		WinChambre.getTxtDescLoc().setText(modeleChambre.getValueAt(ligne, 8).toString());

		
		//Affichage des produits du bon
		modeleAyant = new modAyant((int)modeleChambre.getCourant());
		winChambre.setjScrollPane(new JTable(modeleAyant)); 
	    
		//Affichage des totaux
		winChambre.getTxtSousTotBon().setText((modeleAyant.ConvertirEnChaine(modeleAyant.getSousTotalBon()) + " $"));
		winChambre.getTxtTPS().setText(modeleAyant.ConvertirEnChaine(modeleAyant.getTPS()) + " $");
		winChambre.getTxtTVQ().setText(modeleAyant.ConvertirEnChaine(modeleAyant.getTVQ()) + " $");
		winChambre.getTxtTotal().setText(modeleAyant.ConvertirEnChaine(modeleAyant.getTotalBon()) + " $");
		
	}
	
	public void Premier(winChambre instance) {
		/* position = 0;
	     AffecteValeurs(instance,position);	*/	
	}
	public void BonPrecedent(winChambre instance) {
		/*if (position> 0)
			position--;
		else position= 0;
		modeleChambre.setCourant((int)modeleChambre.getValueAt(position, 0));
		AffecteValeurs(instance,position);	*/	
	}
	public void Dernier(winChambre instance) {
		/*position = modeleChambre.getLesEnreg().size()-1;
	     AffecteValeurs(instance,position);*/		
	}
	public void BonSuivant(winChambre instance) {
		/*if (position< modeleChambre.getLesEnreg().size())
			 position++;
		else position = 0;
		modeleChambre.setCourant((int)modeleChambre.getValueAt(position, 0));
		AffecteValeurs(instance,position);*/		
	}
	/*public void ListeBons (winChambre winChambre)
	{   WinListBons pkListBon = new WinListBons();
	    pkListBon.setVisible(true);
		AffecteValeurs(winBon,pkListBon.getNoLigneSel());	
	}*/

}
