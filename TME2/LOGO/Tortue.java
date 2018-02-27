import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Tortue{
	private Vecteur position, direction;
	boolean draw;
	Graphics g;

	public Tortue(Graphics g){
		this.g = g;
		position = new Vecteur(200, 200);
		direction = new Vecteur(1,0);
		draw = true;
	}
    
    public Tortue(Graphics g, int posx, int posy){
        this.g = g;
        position = new Vecteur(posx, posy);
        direction = new Vecteur(1,0);
        draw = true;
    }

	public void leverStylo(){
		draw = false;
	}

	public void baisserStylo(){
		draw = true;
	}

	public void avancer(int lg){
		for (int i=0; i<lg; i++){
			position = position.addGen(direction);
			if (draw == true){
				g.drawLine((int) position.getX(), (int) position.getY(), (int) position.getX(), (int) position.getY());
			}
		}
	}

	public void rotation(double theta){
		direction = direction.rotation(theta);
	}

}
