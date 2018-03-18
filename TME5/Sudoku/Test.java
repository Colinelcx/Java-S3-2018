public class Test {
	public static void main(String[] args){
		Choix col = new Choix(9);
		Choix line = new Choix(col);
		Choix bloc = new Choix(line);
		System.out.println("col: " + col + "\nnbLibre:" + col.getNbLibre());
		col.setOccupe(1);
		line.setOccupe(4);
		System.out.println("col: " + col);
		System.out.println("line: " + line);
		Choix inter = col.intersection(line);
		System.out.println("intersection col et line: " + inter);
		System.out.println("nblibre inter: " + inter.getNbLibre());
		System.out.println("nblibre col: " + col.getNbLibre());

		Case c = new Case(col, line, bloc);
		System.out.println(c);
		System.out.println("choix: " +c.getChoix());
		if (c.setNombre(3)==false)
			System.out.println("Erreur : nombre impossible");
		System.out.println("choix: " +c.getChoix());


	}
}