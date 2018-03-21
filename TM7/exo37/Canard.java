public class Canard extends AnimalAPattes {
	public Canard(int age){
		super("Canard", age, 2);
	}
	public Canard(){
		super("Canard", 2);
	}
	public void crier(){
		System.out.println("Coin coin");
	}
}