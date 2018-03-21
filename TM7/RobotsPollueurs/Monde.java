import java.util.ArrayList;

public class Monde {
	private int dimension;
	private ArrayList<Robot> robots;
	private ListeLIFO[][] terrain;

	public Monde(ArrayList<Robot> robots, int dimension){
		this.robots = robots;
		this.dimension = dimension;
		terrain = new ListeLIFO[dimension][dimension];
		for (int i=0; i<dimension; i++){
			for (int j=0; j<dimension; j++){
				terrain[i][j] = new ListeLIFO();
				int nb = (int)(Math.random()*3);
				for (int n=0; i<nb; i++)
					terrain[i][j].push(new PapierGras());
			}

		}
	}

	public ListeLIFO getPile(int i, int j){
		return terrain[i][j];
	}

	public int getDimension(){
		return dimension;
	}

}