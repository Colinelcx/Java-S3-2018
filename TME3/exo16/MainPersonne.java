public class MainPersonne {
	public static void main(String[] args){
		Personne p1 = new Personne("Dhiya");
		Personne p2 = new Personne("Momo");
		Personne p3 = new Personne();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Mariage de " + p1 + " et de " + p2);
		p1.epouser(p2);
		System.out.println("Les personnes après mariage :");
		System.out.println(p1);
		System.out.println(p2);
        System.out.println(p3);
		System.out.println("Essai de mariage de " + p1 + " avec " + p3 + " :");
		p1.epouser(p3);
		System.out.println("Divorce de " + p1 + " et de " + p2 + " :");
		p1.divorcer();
		System.out.println("Les personnes après divorce :");
		System.out.println(p1);
        System.out.println(p2);
		System.out.println(p3);
	}
}
