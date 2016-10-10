package main;

public class Soutenance {
	
	private int id;
	private String titre;
	private int id_etudiant;
	private int id_plage;

	public Soutenance() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public int getId_plage() {
		return id_plage;
	}

	public void setId_plage(int id_plage) {
		this.id_plage = id_plage;
	}

}
