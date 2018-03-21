public class MillePattes extends AnimalAPattes {
	public MillePattes(int age){
		super("MillePattes", age, 1000);
	}
	public MillePattes(){
		super("MillePattes", 1000);
	}

	public void crier(){
		System.out.println("Pukapukapuk");
	}
}