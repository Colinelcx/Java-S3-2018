public class Roue{
	private int d; //diametre en cm
	public Roue (int d){
		this.d=d;
	}
	public Roue(){
		this(60); 
	}
	
	public Roue(Roue r){
		this(r.d);
	}
	
	public String toString(){
		return ("Roue de diametre " + d + "cm"); 
	} 
}
