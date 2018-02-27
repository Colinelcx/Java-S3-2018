public class Test {
	public static void main(String[] args){
		Emplacement emplacement = new Emplacement("emplacement 1");
		Carte carte = new Carte();
		System.out.println(emplacement);
		if (emplacement.poser(carte) == true){
			System.out.println(emplacement);
		}
		
		Carte carteD = new Carte("Dame");
		Emplacement emplacementD = new Emplacement("emplacement 2", carteD);
		System.out.println(emplacementD);
		if (emplacementD.poser(carte) == true){
			System.out.println("Erreur " + emplacementD);
		}
		
		System.out.println("carte enlevée : " + emplacement.enlever());
		System.out.println(emplacement);
	}
}
