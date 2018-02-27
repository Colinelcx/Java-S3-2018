public class Coureur {
	private int nuDossard; //numéro du dossard
	private double tempsAu100; //en secondes
	private boolean aLeTemoin;
	
	public Coureur(int nuDossard){
		this.nuDossard = nuDossard;
		tempsAu100 =(int)(Math.random()*4+12);
		aLeTemoin = false;
	}
	
	public Coureur(){
		this(1 + (int)(Math.random()*1000));
	}
	
	public int getNuDossard(){
		return nuDossard;
	}
	
	public double getTempsAu100(){
		return tempsAu100;
	}
	
	public boolean getALeTemoin(){
		return aLeTemoin;
	}
	
	public String toString(){
		return ("Coureur " + nuDossard + " tempsAu100 : " + tempsAu100 + "s au 100m aLeTemoin : " + aLeTemoin + " .");
	}
	
	public void passeTemoin(Coureur c){
		System.out.println("moi, coureur " + nuDossard + ", je passe le témoin au coureur " + c.nuDossard);
		this.aLeTemoin = false;
		c.aLeTemoin = true;
	}
	
	public void courir() {
		System.out.println("je suis le coureur " + nuDossard + " et je cours");
	}
}
	
