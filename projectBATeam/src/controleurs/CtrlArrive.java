package controleurs;

import javax.swing.JTable;
import windows.winArriver;
import modeles.modArriver;
import modeles.modDe;
import modeles.modArriverReservation;

public class ctrlArrive {
	private int position = 0;
	
	public ctrlArrive(winArriver winArriver){
		AffecteValeurs(winArriver, position);
	}
	
	public void AffecteValeurs(winArriver winArriver, int ligne){
		/*SectionArriver*/
		winArriver.getTxtClientNo().setText(null);
		winArriver.getTxtClientNom().setText(null);
		winArriver.getTxtAdresse().setText(null);
		winArriver.getTxtFax().setText(null);
		winArriver.getTxtNoCham().setText(null);
		
		/*SectionReservation*/
		
		
	}
}
