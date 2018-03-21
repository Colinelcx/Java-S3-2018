public class TestMenagerie{
	public static void main(String[] args){
		Menagerie m = new Menagerie(15);
		Vache v = new Vache();
		Canard c = new Canard(14);
		MillePattes mp = new MillePattes(15);
		Boa b = new Boa();
		Saumon s = new Saumon();

		m.ajouter(v); 
		m.ajouter(c); 
		m.ajouter(mp); 
		m.ajouter(b); 
		m.ajouter(s); 
		System.out.println(m);
		m.midi();
		m.vieillirTous();
		System.out.println(m); 
	}
}