package modeles;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class modDepart extends AbstractTableModel{

	private int current = 0;
	private static final long serialVersionUID = 1L;
	
	private int IdCli;
	private String Nom;
	private String Adresse;
	private String Telephone;
	private String Fax;
	private String TypeCarte;
	private int IdReser;
	private Date dateReser;
	private Date dateDebut;
	private Date dateFin;
	private String ConfirmePar;
	private int NoDepart;
	
	private ArrayList<modDepart> lesDeparts = new ArrayList<modDepart>();
	public final  String[] lesTitres = {"a", "b"};
	
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	
	public modDepart(){
		lireEnreg();
	}
	
	/**
	 * @param NoDepart NoDepart
	 * @param IdCli IdCli
	 * @param Nom Nom
	 * @param Adresse Adresse
	 * @param Telephone Telephone
	 * @param Fax Fax
	 * @param TypeCarte TypeCarte
	 * @param IdReser IdReser
	 * @param dateReser dateReser
	 * @param dateDebut dateDebut
	 * @param dateFin dateFin
	 * @param ConfirmePar ConfirmePar
	 */
	public modDepart(int NoDepart,int IdCli, String Nom, String Adresse, String Telephone, String Fax,String TypeCarte, int IdReser, Date dateReser, Date dateDebut, Date dateFin, String ConfirmePar){
		this.IdCli = IdCli;
		this.Nom = Nom;
		this.Adresse = Adresse;
		this.Telephone = Telephone;
		this.TypeCarte = TypeCarte;
		this.IdReser = IdReser;
		this.dateReser = dateReser;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.NoDepart = NoDepart;
		this.Fax = Fax;
		this.ConfirmePar = ConfirmePar;
	}
	
	@Override
	public String getColumnName(int columnIndex)
	{
		// TODO Auto-generated method stub
		return lesTitres[columnIndex];
	}
	
	public void lireEnreg() {
		try {    
			PreparedStatement state = modConnexion.getInstance().getLaConnectionStatique().prepareStatement("SELECT NoDepart, IdCli, Nom, Adresse, Telephone, Fax, TypeCarte, IdReser, dateReser, dateDebut, dateFin, ConfirmePar FROM EQU03prg01.viewDepart");
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
				
				lesDeparts.add(new modDepart(rs.getInt("NoDepart"),
						rs.getInt("IdCli"), 
						rs.getString("Nom"), 
						rs.getString("Adresse"), 
						rs.getString("Telephone"),
						rs.getString("Fax"),
						rs.getString("TypeCarte"), 
						rs.getInt("IdReser"),
						rs.getDate("dateReser"),
						rs.getDate("dateDebut"),
						rs.getDate("dateFin"),
						rs.getString("ConfirmePar")));
				this.setCurrent(rs.getInt("NoDepart"));
			} 
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),
					"ALERTEsss", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	@Override
	public int getRowCount() {
		return lesDeparts.size();
	}

	@Override
	public int getColumnCount() {
		return lesTitres.length;
	}

	public ArrayList<modDepart> getLesEnreg() {
		return lesDeparts;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		modDepart depart = (modDepart)lesDeparts.get(rowIndex);
		if(columnIndex == 0) 	return depart.NoDepart;
		if(columnIndex == 1) 	return depart.IdCli;
		if(columnIndex == 2) 	return depart.Nom;
		if(columnIndex == 3) 	return depart.Adresse;
		if(columnIndex == 4) 	return depart.Telephone;
		if(columnIndex == 5) 	return depart.Fax;
		if(columnIndex == 6) 	return depart.TypeCarte;
		if(columnIndex == 7) 	return depart.IdReser;
		if(columnIndex == 8) 	return depart.dateReser;
		if(columnIndex == 9) 	return depart.dateDebut;
		if(columnIndex == 10) 	return depart.dateFin;
		if(columnIndex == 11) 	return depart.ConfirmePar;
		return depart.NoDepart;
	}

}
