public class TestCoureur {
	public static void main(String[] args){
		Coureur c1 = new Coureur();
		Coureur c2 = new Coureur();
		Coureur c3 = new Coureur(33);
		Coureur c4 = new Coureur(34);
		int tps = 0; //temps de course en secondes
		int nu1 = c1.getNuDossard();
		System.out.println("Numéro dossard de c1 : " + nu1);
		System.out.println("Temps au 100m de c1 : " + c1.getTempsAu100());
		System.out.println("c1 a le témoin : " + c1.getALeTemoin() );
		System.out.println(c2.toString());
		System.out.println(c3);
		System.out.println(c4);
		
		//Relais 4 fois 100m
		System.out.println("\n-----Relais 4 fois 100m------\n");
		c1.courir();
		tps+=c1.getTempsAu100();
		c1.passeTemoin(c2);
		c2.courir();
		tps+=c2.getTempsAu100();
		c2.passeTemoin(c3);
		c3.courir();
		tps+=c3.getTempsAu100();
		c3.passeTemoin(c4);
		c4.courir();
		tps+=c4.getTempsAu100();
		
		System.out.println("\nTemps total : " + tps + "s");
		
		System.out.println("\n" + c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
