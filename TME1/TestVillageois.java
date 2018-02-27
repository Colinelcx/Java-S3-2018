public class TestVillageois{
	public static void main(String[] args){
		Villageois v1 = new Villageois("Carole");
		Villageois v2 = new Villageois("Carlos");
		Villageois v3 = new Villageois("Stanislas");
		Villageois v4 = new Villageois("Alistair");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		double poidsTotal = v1.poidsSouleve() + v2.poidsSouleve() + v3.poidsSouleve() + v4.poidsSouleve();
		System.out.println("Poid total soulevé : " +  String.format("%1$,.2f",poidsTotal));
		if (poidsTotal>=100){
			System.out.println("Les villageois ont réussi à soulever le rocher");
		}
		else {
			System.out.println("Les villageois n'ont pas réussi à soulever le rocher");
		}
	}
}
