package modeles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

public final class modArriver{

	private int clientNoArriver;
	private String nomArriver;
	private String adresseArriver;
	private String telephoneArriver;
	private String faxArriver;
	private int noChamArriver;
	private int noReserArriver;
	
	private int current = 0;
	
	private ArrayList<modArriver> lesArrivees = new ArrayList<modArriver>();
	
	public modArriver() {
		lireEnreg();
	}
	
	public void lireEnreg() {
		
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
	
	

}
