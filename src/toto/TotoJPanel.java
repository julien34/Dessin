package toto;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import dessin.Cercle;
import dessin.ObjetGraphique;
import dessin.Rectangle;

public class TotoJPanel extends javax.swing.JPanel{
	ArrayList<dessin.ObjetGraphique> listeDObjets = new ArrayList<dessin.ObjetGraphique>();
	
	public TotoJPanel(){
		
		//Pour créer un point
		Point p = new Point(200,200);
		//On créer un Cercle avec comme attribut le point créé précédement
		Cercle cercle1 = new Cercle(p,100);
		
		Point p2 = new Point(160,150);
		Cercle cercle2 = new Cercle(p2,20);
		
		Point p3 = new Point(240,150);
		Cercle cercle3 = new Cercle(p3,20);
		
		Rectangle rectangle1 = new Rectangle(150,220,100,40);
		
		//On ajoute tous les objets à l'ArrayList :
		this.listeDObjets.add(cercle1);
		this.listeDObjets.add(cercle2);
		this.listeDObjets.add(cercle3);
		this.listeDObjets.add(rectangle1);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (ObjetGraphique objetGraphique : listeDObjets) {
			
			objetGraphique.dessineToi(g);
		}
	}
	
	private void afficheEnleve(String s, ObjetGraphique o){
		
	}
	
	
}
