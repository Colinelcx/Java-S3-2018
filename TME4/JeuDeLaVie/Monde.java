public class Monde {
	private int dimX;
	private  int dimY;
	private int noGener;
	private boolean [][] tabCells;

	public Monde (int dimX, int dimY, double seuil){
		this.dimX = dimX;
		this.dimY = dimY;
		tabCells = new boolean[dimX][dimY];
		for (int x=0; x<dimX; x++){
			for (int y=0; y<dimY; y++){
				if (Math.random()<seuil)
					tabCells[x][y]=true;
			}
		}
		noGener=0;
	}

	public Monde(int dimX, int dimY, int x, int y, boolean[][] motif){
		this.dimX = dimX;
		this.dimY = dimY;
		tabCells = new boolean[dimX][dimY];
		for(int i=0; i<motif.length; i++){
			for (int j=0; j<motif[0].length; j++){
				tabCells[i+x][j+y] = motif[i][j];
			}
		}
		noGener = 0;
	}

	public String toString() {
		String s = "Monde de génération n°"+noGener + "\n";
		for (int x=0; x<dimX; x++){
			for (int y=0; y<dimY; y++){
				if (tabCells[x][y])
					s+="* ";
				else
					s+=". ";
			}
			s+="\n";
		}
		return s;
	}

	public int getH(){
		return dimY;
	}

	public int getL(){
		return dimX;
	}

	public boolean get(int i, int j){
		return tabCells[i][j];
	}

	public int nbVoisins(int nuLign, int nuCol){
		int compt = 0;
		for (int x=nuLign-1; x<=nuLign+1; x++){
			for (int y=nuCol-1; y<=nuCol+1; y++){
				if (tabCells[(x+dimX)%dimX][(y+dimY)%dimY] == true)
					compt +=1;
			}
		}
		if (compt>0){
			if (tabCells[nuLign][nuCol] == true)
				compt--;
		}
		return compt;
	}

	public void genSuiv(){
		boolean [][] tab= new boolean[dimX][dimY];
		for (int x=0; x<dimX; x++){
			for (int y=0; y<dimY; y++){
				if ((nbVoisins(x, y)<2) || (nbVoisins(x, y)>3)){
					tab[x][y]= false;

				}
				else {
					if (nbVoisins(x, y)==3)
						tab[x][y]= true;
					else 
						tab[x][y] = tabCells[x][y];
				}
			}
		}
		tabCells=tab;
		noGener+=1;
	}
}

	

