public class Vache extends AnimalAPattes {
	public Vache(int age){
		super("Vache", age, 4);
	}
	public Vache(){
		super("Vache", 4);
	}
	public void crier(){
		System.out.println("Meuh");
	}
}