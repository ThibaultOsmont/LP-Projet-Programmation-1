package fr.iutnantes.lpsilappr.prog;

import fr.iutnantes.lpsilappr.prog.articles.*;
import java.util.*;

public class Magasin {
	public static void main(String[] args) {
		Chargeur c = new Chargeur(42, "chargeur", 2, Type.allumsig);
		System.out.println(c.getType());
		
		ListeArticles arts = new ListeArticles();
		Coque vc = new Coque(422, "coque iphone 1000", 59, Couleur.red);
		
		arts.ajouterArticle(c);
		arts.ajouterArticle(vc);
		
		arts.sauvegarde();
	}
}
