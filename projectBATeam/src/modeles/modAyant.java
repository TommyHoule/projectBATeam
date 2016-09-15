package modeles;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class modAyant extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codTypCha;
	private String descType;


	private int courant = 0;

	private ArrayList<modAyant> lesTypes = new ArrayList<modAyant>();
	public final  String[] lesTitres = {"codTypCha", "descType"};
	
	/*
	 * Constructeur 1
	 */
	public modAyant(int noCham) {
		
		lireEnreg(noCham);
		
		
	}
	/*
	 * Constructeur 2 - sert surtout pour peupler la liste des bons pour la consultation
	 */
	
	public modAyant(String codTypCha,String descType) {
		this.codTypCha = codTypCha;
		this.descType = descType;

		
	}
	
	/*
	 * Constructeur 3 - sert pour la sauvegarde du bon
	 */
	/*public modAyant(Date vdatBon,Date vdatReq,String vdesBon, String vnumAch,Double vtotBon) {
		this.setDatBon(vdatBon);
		this.setDatReq(vdatReq);
		this.setDesBon(vdesBon);
		this.setNumAch(vnumAch);
		this.setTotBon(vtotBon);
		
	}*/
	@Override
	public int getRowCount() {
		return lesTypes.size();
	}
	@Override
	public int getColumnCount() {	
		return lesTitres.length;
		}
	public String getColumnName(int columnIndex)
	{
		return lesTitres[columnIndex];
	}
	public Object getValueAt(int rowIndex, int columnIndex) {

		modAyant uneChambre = (modAyant)lesTypes.get(rowIndex);

		if(columnIndex == 0) return uneChambre.codTypCha;
		if(columnIndex == 1) return uneChambre.descType;


		else return uneChambre.codTypCha;
	}
	public ArrayList<modAyant> getLesEnreg() {
		return lesTypes;
	}
	public ArrayList<modAyant> getlesBons() {
		return lesTypes;
	}	
	/*
	 * Lecture et rÈcupÈration des enregistrements de la BD
	 */
	public void lireEnreg(int noCham) {
		try {    
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement("SELECT EQU03PRG01.Commodite.CODCOM, EQU03PRG01.Commodite.DescCo FROM EQU03PRG01.Commodite,EQU03PRG01.Chambre,EQU03PRG01.Ayant WHERE EQU03PRG01.Chambre.NoCham = EQU03PRG01.Ayant.NoCham AND EQU03PRG01.Ayant.CODCOM = EQU03PRG01.Commodite.CODCOM");
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
					String codTypCha = rs.getString("CODTYPCHA");
					String descType = rs.getString("DESCTYPE");

				lesTypes.add(new modAyant(codTypCha,descType)); 
				this.setCourant(noCham);
			} 		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Probleme rencontré dans modAyant.java lors de listing",
					"ALERTE", JOptionPane.ERROR_MESSAGE);
		}
	}
 int getCourant() {
		return courant;
	}

	public void setCourant(int courant) {
		this.courant = courant;
	}
}
