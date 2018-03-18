public class Sudoku {
	public final int n;
	private Case[][] grille;
	private Choix[] cols, lines, blocs;

	public Sudoku(int n){
		int i;
		this.n = n;
		grille = new Case[n][n];
		cols = new Choix[n];
		lines = new Choix[n];
		blocs = new Choix[n];
		for(i=0; i<cols.length; i++){
		}
	}

}