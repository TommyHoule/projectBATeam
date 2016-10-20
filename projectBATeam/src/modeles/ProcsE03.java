package modeles;
import java.util.ArrayList;
import utils.Query;

public final class ProcsE03 {
	
	private static Query SELECT_ARRIVE = new Query("Select viewArriver.NoArrive , viewArriver.IdReser as IdR, viewArriver.IdCli , viewArriver.Nom, viewArriver.NoCham, viewArriver.Telephone, viewArriver.Fax, viewArriver.Adresse, viewArriverReservation.IdReser, viewArriverReservation.dateReser, viewArriverReservation.dateDebut, viewArriverReservation.dateFin, viewArriverReservation.IdCli as IdCliR, viewArriverReservation.Nom as NomR FROM EQU03prg01.viewArriver, EQU03prg01.viewArriverReservation where viewArriverReservation.IdReser = viewArriver.IdReser");
	private static Query SELECT_DE = new Query("SELECT VIEWDE.NOCHAM, VIEWDE.CODTYPCHA, VIEWDE.PRIX, VIEWDE.ATTRIBUEE FROM EQU03PRG01.VIEWDE WHERE VIEWDE.IDRESER = ?");
	private static Query SELECT_PK_ARRIVE = new Query("SELECT viewArriver.IdReser as NoReser, viewArriver.IdCli as NoCli, viewArriver.Nom as Nom, viewArriver.NoCham as NoCham FROM EQU03prg01.viewArriver");
	private static Query SELECT_DEPART = new Query("SELECT NoDepart, IdCli, Nom, Adresse, Telephone, Fax, TypeCarte, IdReser, dateReser, dateDebut, dateFin, ConfirmePar FROM EQU03prg01.viewDepart");
	private static Query SELECT_LISTEDEPART = new Query("SELECT v.IdReser, v.NoCham, v.IdCli, v.Nom, v.dateDepart FROM EQU03prg01.viewListeDepart v WHERE v.IdReser = ?");
	
	/**
	 * @return le model des arriver dans lordre suivant:
	 * NoArrive, IdR, IdCli, Nom, NoCham, Telephone, Fax, Adresse, IdReser, dateReser, dateDebut, dateFin, IdCliR, NomR
	 */
	public static Model SELECT_ARRIVE(){
		return SELECT_ARRIVE.execute();
	}
	
	/**
	 * @param IdReser
	 * @return les information suivante:
	 * NOCHAM, CODTYPCHA, PRIX, ATTRIBUEE
	 */
	public static Model SELECT_DE(String IdReser){
		return SELECT_DE.execute(IdReser);
	}
	
	public static Model SELECT_PK_ARRIVE(){
		return SELECT_PK_ARRIVE.execute();
	}
	
	/**
	 * @return Les information suivante:
	 * NoDepart, IdCli, Nom, Adresse, Telephone, Fax, TypeCarte, IdReser, dateReser, dateDebut, dateFin, ConfirmePar
	 */
	public static Model SELECT_DEPART(){
		return SELECT_DEPART.execute();
	}
	
	/**
	 * @param IdReser
	 * @return Les information suivante:
	 * IdReser, NoCham, IdCli, Nom, dateDepart
	 */
	public static Model SELECT_LISTEDEPART(String IdReser){
		return SELECT_LISTEDEPART.execute(IdReser);
	}
}
