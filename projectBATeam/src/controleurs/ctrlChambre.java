package controleurs;

import javax.swing.JTable;

import modeles.modAyant;
import modeles.modChambre;
import modeles.modListCodeLocalisation;
import modeles.modListCodeType;
import windows.winChambre;
import windows.winPickList;


public class ctrlChambre {

	public modChambre modeleChambre = null;
	public modListCodeType modeleCodeType = null;
	public modListCodeLocalisation modeleCodeLocalisation = null;
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

		
		//Affichage des commodité de la chambre
		modeleAyant = new modAyant((int)modeleChambre.getCourant());
		winChambre.setjScrollPane(new JTable(modeleAyant)); 
		
	    
	}
	private void AffecteValeursType(winChambre instance, int ligne) {
		//modeleCodeType.setCourant((int) modeleCodeType.getValueAt(ligne,0));
		modeleCodeType = new modListCodeType();
		instance.getTxtCodTypeCha().setText(modeleCodeType.getValueAt(ligne, 0).toString());
		instance.getTxtDescType().setText(modeleCodeType.getValueAt(ligne, 1).toString());

	}
	private void AffecteValeursLocalisation(winChambre instance, int ligne) {
		//modeleCodeLocalisation.setCourant((int) modeleCodeLocalisation.getValueAt(ligne,0));
		modeleCodeLocalisation = new modListCodeLocalisation();
		instance.getTxtCodLoc().setText(modeleCodeLocalisation.getValueAt(ligne, 0).toString());
		instance.getTxtDescLoc().setText(modeleCodeLocalisation.getValueAt(ligne, 1).toString());
	}
	
	public void Premier(winChambre instance) {
		 position = 0;
	     AffecteValeurs(instance,position);		
	}
	public void BonPrecedent(winChambre instance) {
		if (position> 0)
			position--;
		else position= modeleChambre.getLesEnreg().size()-1;
		modeleChambre.setCourant((int)modeleChambre.getValueAt(position, 0));
		AffecteValeurs(instance,position);	
	}
	public void Dernier(winChambre instance) {
		position = modeleChambre.getLesEnreg().size()-1;
	     AffecteValeurs(instance,position);		
	}
	public void BonSuivant(winChambre instance) {
		if (position< modeleChambre.getLesEnreg().size()-1)
			 position++;
		else position = 0;
		modeleChambre.setCourant((int)modeleChambre.getValueAt(position, 0));
		AffecteValeurs(instance,position);		
	}
	public void ListeChambres (winChambre instance, Boolean AjoutActive){   
	    position = winPickList.pickFromTable(new modChambre(),"listes des chambres");
		AffecteValeurs(instance, position);	
	}
	public void ListeCodType (winChambre instance, Boolean AjoutActive){
		position = winPickList.pickFromTable(new modListCodeType(),"listes des type de chambre");
		AffecteValeursType(instance, position);	
	}
	public void ListeCodLocalisation (winChambre instance, Boolean AjoutActive){
		position = winPickList.pickFromTable(new modListCodeLocalisation(),"listes des code de Localisation");
		AffecteValeursLocalisation(instance, position);	
	}
	public boolean getChckbxEnEtatSelected(winChambre instance) {
		return instance.chckbxEnEtat.isSelected();
	}
	public void setChckbxEnEtatSelected(boolean selected, winChambre instance) {
		instance.chckbxEnEtat.setSelected(selected);
		if(getChckbxEnEtatSelected(instance) == true)
		{
			instance.chckbxHorsDusage.setSelected(false);
		}
		instance.getTxtEtat().setText("1");
	}
	public boolean getChckbxHorsDusageSelected(winChambre instance) {
		return instance.chckbxHorsDusage.isSelected();
	}
	public void setChckbxHorsDusageSelected(boolean selected, winChambre instance) {
		instance.chckbxHorsDusage.setSelected(selected);
		if(getChckbxHorsDusageSelected(instance) == true)
		{
			instance.chckbxEnEtat.setSelected(false);
		}
		instance.getTxtEtat().setText("0");
		
	}
	public void validationChambre(winChambre instance)
	{
		System.out.println(instance.getTxtNoChambre().getText());
	}


}
