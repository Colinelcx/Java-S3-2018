public class TestJeuVie {
	public static void main(String[] args){
		Monde m = new Monde(50, 50, 0.2);
		System.out.println(m);
		int c = m.nbVoisins(5,2);
		System.out.println("Nombre de voisins: " +c);
		for (int i=0; i<100; i++){
			m.genSuiv();
			System.out.println(m);
			try {Thread.sleep(150);} // temporisation en ms      
 			catch(InterruptedException e){
    			e.printStackTrace();
 			}
		}
		
	}
}
