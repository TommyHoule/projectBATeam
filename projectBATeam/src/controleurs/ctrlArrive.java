package controleurs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JTable;
import windows.winArriver;
import windows.winChambre;
import windows.winPickList;
import modeles.Model;
import modeles.ProcsE03;

public class ctrlArrive {
	private int position = 0;
	public Model modArrive = null;
	public Model modDe = null;
	
	public ctrlArrive(winArriver instance){
		position = 0;
		modArrive = ProcsE03.SELECT_ARRIVE();
		
		AffecteValeurs(instance);
	}
	
	public void AffecteValeurs(winArriver instance){
		
		//SectionArriver	
		instance.getTxtClientNo().setText(modArrive.getValueAt(position, 2).toString());
		instance.getTxtClientNom().setText(modArrive.getValueAt(position, 3).toString());
		instance.getTxtNoCham().setText(modArrive.getValueAt(position, 4).toString());
		instance.getTxtTelephone().setText(modArrive.getValueAt(position, 5).toString());
		instance.getTxtFax().setText(modArrive.getValueAt(position, 6).toString());
		instance.getTxtAdresse().setText(modArrive.getValueAt(position, 7).toString());
		instance.getTxtNoReser().setText(modArrive.getValueAt(position, 8).toString());
		instance.getTxtReservLe().setText(modArrive.getValueAt(position, 9).toString());
		instance.getTxtDateDebut().setText(modArrive.getValueAt(position, 10).toString());
		instance.getTxtDateFin().setText(modArrive.getValueAt(position, 11).toString());
		instance.getTxtClientNoReserv().setText(modArrive.getValueAt(position, 12).toString());
		instance.getTxtNomReserv().setText(modArrive.getValueAt(position, 13).toString());
		
		//Section N
		//System.out.println(modArrive.getValueAt(ligne, 7));
		modDe = ProcsE03.SELECT_DE(modArrive.getValueAt(position, 0).toString());
		winArriver.setScrollPane(new JTable(modDe));
		
	}
	
	public void PkArriver(winArriver instance){
		position = winPickList.pickFromTable(ProcsE03.SELECT_PK_ARRIVE(),"listes des arrive");
		AffecteValeurs(instance);	
	}
	
	public void Premier(winArriver instance) {
		 position = 0;
	     AffecteValeurs(instance);		
	}
	public void BonPrecedent(winArriver instance) {
		if (position> 0)
			position--;
		else position = modArrive.getRowCount() - 1;

		AffecteValeurs(instance);	
	}
	public void Dernier(winArriver instance) {
		position = modArrive.getRowCount() - 1;
	     AffecteValeurs(instance);		
	}
	public void BonSuivant(winArriver instance) {
		if (position < modArrive.getRowCount() - 1)
			 position++;
		else position = 0;
		
		AffecteValeurs(instance);		
	}
}
