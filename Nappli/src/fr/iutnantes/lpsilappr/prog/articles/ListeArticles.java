package fr.iutnantes.lpsilappr.prog.articles;

import java.util.List;
import java.util.ArrayList;


public class ListeArticles {
	
	private List<Article> articles;
	
	public ListeArticles() {
		this.setArticles(new ArrayList<Article>());
	}
	
	public ListeArticles(ArrayList<Article> liste) {
		this.setArticles(liste);
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	public boolean ajouterArticle(Article a) {
		return articles.add(a);
	}
	
	public Article supprimerArticle(int index) {
		return articles.remove(index);
	}
	
	public boolean supprimerArticle(Article a) {
		return articles.remove(a);
	}
	
	public void tousLesArticles_ParRef() {
		
	}
}
