public class Renard extends Animal {
	private static int compt=0;
	private int id;

	public Renard(int x, int y){
		super(x, y, "Renard");
		this.id=compt++;
	}

	public String toString(){
		return String.format("r%02d", id);
	}

	public void afficher(){
		System.out.println("Renard en (" + getX() + ", " + getY() + "), id: " + id);
	}

	public static int getCompt(){
		return compt;
	}

public void move(Animal a){
		String typeA = a.getType();
		if (typeA.contentEquals("Poule"))
			System.out.println(this + " se rapproche de " + a);
			 move((int) Math.signum(getX() - a.getX()), (int) Math.signum(getY() - a.getY()));
		if(typeA.contentEquals("Vipere"))
			System.out.println(this + " s'éloigne de "  + a);
			 move((int) Math.signum(-getX() + a.getX()), (int) Math.signum(-getY() + a.getY()));
	}}