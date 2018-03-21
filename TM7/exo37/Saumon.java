public class Saumon extends AnimalSansPattes {
	public Saumon(int age){
		super("Saumon", age);
	}
	public Saumon(){
		super("Saumon");
	}

	public void crier(){
		System.out.println("Blublublu");
	}
}