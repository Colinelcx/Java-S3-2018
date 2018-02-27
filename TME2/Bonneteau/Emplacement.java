public class Emplacement {
	private Carte carte;
	private String nom;
	
	public Emplacement(String nom){
		this(nom, null);
	}
	
	public Emplacement(String nom, Carte carte){
		this.nom = nom;
		this.carte = carte;
	}
	
	public String toString(){
		return (nom + " : " + carte);
	}
	
	public boolean estVide(){
		return carte == null;
	}
	
	public boolean poser(Carte carte){
		if (estVide() == true){
			this.carte = carte;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Carte enlever(){
		Carte carteEnlevee = this.carte;
		this.carte = null;
		return carteEnlevee;
	}
}
