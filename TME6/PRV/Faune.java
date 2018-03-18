public class Faune {
	public static final int TAILLE = 25;
	private int NBANIMAUX;
	private Animal[] tab;

	public Faune(int NBANIMAUX){
		this.NBANIMAUX = NBANIMAUX;
		tab = new Animal[NBANIMAUX];
		int nb = NBANIMAUX/3;
		int y=0;
		for(int i=0; i<nb; i++){
			tab[y++] = new Poule((int)(Math.random()*TAILLE), (int)(Math.random()*TAILLE));
		}

		for(int i=0; i<nb; i++){
			tab[y++] = new Renard((int)(Math.random()*TAILLE), (int)(Math.random()*TAILLE));
		}

		for(int i=0; i<nb; i++){
			tab[y++] = new Vipere((int)(Math.random()*TAILLE), (int)(Math.random()*TAILLE));
		}
	}

	public String terrain(){
		String[][] terr = new String[TAILLE][TAILLE];
		for (int i=0; i<TAILLE; i++){
			for (int j=0; j<TAILLE; j++){
				terr[i][j]=". ";
			}
		}

		for (int i=0; i<NBANIMAUX; i++)
			terr[tab[i].getX()][tab[i].getY()] = tab[i].toString();
		
		String s ="";
		for (int i=0; i<TAILLE; i++){
			for (int j=0; j<TAILLE; j++){
				s += terr[i][j];
			}
			s+="\n";
		}
		return s;
	}

	public int getIndiceAnimalLePlusProche(Animal requete){
		double dist_min = Double.POSITIVE_INFINITY;
		int index = -1;
		for (int i=0; i<tab.length; i++){
			if (tab[i] == requete || tab[i] == null)
				continue;
			if (tab[i].distance(requete) < dist_min){
				dist_min = tab[i].distance(requete);
				index = i;
			}
		}
		return index;
	}

	public void udpate(){
		System.out.println("\n------MISE A JOUR------\n");
		for(Animal animal: tab){
			Animal proche = tab[getIndiceAnimalLePlusProche(animal)];
			animal.move(proche);
		}
		for (int i=0; i<tab.length; i++){
			int proche = getIndiceAnimalLePlusProche(tab[i]);
			if (tab[i].distance(tab[proche]) ==0){
				String typeAnimal = tab[i].getType();
				String typeProche = tab[proche].getType();
				if (typeAnimal == "Renard" && typeProche == "Poule" || typeAnimal == "Vipere" && typeProche == "Renard"|| typeAnimal == "Renard" && typeProche == "Poule"){
					System.out.println(tab[i] + " mange " + tab[proche]);
					tab[proche] = null;
				}
				else if (typeAnimal == "Poule" && typeProche == "Renard" || typeAnimal == "Renard" && typeProche == "Vipere" || typeAnimal == "Poule" && typeProche == "Renard"){
					System.out.println(tab[proche] + " mange " + tab[i]);
					tab[i] = null;
				}

			}
		}
	}

	public void etatDeLaFaune(){
		System.out.println("\n------ETAT DE LA FAUNE------\n");
		for (Animal animal : tab){
			System.out.println(animal + " a pour voisin le plus proche : " + tab[getIndiceAnimalLePlusProche(animal)]);
		}
	}

}