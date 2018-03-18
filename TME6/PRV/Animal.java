public abstract class Animal {
	private int x, y;
	private String type;

	public Animal(int x, int y, String type){
		this.x=x;
		this.y=y;
		this.type=type;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public String getType(){
		return type;
	}

	public double distance(Animal a){
		return Math.sqrt(Math.pow(this.x-a.x,2) + Math.pow(this.y-a.y, 2));
	}

	public void move(int i, int j){
		this.x+=i;
		this.y+=j;
	}

	public String toString(){
		return "Je suis un animal";
	}

	public abstract void move(Animal a);

}