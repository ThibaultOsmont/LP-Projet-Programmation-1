package fr.iutnantes.lpsilappr.prog.articles;

import fr.iutnantes.lpsilappr.prog.articles.comparateur.Comparateur;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static java.util.Comparator.comparing;

import java.io.FileWriter;
import java.io.IOException;

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
		//Tri de la liste d'articles: cetteméthode ne renvoie rien mais
		//trie directement laliste existante
		Collections.sort(articles, Comparateur.REF);
		
		for(Article art:articles) {
			System.out.println(art+"\n");
		}
	}
	
	public void tousLesArticles_ParIntitule() {
		Collections.sort(articles, Comparateur.INTITULE);
		
		for(Article art:articles) {
			System.out.println(art+"\n");
		}
	}
	
	public void tousLesArticles_ParPrix(){
		Collections.sort(articles, Comparateur.PRIX);
		
		for(Article art:articles) {
			System.out.println(art+"\n");
		}
	}
	
	public boolean isEmpty() {
		return articles.isEmpty();
	}
	
	public void sauvegarde() {
		try {

			FileWriter fw = new FileWriter("C:/Users/Thibault/Desktop/Articles Sauvegardés.txt");
			Iterator<Article> it = articles.iterator();
			
			while(it.hasNext()) {
				fw.write(it.next().toString());
				if(it.hasNext()) fw.write("\n\n");
			}
			fw.close();

		} catch (IOException e) {
			System.out.println("Pour fonctionner, Le fichier portant exactement ce nom: \"Articles Sauvegardés.txt\" doit être créé dans le répertoire indiqué dans la trace de la pile ci-dessous.");
			e.printStackTrace();
		}
	}
}
