public class Case {
	private int nbBilles;
	private Joueur prop;

	public Case(Joueur prop){
		nbBilles = 4;
		this.prop = prop;
}

	public Case(){
		this(null); //pourquoi ?
	}

	public String toString(){
		return ("" +nbBilles); //demander au prof
	}

	public Joueur getProp(){
		return prop;
	}
	

	public int getNbBilles(){
		return nbBilles;
	}

	public void setNbBilles(int nbBilles){
		this.nbBilles = nbBilles;
	}
	
	public int getNumJoueur(){
		return prop.getNum();
	}
}
