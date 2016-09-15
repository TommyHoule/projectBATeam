package controleurs;

import javax.swing.JTable;
import windows.WinArriver;
import modeles.ModArriver;
import modeles.ModDe;
import modeles.ModArriverReservation;

public class CtrlArrive {
	private int position = 0;
	
	public CtrlArrive(WinArriver winArriver){
		AffecteValeurs(winArriver, position);
	}
	
	public void AffecteValeurs(WinArriver winArriver, int ligne){
		/*SectionArriver*/
		winArriver.getTxtClientNo().setText(null);
		winArriver.getTxtClientNom().setText(null);
		winArriver.getTxtAdresse().setText(null);
		winArriver.getTxtFax().setText(null);
		winArriver.getTxtNoCham().setText(null);
		
		/*SectionReservation*/
		
		
	}
}
