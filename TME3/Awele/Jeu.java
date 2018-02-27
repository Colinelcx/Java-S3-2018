import java.util.Scanner; 
public class Jeu {
	private Case[] plateau;
	private Joueur[] tabJ;
	private Joueur main;

	public Jeu(){
		plateau = new Case[12];
		tabJ = new Joueur[2];

		//initialisation des joueurs
		tabJ[0] = new Joueur(1);
		tabJ[1] = new Joueur(2);


		//initialisation du plateau
		for (int i=0; i<6; i++){
			plateau[i] = new Case(tabJ[0]);
		}
		for (int i=6; i<12; i++){
			plateau[i] = new Case(tabJ[1]);
		}
		
		main = tabJ[0];
	}

	public String toString(){
		String visuel = "|";
		for (int i=0; i<6; i++){
			visuel += (plateau[i] + ("|"));
		}
		visuel += "\n|";
		for (int i=11; i>5; i--){
			visuel += (plateau[i]+"|");
		}
		return visuel;
	}

	public void changeJoueur(){
		if (main == tabJ[0])
			main = tabJ[1];
		else
			main = tabJ[0];
	}

	public void choisirCase(){
		boolean res = false;
		Scanner saisieUtilisateur = new Scanner(System.in);
		do {
			System.out.println(main + " veuillez choisir une case");
			int choix = saisieUtilisateur.nextInt();
			if (plateau[choix].getProp() == main){
				this.unCoup(choix);
				res = true;
			}
			else {
				System.out.println("Erreur : vous n'êtes pas possesseur de cette case");
				res = false;
			}
		} while (res == false);
	}

	public void unCoup(int i){
		if (plateau[i].getNbBilles() != 0){
			int billes = plateau[i].getNbBilles();
			plateau[i].setNbBilles(0);
			int c = i;
			while (billes > 0){
				c = (c+1) % 12;
				plateau[c].setNbBilles(plateau[c].getNbBilles() +1);
				billes --;
			}
			if (plateau[c].getNbBilles() == 2){
				plateau[c].setNbBilles(0);
				main.ajouterGain(2);
				c = c-1;
				if (c==-1){
					c=11;
				}
				if (plateau[c].getNbBilles() == 2){
					plateau[c].setNbBilles(0);
					main.ajouterGain(2);
				}
				System.out.println(main + " : " + main.getGain() + " points\n");
			}


		}
	}
	
	public boolean finDePartie(){
		int somme = 0;
		for (Case c: plateau)
			somme +=c.getNbBilles();
		if (somme <=12)
			return true;
		return false;
	}
	
	public void jouer(){
		while(finDePartie() == false){
			choisirCase();
			changeJoueur();
			System.out.println(this);
		}
		System.out.println("Fin du jeu.\nScore final : \n" + tabJ[0] + " " + tabJ[0].getGain());
		System.out.println(tabJ[1] + " "+ tabJ[1].getGain());
	}
} 
