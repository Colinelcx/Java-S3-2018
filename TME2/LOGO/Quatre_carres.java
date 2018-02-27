import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Quatre_carres {
	public static void main (String[] args){
		// Construction d'une image 400x400
        int nColonnes = 400;
        int nLignes = 400;
        BufferedImage im = // objet image en mémoire
                new BufferedImage(nColonnes, nLignes, BufferedImage.TYPE_INT_ARGB);

        // mise au bleu de tous les pixels pour mieux voir
        for(int i=0; i<im.getWidth();i++)
            for(int j=0; j<im.getHeight();j++)
                im.setRGB(i, j, Color.blue.getRGB()); // mettre le pixel (i,j) en bleu

        // récupération d'un stylo pour écrire dans l'image
        Graphics g = im.getGraphics();

        // création de la tortue
        Tortue t = new Tortue(g, 200, 200); // direction initiale (1,0)
		
		
		//Céation des carrés
        t.baisserStylo();
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                t.avancer(199);
				t.rotation(Math.PI/2);
			}
            t.rotation(3*Math.PI/2);		}
		
		
	// Sauver l'image dans un fichier
        try {
            File outputfile = new File("4_carrés.png");
            ImageIO.write(im, "png", outputfile);
         } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde");
         }
	}
}
