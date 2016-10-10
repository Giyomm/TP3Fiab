package main;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Admin {
	
	private InteractBD database;
	private Connection connection;
	private String currentURL;

	public Admin(String url) {
		this.currentURL = url;
		database = new InteractBD();
		try {
			connection = database.connect(currentURL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//ETUDIANT QUERY
	public void addEtudiant(String nom, String prenom, String statut) throws SQLException{
		database.executeUpdate(currentURL,"INSERT INTO Etudiants (nom,prenom,statut) VALUES (?,?,?);",nom,prenom,statut);
	}
	
	public void deleteEtudiant(int id) throws SQLException{
		database.executeUpdate(currentURL,"DELETE FROM Etudiants WHERE id = ? ;",id);
	}
	
	//PLAGE QUERY
	public void addPlage(int jour, int horaire, int num_salle) throws SQLException{
		database.executeUpdate(currentURL,"INSERT INTO PlagesSoutenances (jour,horaire,num_salle) VALUES (?,?,?);",jour,horaire,num_salle);
	}
	
	public void deletePlage(int id) throws SQLException{
		database.executeUpdate(currentURL,"DELETE FROM PlagesSoutenances WHERE id = ? ;",id);
	}
	
	public void modifiePlageSoutenance(Soutenance sout, Plage newPlage) throws SQLException{
		database.executeUpdate(currentURL,"UPDATE Soutenances SET id_plage = ?, WHERE id = ?",newPlage.getId(),sout.getId());
	}
	
	//SOUTENANCE QUERY
	public void addSoutenance(Soutenance sout) throws SQLException{
		database.executeUpdate(currentURL,"INSERT INTO Soutenances (titre,id_etudiant,id_plage) VALUES (?,?,?);",sout.getTitre(),sout.getEtudiant().getId(),sout.getPlage().getId());
	}
	
	public void deleteSoutenance(int id) throws SQLException{
		database.executeUpdate(currentURL,"DELETE FROM Soutenances WHERE id = ? ;",id);
	}
}
