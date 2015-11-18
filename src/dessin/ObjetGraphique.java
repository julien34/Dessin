package dessin;
import java.awt.Color;
import java.awt.Graphics;

public abstract class ObjetGraphique {
	
	private Color couleur;
	
	
	/**
	 * Constructeur vide par defaut qui initialise un ObjetGraphique de couleur noire (sans paramètres).
	 */
	public ObjetGraphique(){
		this.couleur = Color.BLACK;
	}
	
	/**
	 * Constructeur qui initialise un ObjetGraphique en prenant en paramètre la couleur de ce dernier.
	 * @param c
	 */
	public ObjetGraphique(Color c){
		this.couleur = c;
	}
	
	/**
	 * Méthode qui retourne l'attribut privé couleur.
	 * @return couleur
	 */
	public Color getColor(){
		return this.couleur;
	}
	
	/**
	 * Méthode qui modifie l'attribut couleur.
	 * @param c
	 */
	public void setColor(Color c){
		this.couleur = c;
	}
	
	public abstract void dessineToi(Graphics g);
	
	public abstract boolean contient(int x, int y);
}
