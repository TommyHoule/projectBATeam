package controleurs;

import javax.swing.JTable;
import windows.winArriver;
import modeles.modArriver;
import modeles.modDe;
import modeles.modArriverReservation;

public class ctrlArrive {
	private int position = 0;
	
	public ctrlArrive(winArriver winArrive){
		AffecteValeurs(winArrive, position);
	}
	
	public void AffecteValeurs(winArriver winArrive, int ligne){
		/*SectionArriver*/
		winArrive.getTxtClientNo().setText(null);
		winArrive.getTxtClientNom().setText(null);
		winArrive.getTxtAdresse().setText(null);
		winArrive.getTxtFax().setText(null);
		winArrive.getTxtNoCham().setText(null);
		
		/*SectionReservation*/
		winArrive.getTxtNoReser().setText(null);
		winArrive.getTxtDateDebut().setText(null);
		winArrive.getTxtReservLe().setText(null);
		winArrive.getTxtDateDebut().setText(null);
		winArrive.getTxtDateFin().setText(null);
		winArrive.getTxtClientNoReserv().setText(null);
		winArrive.getTxtNomReserv().setText(null);
		
		/*Section N*/
		
		
	}
}
