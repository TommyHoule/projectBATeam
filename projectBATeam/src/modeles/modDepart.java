package modeles;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class modDepart extends AbstractTableModel{

	private int current = 0;
	private int 
	
	private ArrayList<modDepart> lesDeparts = new ArrayList<modDepart>();
	public final  String[] lesTitres = {"NoArrive", "Nom"};
	
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	
	public modDepart(){
		lireEnreg();
	}
	
	public void lireEnreg() {
		try {    
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement("SELECT v.IdCli, v.Nom, v.Adresse, v.Telephone, v.TypeCarte, v.IdReser, v.dateReser, v.dateDebut, v.dateFin, v.ConfirmePar FROM EQU03prg01.viewDepart v");
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
				
				lesDeparts.add(new modDepart(rs.getInt("IdCli"), );
				this.setCurrent(rs.getInt("NoArrive"));
			} 
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),
					"ALERTE", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		/*modArriver arriver = (modArriver)lesArrivees.get(rowIndex);
		if(columnIndex == 0) return arriver.clientNoArriver;
		if(columnIndex == 1) return arriver.nomArriver;
		if(columnIndex == 2) return arriver.adresseArriver;
		if(columnIndex == 3) return arriver.telephoneArriver;
		if(columnIndex == 4) return arriver.faxArriver;
		if(columnIndex == 5) return arriver.noChamArriver;
		if(columnIndex == 6) return arriver.noReserArriver;
		if(columnIndex == 7) return arriver.IdReser;
		if(columnIndex == 8) return arriver.dateReserver;
		if(columnIndex == 9) return arriver.dateDebut;
		if(columnIndex == 10) return arriver.dateFin;
		if(columnIndex == 11) return arriver.IdCliReser;
		if(columnIndex == 12) return arriver.NomReser;
		else return arriver.noArr;*/
		return null;
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
