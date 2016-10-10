package main;

public class Etudiant {
	
	private int id;
	private String nom;
	private String prenom;
	private enum Statut{
		ISL("isl"),
		FSI("fsi");
		
		private String value;
		Statut(String s){
			this.value = s;
		}
		
		public String getValue(){
			return this.value;
		}
	}
	private Statut statut;

	public Etudiant() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	
}
