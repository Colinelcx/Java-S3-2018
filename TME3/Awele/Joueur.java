public class Joueur {
	private int num;
	private int gain;

	public Joueur(){
		this(0); //demander au prof
	}

	public Joueur(int num){
		this.num = num;
		this.gain = 0;
	}

	public int getNum(){
		return num;
	}

	public int getGain(){
		return gain;
	}

	public void ajouterGain(int somme){
		gain += somme;
	}
	
	public String toString(){
		return (String.format("Joueur %d", num));
	}
}
