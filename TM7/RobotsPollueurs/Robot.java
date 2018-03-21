public abstract class Robot {
	private int i,j;
	private int numSerie;
	private static int compt = 0;

	public Robot(int i, int j){
		this.i = i;
		this.j = j;
		this.numSerie = compt++;
	}

	protected void move(int di, int dj){
		i += di;
		j += dj;
	}

	public int getNumSerie(){
		return numSerie;
	}

	public abstract void move(Monde m);

	public abstract void action(Monde m);
}