//package sudoku;
//import tools.SimpleInterface;

import java.awt.event.KeyEvent;


public class SudoJeu {

	
	public static void main(String[]args){
		Sudoku sudoku = new Sudoku(9);
		sudoku.setInitial(0,0,2);
		sudoku.setInitial(2,0,3);
		sudoku.setInitial(4,0,8);
		sudoku.setInitial(8,0,7);
		sudoku.setInitial(2,1,5);
		sudoku.setInitial(3,1,4);
		sudoku.setInitial(3,2,6);
		sudoku.setInitial(6,2,5);
		sudoku.setInitial(7,2,1);
		sudoku.setInitial(8,2,0);
		sudoku.setInitial(5,3,8);
		sudoku.setInitial(6,3,2);
		sudoku.setInitial(7,3,5);
		sudoku.setInitial(2,4,7);
		sudoku.setInitial(6,4,8);
		sudoku.setInitial(1,5,8);
		sudoku.setInitial(2,5,2);
		sudoku.setInitial(3,5,1);
		sudoku.setInitial(0,6,1);
		sudoku.setInitial(1,6,2);
		sudoku.setInitial(2,6,6);
		sudoku.setInitial(5,6,3);
		sudoku.setInitial(5,7,4);
		sudoku.setInitial(6,7,7);
		sudoku.setInitial(0,8,3);
		sudoku.setInitial(4,8,6);
		sudoku.setInitial(6,8,1);
		sudoku.setInitial(8,8,5);
		jouer(sudoku);
		//resoudre(sudoku);
	}

	public static void resoudre(Sudoku sudoku){
		SimpleInterface f = new SimpleInterface("Sudoku",800,600);
		Solver solver = new Solver(sudoku);
		show(f, solver.getSudoku());
		while(!f.hasEvent())
			f.pause(10);
		f.flush();

		while(solver.getSudoku().getCaseVide().getNbLibre()!=0){
			if (!solver.step()){
				f.drawString("Solution not found",50,50,SimpleInterface.BLACK);
				return;
			}
			show(f, solver.getSudoku());
			f.refresh();
			SimpleInterface.pause(10);

		}
	}
	public static void jouer(Sudoku sudoku){
		SimpleInterface f = new SimpleInterface("Sudoku",800,600);
		boolean stop = false;
		int x,y,key;
		int [] click;
		while(!stop){
			show(f,sudoku);
			click = f.waitClick();
			x =  f.xToGrid(click[0]);
			y =  f.yToGrid(click[1]);
			if ((click[2]==1) && sudoku.getModifiable(x,y)){
				f.flushKey();
				f.fillCell(x,y,SimpleInterface.YELLOW);
				if (sudoku.getNombre(x, y)>=0)
					f.drawStringCell(""+(sudoku.getNombre(x, y)+1), x, y, SimpleInterface.BLUE);
				f.refresh();
				System.out.print("Choix libres : ");
				for (int i=0;i<sudoku.n;i++){
					if (sudoku.getChoix(x,y).estLibre(i))
						System.out.print(i+1+" ");
				}
				System.out.println("");
				boolean input=true;
				while (input){
					if (f.popClick()!=null){
						input = false;
					}
					if ((key = f.popKey())>=0){
						if ((key>=KeyEvent.VK_1) && (key <=KeyEvent.VK_9)){
							if (!sudoku.setNombre(x, y,key-KeyEvent.VK_1)){
								f.fillCell(x, y, SimpleInterface.RED);
								f.refresh();
							}
							input = false;
						}
						if (key==KeyEvent.VK_ESCAPE)
							return;
					}
					f.pause(100);
				}
			}
			if ((click[2]==3) && (sudoku.getModifiable(x,y)))
				sudoku.supprime(x,y);
			if (sudoku.getCaseVide().getNbLibre()<=0){
				System.out.println("GagnÃ©");
				return;
			}
			f.flush();
		}
	}


	public static void show(SimpleInterface f, Sudoku g){
		f.setGrid(g.getN(),g.getN());
		f.fill(SimpleInterface.WHITE);
		for (int i=0;i<g.getN();i++){
			for (int j=0;j<g.getN();j++){
				f.rectCell(i, j, SimpleInterface.RED);
				if (g.getNombre(i, j)>=0){
					if (g.getModifiable(i, j))
						f.drawStringCell(""+(g.getNombre(i,j)+1), i, j, SimpleInterface.BLUE);
					else f.drawStringCell(""+(g.getNombre(i,j)+1), i, j, SimpleInterface.RED);

				}
			}
		}
		for (int i=0;i<=Math.sqrt(g.getN());i++){
			f.fillRect(f.gridToX((int)(i*Math.sqrt(g.getN())))-2,0, 4,f.gridToY(g.getN()),SimpleInterface.GREEN);
			f.fillRect(0, f.gridToY((int)(i*Math.sqrt(g.getN())))-2,f.gridToX(g.getN()),4, SimpleInterface.GREEN);
		}
		f.refresh();
	}


}