public abstract class AnimalAPattes extends Animal{
	protected int nbPattes;

	public AnimalAPattes(String nom, int age, int nbPattes){
		super(nom, age);
		this.nbPattes = nbPattes;
	}
	public AnimalAPattes(String nom, int nbPattes){
		super(nom);
		this.nbPattes = nbPattes;
	}

	public String toString(){
		return super.toString() + ", " + nbPattes + " pattes";
	}
}