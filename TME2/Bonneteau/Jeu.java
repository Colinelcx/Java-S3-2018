public class Jeu {
	private Emplacement gauche, milieu, droit;
	private Carte cible;
	
	public Jeu(){
		gauche = new Emplacement("Emplacement gauche");
		milieu = new Emplacement("Emplacement milieu");
		droit = new Emplacement("Emplacement droit");
		Carte valet1 = new Carte();
		Carte valet2 = new Carte();
		cible = new Carte("Dame de Coeur");
		gauche.poser(valet1);
		milieu.poser(cible);
		droit.poser(valet2);
	}
	
	public String toString(){
		return (gauche + "\n" + milieu + "\n" + droit);
	}
	
	public void echanger(Emplacement a, Emplacement b){
		Carte echangeA = a.enlever();
		Carte echangeB = b.enlever();
		a.poser(echangeB);
		b.poser(echangeA);
	}
	
	public void echanger(int i, int j){
		if (i+j == 1)
			echanger(gauche, milieu);
		if (i+j == 2)
			echanger(gauche, droit);
		if (i+j == 3)
			echanger(milieu, droit);
	}
	
	public boolean choisir(Emplacement a){
		return (a.enlever() == cible);
	}
	
	public boolean choisir(int i){
		if (i==0)
			return choisir(gauche);
		if (i==1)
			return choisir(milieu);
		if (i==2)
			return choisir(droit);
		System.out.println("Erreur");
		return false;
	}
	
	void melanger(){
		echanger(1 + (int)(Math.random()*3), 1 + (int)(Math.random()*3));
	}
	
	void melanger(int n){
		for (int i=0; i<n; i++){
			melanger();
		}
	}
}
		
