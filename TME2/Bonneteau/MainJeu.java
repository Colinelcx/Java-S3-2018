public class MainJeu {
	public static void main(String[] args){
		float victoire = 0;
		
		for (int i=0; i<1000; i++){
			Jeu jeu = new Jeu();
			System.out.println(jeu + "\n");
			jeu.melanger(100);
			System.out.println(jeu + "\n");
			int choix = (int)(Math.random()*3);
			System.out.println("choix : " + choix);
			if (jeu.choisir(choix)){
				victoire ++;
				System.out.println("Vous avez gagné !");
			}
			else {
				System.out.println("Vous avez perdu");
			}
		}
		System.out.println("Nombre moyen de victoires : " + victoire/10 + "%");
	}
}

/*
 * Réponse aux questions :
 * 
 * 7) Le programme gagne en moyenne entre 30 et 35% des parties
 * 
 * 8) Déclarer en privée les variables d'instances permet de ne pas pouvoir y accéder dans le main
 * et donc éviter la triche.
 * Si les variables étaient publiques, on pourrait accéder à jeu.gauche.carte, jeu.milieu.carte et jeu.droit.carte
 * et ainsi retrouver la cible, ce qui est de la triche.
 * */
