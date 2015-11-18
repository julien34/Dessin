package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public class Cercle extends ObjetGraphique{
	
	private int x, y, rayon;
	private Color couleur;
	
    /**
     * Constructeur avec un point (x,y) et un rayon.
     * @param centre
     * @param rayon
     */
    public Cercle(Point centre,int rayon){
    	this.x = centre.x;
    	this.y = centre.y;
    	this.rayon = rayon;
    }
    
    /**
     * Constructeur avec un point (x,y), un rayon ainsi qu'une couleur.
     * @param centre
     * @param rayon
     * @param couleur
     */
    public Cercle(Point centre, int rayon, Color couleur){
    	this(centre,rayon);
    	this.couleur = couleur;
    }
	
	@Override
	public void dessineToi(Graphics g) {
		g.drawOval(this.x-this.rayon,this.y-this.rayon,this.rayon*2,this.rayon*2);
		
	}

	@Override
	public boolean contient(int x, int y) {
		if(( ( (x-this.x)*(x-this.x) )+( (y-this.y)*(y-this.y) ) <= this.rayon)){
			return true;
		}
		else {
			return false;
		}
	}
	
}
