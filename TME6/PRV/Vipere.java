public class Vipere extends Animal {
	private static int compt=0;
	private int id;

	public Vipere(int x, int y){
		super(x, y, "Vipere");
		this.id=compt++;
	}

	public String toString(){
		return String.format("v%02d", id);
	}

	public void afficher(){
		System.out.println("Vipere en (" + getX() + ", " + getY() + "), id: " + id);
	}

	public static int getCompt(){
		return compt;
	}

public void move(Animal a){
		String typeA = a.getType();
		if (typeA.contentEquals("Renard"))
			System.out.println(this + " se rapproche de " + a);
			 move((int) Math.signum(getX() - a.getX()), (int) Math.signum(getY() - a.getY()));
		if(typeA.contentEquals("Poule"))
			System.out.println(this + " s'éloigne de "  + a);
			 move((int) Math.signum(-getX() + a.getX()), (int) Math.signum(-getY() + a.getY()));
	}}