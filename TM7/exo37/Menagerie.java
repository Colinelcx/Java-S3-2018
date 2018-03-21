public class Menagerie {
	Animal[] tab;
	int nbAnimal;

	public Menagerie(int taille){
		tab = new Animal[taille];
		nbAnimal = 0;
	}

	public void ajouter(Animal a){
		tab[nbAnimal++] =  a;
	}

	public String toString(){
		String str = "";
		for (Animal a: tab){
			if (a == null)
				break;
			str +=(a + "\n");
		}
		return str;
	}

	public void midi(){
		for (Animal a: tab){
			if (a == null)
				break;
			a.crier();
			}
	}

	public void vieillirTous(){
		for (Animal a: tab){
			if (a == null)
				break;
			a.vieillir();
		}
	}
}