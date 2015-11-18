package dessin;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends ObjetGraphique{
	java.awt.Rectangle rectangle;
	Color couleur;
	
	/**
	 * Constructeur de rectange vide.
	 */
	public Rectangle(){
	this.rectangle = new java.awt.Rectangle();
	}
	
	/**
	 * 
	 * Contructeur qui prend en paramètres une coordonnée (x et y) une largeur et une hauteur.
	 * @param x
	 * @param y
	 * @param largeur
	 * @param hauteur
	 */
	public Rectangle(int x, int y, int largeur, int hauteur){
		this.rectangle = new java.awt.Rectangle(x,y,largeur,hauteur);
	}
	
	/**
	 * Contructeur qui prend en paramètres un point une largeur et une hauteur.
	 * @param p
	 * @param largeur
	 * @param hauteur
	 */
	public Rectangle(Point p, int largeur, int hauteur){
		 this.rectangle = new java.awt.Rectangle(p.x, p.y, largeur, hauteur);
	}
	
    /**
     * Constructeur qui prend en paramètres un point, une largeur, une hauteur, ainsi qu'une couleur.
     * @param p
     * @param largeur
     * @param hauteur
     * @param c
     */
    public Rectangle(Point p, int largeur,int hauteur,Color c){
    	this.rectangle = new java.awt.Rectangle(p.x, p.y, largeur, hauteur);
    	this.couleur = c;
    }
	 
    @Override
    public void dessineToi(Graphics g){
    	g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

	@Override
	public boolean contient(int x, int y) {
		return false;
	}
    
}
