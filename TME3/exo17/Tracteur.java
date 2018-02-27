public class Tracteur {
	private Cabine cabine;
	private Roue r1, r2, r3, r4;

	public Tracteur(Cabine cabine, Roue r1, Roue r2, Roue r3, Roue r4){
		this.cabine = cabine;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
	}
	
	public Tracteur(Tracteur tr){
		this(new Cabine(tr.cabine), new Roue(tr.r1), new Roue(tr.r2), new Roue(tr.r3), new Roue(tr.r4));
	}

	public String toString(){
		return "Tracteur:\n" + cabine +"\n" + r1 + "\n" +r2 + "\n" + r3 + "\n" + r4 + "\n";

	}

	public void peindre(String couleur){
		this.cabine.setCouleur(couleur);
	}
}
