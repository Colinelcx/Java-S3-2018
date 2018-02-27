public class Personne {
	private String nom;
	private Personne conjoint;

	public Personne() {
		this("Individu");
		nom = nom + tirageLettre() + tirageLettre() + tirageLettre();
	}

	public Personne(String nom){
		this.nom = nom;
		conjoint = null;
	}

	private char tirageLettre(){
		return (char)((int)(Math.random()*26) + 'A');
	}

	public String toString(){
		String res = nom + ", ";
		if (conjoint == null)
			res += "célibataire";
		else
			res += "marié";
		return res;
	}

	public void epouser(Personne p){
		if (p.conjoint == null && this.conjoint == null){
			System.out.println(this + " se marie avec " + p);
			this.conjoint = p;
			p.conjoint = this;
		}
		else {
			System.out.println("Ce mariage est impossible");
		}
	}

	public void divorcer(){
		if (conjoint != null){
			System.out.println(this + " divorce de " + conjoint);
			conjoint.conjoint = null;
			conjoint = null;

		}

	}

}
