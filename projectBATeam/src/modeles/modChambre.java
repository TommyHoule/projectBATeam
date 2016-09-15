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
	private int prix;
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
	
	public modChambre(int noCham,int etage,int prix,int etat,String memo,String codTypCha,String descType,String codLoc,String descLoc) {
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
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement("SELECT EQU03PRG01.Chambre.NoCham," +
					"EQU03PRG01.CHAMBRE.ETAGE,EQU03PRG01.CHAMBRE.PRIX, " +
					"EQU03PRG01.Chambre.Etat,EQU03PRG01.Chambre.Memo,EQU03PRG01.TypeCham.CodTypCha,"+
					"EQU03PRG01.TypeCham.DescType, EQU03PRG01.Localisation.CodLoc, EQU03PRG01.Localisation.DescLoc " +
					"FROM   EQU03PRG01.CHAMBRE,EQU03PRG01.TYPECHAM,EQU03PRG01.LOCALISATION  " +
					"WHERE  EQU03PRG01.Chambre.CodTypCha = EQU03PRG01.TypeCham.CodTypCha"+
					"AND    EQU03PRG01.Chambre.CodLoc = EQU03PRG01.Localisation.CodLoc" +
					"order by  EQU03PRG01.Chambre.nocham");
			ResultSet rs = state.executeQuery();
			
			while (rs.next()) {
				
				
				    noCham = rs.getInt("EQU03PRG01.Chambre.NoCham");
					etage = rs.getInt("EQU03PRG01.Chambre.Etage");
					prix  = rs.getInt("EQU03PRG01.Chambre.Prix");
					etat  = rs.getInt("EQU03PRG01.Chambre.Etat");
					memo = rs.getString("EQU03PRG01.Chambre.Memo"); 
					codTypCha = rs.getString("EQU03PRG01.TypeCham.CodTypCha");
					descType = rs.getString("EQU03PRG01.TypeCham.DescType");
					codLoc = rs.getString("EQU03PRG01.Localisation.CodLoc");
					descLoc = rs.getString("EQU03PRG01.Localisation.DescLoc");
					
				lesChambre.add(new modChambre(noCham,etage,prix,etat,memo,codTypCha,descType,codLoc,descLoc)); 
				this.setCourant(noCham);
			} 
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Probleme rencontré dans modChambre.java",
					"ALERTE", JOptionPane.ERROR_MESSAGE);
		}
	}
/*		
	public String getNomAch() {
		return nomAch;
	}
	public void setNomAch(String nomAch) {
		this.nomAch = nomAch;
	}
	public String getDeptAch() {
		return deptAch;
	}
	public void setDeptAch(String deptAch) {
		this.deptAch = deptAch;
	}
	public String getPostAch() {
		return postAch;
	}
	public void setPostAch(String postAch) {
		this.postAch = postAch;
	}
	public Double getTotBon() {
		return totBon;
	}
	public void setTotBon(Double totBon) {
		this.totBon = totBon;
	}
*/
	public int getCourant() {
		return courant;
	}

	public void setCourant(int courant) {
		this.courant = courant;
	}



}
