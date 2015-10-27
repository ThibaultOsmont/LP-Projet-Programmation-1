package fr.iutnantes.lpsilappr.prog.controleurs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import fr.iutnantes.lpsilappr.prog.articles.Article;
import fr.iutnantes.lpsilappr.prog.articles.Chargeur;
import fr.iutnantes.lpsilappr.prog.articles.Coque;
import fr.iutnantes.lpsilappr.prog.articles.Cordon;
import fr.iutnantes.lpsilappr.prog.articles.Telephone;

public class MyListSelectionListener implements ListSelectionListener {

	private JFrame frame;
	private JLabel recup_intitule, recup_ref, recup_prix, recup_label2, recup_label3;

	public MyListSelectionListener(JFrame frame, JLabel recup_intitule, JLabel recup_ref, JLabel recup_prix,
			JLabel recup_label2, JLabel recup_label3) {
		super();
		this.frame = frame;
		this.recup_intitule = recup_intitule;
		this.recup_ref = recup_ref;
		this.recup_prix = recup_prix;
		this.recup_label2 = recup_label2;
		this.recup_label3 = recup_label3;
	}





	@Override
	public void valueChanged(ListSelectionEvent e) {
		JList listeArticles = (JList) e.getSource();
		Article a = (Article) listeArticles.getSelectedValue();

		try {
			recup_intitule.setText("Intitulé de l'article: "+a.getIntitule());
			recup_ref.setText("Référence: "+a.getReference()+"");
			recup_prix.setText("Prix: "+a.getPrix()+"€");
			if (a instanceof Chargeur) {
				Chargeur c = (Chargeur) listeArticles.getSelectedValue();
				recup_label2.setText("Téléphones Compatibles: "+c.getTelephonesCompatibles());
				recup_label3.setText("Type de chargeur :"+c.getType());
			}
			if(a instanceof Coque) {
				Coque c = (Coque) listeArticles.getSelectedValue();
				recup_label2.setText("Téléphones Compatibles: "+c.getTelephonesCompatibles());
				recup_label3.setText("Couleur :"+c.getCouleur());
			}
			if(a instanceof Cordon) {
				Cordon c = (Cordon) listeArticles.getSelectedValue();
				recup_label2.setText("Téléphones Compatibles: "+c.getTelephonesCompatibles());
				recup_label3.setText("Longueur :"+c.getLongueur());
			}
			if(a instanceof Telephone) {
				Telephone t = (Telephone) listeArticles.getSelectedValue();
				recup_label2.setText("Vendu par l'opérateur "+t.getOperateur());
			}
		}
		catch(NullPointerException ne) {}
	}

}
