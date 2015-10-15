package fr.iutnantes.lpsilappr.prog.articles.comparateur;

import java.util.Comparator;

import fr.iutnantes.lpsilappr.prog.articles.Article;



public abstract class Comparateur {

	public static final Comparator<Article> PRIX = new Comparator<Article>() {
		@Override
		public int compare(Article a1, Article a2) {
			return	((Double)a1.getPrix()).compareTo(a2.getPrix());
		}
	};
	
	public static final Comparator<Article> INTITULE = new Comparator<Article>() {
		@Override
		public int compare(Article a1, Article a2) {
			return ((String)a1.getIntitule()).compareTo(a2.getIntitule());
		}
	};

	public static final Comparator<Article> REF = new Comparator<Article>() {
		@Override
		public int compare(Article a1, Article a2) {
			return ((String)a1.getIntitule()).compareTo(a2.getIntitule());
		}
	};
}
