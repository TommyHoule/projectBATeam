package controleurs;

import javax.swing.JTable;

import modeles.modDepart;
import modeles.modListeDepart;
import windows.winDepart;
import windows.winPickList;

public class ctrlDepart {
	private int position = 0;
	public modDepart modDepart_ = null;
	public modListeDepart modListeDepart_ = null;
	
	public ctrlDepart(winDepart instance){
		
		modDepart_ = new modDepart();
		
		AffecteValeurs(instance, position);
	}
	
	public void AffecteValeurs(winDepart instance, int ligne){
		modDepart_.setCurrent((int) modDepart_.getValueAt(ligne, 0));
		instance.getTextFieldClientNo().setText(modDepart_.getValueAt(ligne, 1).toString());
		instance.getTextFieldClientNom().setText(modDepart_.getValueAt(ligne, 2).toString());
		instance.getTextFieldAdresse().setText(modDepart_.getValueAt(ligne, 3).toString());
		instance.getTextFieldTelephone().setText(modDepart_.getValueAt(ligne, 4).toString());
		instance.getTextFieldFax().setText(modDepart_.getValueAt(ligne,5).toString());
		instance.getTextFieldTypeCarte().setText(modDepart_.getValueAt(ligne, 6).toString());
		instance.getTextFieldNoReser().setText(modDepart_.getValueAt(ligne, 7).toString());
		instance.getTextFieldReservLe().setText(modDepart_.getValueAt(ligne, 8).toString());
		instance.getTextFieldDateDebut().setText(modDepart_.getValueAt(ligne, 9).toString());
		instance.getTextFieldDateFin().setText(modDepart_.getValueAt(ligne, 10).toString());
		instance.getTextFieldConfirmPar().setText(modDepart_.getValueAt(ligne, 11).toString());
		
		
		modListeDepart_ = new modListeDepart((int)modDepart_.getValueAt(ligne, 7));
		winDepart.setScrollPane(new JTable(modListeDepart_));
		
		
	}
	
	
	public void Premier(winDepart instance) {
		 position = 0;
	     AffecteValeurs(instance,position);		
	}
	public void BonPrecedent(winDepart instance) {
		if (position> 0)
			position--;
		else position = modDepart_.getLesEnreg().size()-1;
		modDepart_.setCurrent((int)modDepart_.getValueAt(position, 13));
		AffecteValeurs(instance,position);	
	}
	public void Dernier(winDepart instance) {
		position = modDepart_.getLesEnreg().size()-1;
	     AffecteValeurs(instance,position);		
	}
	public void BonSuivant(winDepart instance) {
		if (position< modDepart_.getLesEnreg().size()-1)
			 position++;
		else position = 0;
		modDepart_.setCurrent((int)modDepart_.getValueAt(position, 13));
		AffecteValeurs(instance,position);		
	}
}
