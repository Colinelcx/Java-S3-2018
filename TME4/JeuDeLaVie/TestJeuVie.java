import java.awt.Color;

public class TestJeuVie {
	public static void main(String[] args){
		int x = 400, y = 300; // taille de la fenetre
        SimpleInterface ui = new SimpleInterface("Jeu de la Vie",x,y); // fenetre

		Monde m = new Monde(20, 20, 0.2); //Création d'un monde
		
		System.out.println(m);
		int c = m.nbVoisins(3,5);
		System.out.println("Nombre de voisins: " +c);

		ui.createArea( m.getH(), m.getL()); // creation de l'image dans l'interface
        ui.refresh();

		//Boucle de générations
		for (int t=0; t<100; t++){
			try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
			m.genSuiv(); //passage à la génération suivante
			for (int i=0;i<m.getH();i++){
                for (int j=0;j<m.getL();j++){
                    if(m.get(i,j))
                        ui.setRGB(i, j, Color.RED);
                    else
                        ui.setRGB(i, j, Color.WHITE);
                }
            	ui.refresh();
        	}
		}
	}
}