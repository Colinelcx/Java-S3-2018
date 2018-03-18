public class Choix{
	private boolean[] tab;
	private int nbLibre;
	public final int length;

	public Choix(int n){
		nbLibre = n;
		tab = new boolean[n];
		for (int i=0; i<tab.length; i++){
			tab[i] = true;
		}
		this.length = n;
	}

	public Choix(Choix choix){
		this.nbLibre = choix.nbLibre;
		tab = new boolean[choix.length];
		for (int i=0; i<tab.length; i++){
			tab[i] = choix.tab[i];
		}
		this.length = choix.length;
	}

	public boolean estLibre(int i){
		return tab[i];
	}

	public int getNbLibre(){
		return nbLibre;
	}

	public String toString(){
		String str = "";
		for (int i=0; i<tab.length; i++){
			str +=tab[i] + "\t";
		}
		return str;
	}

	public void setLibre(int i){
		if (tab[i] == false){
			this.nbLibre++;
			this.tab[i] = false;
		}
	}

	public void setOccupe(int i){
		if (tab[i] == true){
			this.nbLibre--;
			this.tab[i] = false;
		}
	}

	public int getNext(int i){
		while (tab[i]!=true && i<tab.length)
			i++;
		if (i == tab.length)
			return -1;
		return i;
	}

	public Choix intersection(Choix choix){
		Choix res = new Choix(this.length);
		int compt = 0;
		for (int i=0; i<res.length; i++){
			res.tab[i] = this.tab[i] && choix.tab[i];
			if (res.tab[i]==true)
				compt++;
		}
		res.nbLibre = compt;
		return res;
	}
}