public class Carte {
	private String nom;
	
	public Carte() {
		this("Valet");
	}
	
	public Carte(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return this.nom;
	}
	
}
	
