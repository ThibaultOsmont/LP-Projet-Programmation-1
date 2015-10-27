package fr.iutnantes.lpsilappr.prog.controleurs;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JList;

import fr.iutnantes.lpsilappr.prog.Magasin;
import fr.iutnantes.lpsilappr.prog.articles.Article;
import fr.iutnantes.lpsilappr.prog.articles.comparateur.Comparateur;

public class MyItemListener implements ItemListener {
	
	private Magasin mag;
	private JComboBox methodeTriArt;
	private JList<Object> listeArticles;
	private List<Article> articles;
	
	public MyItemListener(Magasin m,JComboBox<Object> box, JList<Object> art, List<Article> list) {
		mag = m;
		methodeTriArt = box;
		listeArticles = art;
		articles = list;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(methodeTriArt.getSelectedItem().toString().equalsIgnoreCase("Par Intitulé")) {
			articles.sort(Comparateur.INTITULE);
		}
		else if(methodeTriArt.getSelectedItem().toString().equalsIgnoreCase("Par Référence")) {
			articles.sort(Comparateur.REF);
		}
		if(methodeTriArt.getSelectedItem().toString().equalsIgnoreCase("Par Prix")) {
			articles.sort(Comparateur.PRIX);
		}
		
		mag.changeTriArticles(e.getItem().toString(), articles);
		
	}

}
