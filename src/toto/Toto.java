package toto;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toto extends javax.swing.JFrame {
	
	public Toto(){
		
		
		TotoJPanel monPanneau = new TotoJPanel();
		this.add(monPanneau);
		
		
		//On créer un nouveau panel qui recevra les boutons :
		JPanel monPanneauBoutton = new JPanel();
		
		//On ajoute les boutons au pannel :
		JButton boutonC1 = new JButton("Cercle 1");
		monPanneauBoutton.add(boutonC1);

		
		JButton boutonC2 = new JButton("Cercle 2");
		monPanneauBoutton.add(boutonC2);

		
		JButton boutonC3 = new JButton("Cercle 3");
		monPanneauBoutton.add(boutonC3);

		
		JButton boutonR1 = new JButton("Rectangle");
		monPanneauBoutton.add(boutonR1);
		this.add(monPanneauBoutton,BorderLayout.NORTH);
	}
	
	
	public static void main(String args[]){
		Toto test = new Toto();
		
		test.setSize(500, 500);
		test.setVisible(true);
	}
	
}
