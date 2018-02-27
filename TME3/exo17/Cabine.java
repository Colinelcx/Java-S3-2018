public class Cabine {
	private double volume; //en metre cube
	private String couleur;

	public Cabine(double volume, String couleur){
		this.volume = volume;
		this.couleur = couleur;
	}
	
	public Cabine(Cabine c){
		this(c.volume, c.couleur);
	}
	
	public String toString(){
		return "Cabine de volume : " + volume + "m3, couleur : " + couleur;
	}

	public void setCouleur(String couleur){
		this.couleur = couleur;
	}
}
