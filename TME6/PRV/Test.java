public class Test {
	public static void main(String[] args){
		Poule p1 = new Poule(2, 3);
		Poule p2 = new Poule(4, 5);
		System.out.println(p1);
		p1.afficher();
		p1.move(2, 2);
		p1.afficher();
		p2.afficher();
		System.out.println(p2);
	}
}