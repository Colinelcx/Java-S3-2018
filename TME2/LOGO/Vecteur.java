public class Vecteur{
	private double x, y;

	public Vecteur(double x, double y){
		this.x = x;
		this.y = y;
	}

	public Vecteur addGen(Vecteur v){
		return new Vecteur (this.x + v.x, this.y + v.y);
	}

	public String toString(){
		return String.format("%.2f, %.2f", x, y);
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public Vecteur rotation(double radian){
		double newX = x * Math.cos(radian) - y * Math.sin(radian);
		double newY = x * Math.sin(radian) + y * Math.cos(radian);
		return new Vecteur(newX, newY);
	}

}