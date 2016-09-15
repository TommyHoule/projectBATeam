package modeles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;


public class modChambre extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int noCham;
	private int etage;
	private float prix;
	private int etat;
	private String codTypCha;
	private String descType;
	private String codLoc;
	private String descLoc;
	private String memo;

	private int courant = 0;

	private ArrayList<modChambre> lesChambre = new ArrayList<modChambre>();
	public final  String[] lesTitres = {"noCham", "etage","prix","etat","memo","codTypCha","descType","codLoc","descLoc"};
	
	/*
	 * Constructeur 1
	 */
	public modChambre() {
		
		lireEnreg();
		
		
	}
	/*
	 * Constructeur 2 - sert surtout pour peupler la liste des bons pour la consultation
	 */
	
	public modChambre(int noCham,int etage,float prix,int etat,String memo,String codTypCha,String descType,String codLoc,String descLoc) {
		this.noCham = noCham;
		this.etage = etage;
		this.prix = prix;
		this.etat = etat;
		this.memo = memo;
		this.codTypCha = codTypCha;
		this.descType = descType;
		this.codLoc = codLoc;
		this.descLoc = descLoc;

		
	}
	
	/*
	 * Constructeur 3 - sert pour la sauvegarde du bon
	 */
	/*public modChambre(Date vdatBon,Date vdatReq,String vdesBon, String vnumAch,Double vtotBon) {
		this.setDatBon(vdatBon);
		this.setDatReq(vdatReq);
		this.setDesBon(vdesBon);
		this.setNumAch(vnumAch);
		this.setTotBon(vtotBon);
		
	}*/
	@Override
	public int getRowCount() {
		return lesChambre.size();
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

		modChambre uneChambre = (modChambre)lesChambre.get(rowIndex);
		if(columnIndex == 0) return uneChambre.noCham;
		if(columnIndex == 1) return uneChambre.etage;
		if(columnIndex == 2) return uneChambre.prix;
		if(columnIndex == 3) return uneChambre.etat;
		if(columnIndex == 4) return uneChambre.memo;
		if(columnIndex == 5) return uneChambre.codTypCha;
		if(columnIndex == 6) return uneChambre.descType;
		if(columnIndex == 7) return uneChambre.codLoc;
		if(columnIndex == 8) return uneChambre.descLoc;

		else return uneChambre.noCham;
	}
	public ArrayList<modChambre> getLesEnreg() {
		return lesChambre;
	}
	public ArrayList<modChambre> getlesBons() {
		return lesChambre;
	}	
	/*
	 * Lecture et rÈcupÈration des enregistrements de la BD
	 */
	public void lireEnreg() {
		try {    
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement("SELECT EQU03PRG01.CHAMBRE.NOCHAM,EQU03PRG01.CHAMBRE.ETAGE,EQU03PRG01.CHAMBRE.PRIX,EQU03PRG01.CHAMBRE.ETAT,EQU03PRG01.CHAMBRE.MEMO,EQU03PRG01.TYPECHAM.CODTYPCHA,EQU03PRG01.TYPECHAM.DESCTYPE,EQU03PRG01.LOCALISATION.CODLOC,EQU03PRG01.LOCALISATION.DESCLOC FROM EQU03PRG01.CHAMBRE,EQU03PRG01.TYPECHAM,EQU03PRG01.LOCALISATION WHERE EQU03PRG01.CHAMBRE.CODTYPCHA = EQU03PRG01.TYPECHAM.CODTYPCHA AND EQU03PRG01.CHAMBRE.CODLOC = EQU03PRG01.LOCALISATION.CODLOC order by EQU03PRG01.CHAMBRE.NOCHAM");
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
				    int noCham = rs.getInt("NOCHAM");
					int etage = rs.getInt("ETAGE");
					float prix  = rs.getFloat("PRIX");
					int etat  = rs.getInt("ETAT");
					String memo = rs.getString("MEMO"); 
					String codTypCha = rs.getString("CODTYPCHA");
					String descType = rs.getString("DESCTYPE");
					String codLoc = rs.getString("CODLOC");
					String descLoc = rs.getString("DESCLOC");
					
				lesChambre.add(new modChambre(noCham,etage,prix,etat,memo,codTypCha,descType,codLoc,descLoc)); 
				this.setCourant(noCham);
			} 		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Probleme rencontré dans modChambre.java lors de listing",
					"ALERTE", JOptionPane.ERROR_MESSAGE);
		}
	}
 public int getCourant() {
		return courant;
	}

	public void setCourant(int courant) {
		this.courant = courant;
	}
}