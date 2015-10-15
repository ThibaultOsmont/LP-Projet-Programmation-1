package fr.iutnantes.lpsilappr.prog;

import fr.iutnantes.lpsilappr.prog.articles.*;
import javax.swing.*;


public class Magasin extends java.awt.Frame {
	public Magasin() {
	}
	
	/**
	 * generated serial uid 
	 */
	private static final long serialVersionUID = -5020553266812937903L;


	public static void main(String[] args) {
		Chargeur c = new Chargeur(42, "chargeur", 2, fr.iutnantes.lpsilappr.prog.articles.Type.allumsig);
		System.out.println(c.getType());
		
		ListeArticles arts = new ListeArticles();
		Coque vc = new Coque(422, "coque iphone 1000", 59, Couleur.red);
		
		arts.ajouterArticle(c);
		arts.ajouterArticle(vc);
		
		arts.sauvegarde();
	}
}
