package modeles;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class modListeDepart extends AbstractTableModel{

	
	private static final long serialVersionUID = 1L;
	
	private int IdReser;
	private String NoCham;
	private int IdCli;
	private String Nom;
	private Date dateDepart;
	private int courant = 0;
	
	private ArrayList<modListeDepart> lesDeparts = new ArrayList<modListeDepart>();
	public final  String[] lesTitres = {"No.Cham", "No.Client", "Nom", "Date de depart"};

	public int getCourant() {
		return courant;
	}

	public void setCourant(int courant) {
		this.courant = courant;
	}
	
	public modListeDepart(int noReser){
		lireEnreg(noReser);
	}
	
	public modListeDepart(int IdReser, String NoCham, int IdCli, String Nom, Date dateDepart){
		this.IdReser = IdReser;
		this.NoCham = NoCham;
		this.IdCli = IdCli;
		this.Nom = Nom;
		this.dateDepart = dateDepart;
	}
	
	public void lireEnreg(int _noReser) {
		try {    
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement
					("SELECT v.IdReser, v.NoCham, v.IdCli, v.Nom, v.dateDepart FROM EQU03prg01.viewListeDepart v WHERE v.IdReser = " + _noReser );			
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
					this.setCourant(rs.getInt("IdReser"));
					lesDeparts.add(new modListeDepart(rs.getInt("IdReser"),
										rs.getString("NoCham"), 
										rs.getInt("IdCli"), 
										rs.getString("Nom"),
										rs.getDate("dateDepart")));
					
			} 		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Probleme rencontré dans modDe.java lors de listing",
					"ALERTE", JOptionPane.ERROR_MESSAGE);
		}
	}

	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return lesDeparts.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return lesTitres.length;
	}
	
	@Override
	public String getColumnName(int columnIndex)
	{
		// TODO Auto-generated method stub
		return lesTitres[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		modListeDepart undepart = (modListeDepart) lesDeparts.get(rowIndex);
		if(columnIndex == 0) return undepart.NoCham;
		if(columnIndex == 1) return undepart.IdCli;
		if(columnIndex == 2) return undepart.Nom;
		if(columnIndex == 3) return undepart.dateDepart;
		return null;
	}

}
