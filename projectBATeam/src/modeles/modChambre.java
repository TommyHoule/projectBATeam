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
	private String codLoc;
	private String memo;

	private int courant = 0;

	private ArrayList<modChambre> lesChambre = new ArrayList<modChambre>();
	public final  String[] lesTitres = {"No Cham", "Etage","Prix","Etat","CodTypCha","CodLoc","Memo"};
	
	/*
	 * Constructeur 1
	 */
	public modChambre() {
		
		lireEnreg();
		
		
	}
	/*
	 * Constructeur 2 - sert surtout pour peupler la liste des bons pour la consultation
	 */
	
	public modChambre(int vnumBon, Date vdatBon,Date vdatReq,String vdesBon, String vnumAch,String vnomAch, String vdeptAch, String vposteAch) {
		this.setNumBon(vnumBon);
		this.setDatBon(vdatBon);
		this.setDatReq(vdatReq);
		this.setDesBon(vdesBon);
		this.setNumAch(vnumAch);
		this.setNomAch(vnomAch);
		this.setDeptAch(vdeptAch);
		this.setPostAch(vposteAch);
		
	}
	
	/*
	 * Constructeur 3 - sert pour la sauvegarde du bon
	 */
	public modChambre(Date vdatBon,Date vdatReq,String vdesBon, String vnumAch,Double vtotBon) {
		this.setDatBon(vdatBon);
		this.setDatReq(vdatReq);
		this.setDesBon(vdesBon);
		this.setNumAch(vnumAch);
		this.setTotBon(vtotBon);
		
	}
	

	
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
		modChambre unBon = (modChambre)lesChambre.get(rowIndex);
		if(columnIndex == 0) return unBon.getNumBon();
		if(columnIndex == 1) return unBon.getDatBon();
		if(columnIndex == 2) return unBon.getDatReq();
		if(columnIndex == 3) return unBon.getDesBon();
		if(columnIndex == 4) return unBon.getNumAch();
		if(columnIndex == 5) return unBon.getNomAch();
		if(columnIndex == 6) return unBon.getDeptAch();
		else return unBon.getPostAch();
	}

	public ArrayList<modChambre> getLesEnreg() {
		return lesChambre;
	}
	
	
	//Accesseurs
	public Date getDatReq() {
		return datReq;
	}

	public void setDatReq(Date datReq) {
		this.datReq = datReq;
	}

	public int getNumBon() {
		return numBon;
	}

	public void setNumBon(int numBon) {
		this.numBon = numBon;
	}

	public Date getDatBon() {
		return datBon;
	}

	public void setDatBon(Date datBon) {
		this.datBon = datBon;
	}

	public String getDesBon() {
		return desBon;
	}

	public void setDesBon(String desBon) {
		this.desBon = desBon;
	}

	public String getNumAch() {
		return numAch;
	}

	public void setNumAch(String numAch) {
		this.numAch = numAch;
	}

	public ArrayList<modChambre> getlesBons() {
		return lesChambre;
	}
	
	/*
	 * Lecture et rÈcupÈration des enregistrements de la BD
	 */
	public void lireEnreg() {
		try {    
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement("SELECT Chambre.NoCham," +
					"Chambre.Etage,Chambre.Prix, " +
					"Chambre.Etat,Chambre.Memo,TypeCham.CodTypCha, TypeCham.DescType, Localisation.CodLoc, Localisation.DescLoc " +
					"FROM   chambre,typecham,Localisation  " +
					"WHERE  Chambre.CodTypCha = TypeCham.CodTypCha"+
					"AND    Chambre.CodLoc = Localisation.CodLoc" +
					"order by  Chambre.nocham");
			ResultSet rs = state.executeQuery();
			
			while (rs.next()) {
				
				/*
				 *  noCham = rs.getInt("num_Bon");
					etage = rs.getInt("num_Bon");
					prix  = rs.getInt("num_Bon");
					etat  = rs.getInt("num_Bon");
					codTypCha = rs.getString("des_bon");
					codLoc = rs.getString("des_bon");
					memo = rs.getString("des_bon"); 
				 */
				noCham= rs.getInt("num_Bon");
				Date dat_Bon = rs.getDate("dat_Bon");
				Date dat_Req = rs.getDate("dat_Req");
				String des_bon = rs.getString("des_bon");
				String num_ach = rs.getString("num_ach");
				String nom_ach = rs.getString("nom_ach");
				String dept_ach = rs.getString("Dept_ach");
				String poste_ach = rs.getString("Poste_ach");
				
				lesChambre.add(new modChambre(num_Bon, dat_Bon,dat_Req,des_bon,num_ach,nom_ach,dept_ach,poste_ach)); 
				this.setCourant(num_Bon);
			} 
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Probleme rencontré dans BonAchat.java",
					"ALERTE", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
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

	public int getCourant() {
		return courant;
	}

	public void setCourant(int courant) {
		this.courant = courant;
	}



}
