public class Poule extends Animal {
	private static int compt=0;
	private int id;

	public Poule(int x, int y){
		super(x, y, "Poule");
		this.id=compt++;
	}

	public String toString(){
		return String.format("p%02d", id);
	}

	public void afficher(){
		System.out.println("Poule en (" + getX() + ", " + getY() + "), id: " + id);
	}

	public static int getCompt(){
		return compt;
	}

	public void move(Animal a){
		String typeA = a.getType();
		if (typeA.contentEquals("Vipere"))
			System.out.println(this + " se rapproche de " + a);
			 move((int) Math.signum(getX() - a.getX()), (int) Math.signum(getY() - a.getY()));
		if(typeA.contentEquals("Renard"))
			System.out.println(this + " s'éloigne de "  + a);
			 move((int) Math.signum(-getX() + a.getX()), (int) Math.signum(-getY() + a.getY()));
	}
}