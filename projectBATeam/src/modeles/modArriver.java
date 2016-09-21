package modeles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;

public class modArriver extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	
	private int clientNoArriver;
	private String nomArriver;
	private String adresseArriver;
	private String telephoneArriver;
	private String faxArriver;
	private int noChamArriver;
	private int noReserArriver;
	
	private int current = 0;
	
	private ArrayList<modArriver> lesArrivees = new ArrayList<modArriver>();
	public final  String[] lesTitres = {" "};
	
	public modArriver(){
		lireEnreg();
	}
	
	public modArriver(int clientNoArriver, String nomArriver, String adresseArriver, String telephoneArriver, String faxArriver, int noChamArriver, int noReserArriver){
		this.clientNoArriver = clientNoArriver;
		this.nomArriver = nomArriver;
		this.adresseArriver = adresseArriver;
		this.telephoneArriver = telephoneArriver;
		this.faxArriver = faxArriver;
		this.noChamArriver = noChamArriver;
		this.noReserArriver = noReserArriver;
	}
	
	public void lireEnreg() {
		try {    
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement("Select IdReser, IdCli, Nom, NoCham, Telephone, Fax, Adresse from viewArriver"); //requete
			ResultSet rs = state.executeQuery();
			
			while (rs.next()) {
				
				lesArrivees.add(new modArriver(rs.getInt("IdCli"), 
											   rs.getString("Nom"), 
											   rs.getString("Adresse"), 
											   rs.getString("Telephone"), 
											   rs.getString("Fax"), 
											   rs.getInt("NoCham"), 
											   rs.getInt("IdReser")) ); 
			} 
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Probleme rencontré dans Arriver.java",
					"ALERTE", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		modArriver arriver = (modArriver)lesArrivees.get(rowIndex);
		if(columnIndex == 0) return arriver.clientNoArriver;
		if(columnIndex == 1) return arriver.nomArriver;
		if(columnIndex == 2) return arriver.adresseArriver;
		if(columnIndex == 3) return arriver.telephoneArriver;
		if(columnIndex == 4) return arriver.faxArriver;
		if(columnIndex == 5) return arriver.noChamArriver;
		if(columnIndex == 6) return arriver.noReserArriver;
		else return null;
	}
	
	@Override
	public int getRowCount() {
		return lesArrivees.size();
	}

	
	@Override
	public int getColumnCount() {	
		return lesTitres.length;
		}

}
