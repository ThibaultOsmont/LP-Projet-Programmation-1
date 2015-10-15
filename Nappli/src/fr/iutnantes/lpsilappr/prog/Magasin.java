package fr.iutnantes.lpsilappr.prog;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import fr.iutnantes.lpsilappr.prog.articles.Chargeur;
import fr.iutnantes.lpsilappr.prog.articles.ListeArticles;
import fr.iutnantes.lpsilappr.prog.articles.Operateur;
import fr.iutnantes.lpsilappr.prog.articles.Telephone;
import fr.iutnantes.lpsilappr.prog.articles.TypeChargeur;
import javax.swing.JList;

public class Magasin {

	private ListeArticles articles = new ListeArticles();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Magasin window = new Magasin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Magasin() {
		creerArticles();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(new Dimension(800,600));
		frame.setTitle("Nappli - Nantélécom");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		ArrayList<String> methodeTri = new ArrayList<String>();
		methodeTri.add("Par intitulé");
		methodeTri.add("Par référence");
		methodeTri.add("Par prix");
		
		
		/*
		 * liste des articles triés
		 */
		JComboBox<Object> listeDesArticles = new JComboBox<Object>(methodeTri.toArray());
		listeDesArticles.setBounds(12, 43, 120, 22);
		frame.getContentPane().add(listeDesArticles);
		
		/*
		 * label méthode de tri des articles
		 */ 
		JLabel triArticles = new JLabel("Trier articles selon");
		triArticles.setBounds(12, 13, 113, 16);
		frame.getContentPane().add(triArticles);
		
		JList<Object> list = new JList<Object>(articles.getArticles().toArray());
		list.setBounds(309, 78, 1, 1);
		frame.getContentPane().add(list);
		
	}
	
	/*
	 * Génération des articles
	 */
	public void creerArticles(){
		
		/*
		 * Création des téléphones
		 */
		Telephone t1 = new Telephone(Operateur.bouygues, 020103, "iPhone 4S", 299.0);
		Telephone t2 = new Telephone(Operateur.free, 020203, "iPhone 5S", 499.0);
		Telephone t3 = new Telephone(Operateur.sfr, 030103, "iPhone 6S", 799.0);
		
		/*
		 * Création de la liste des téléphones compatibles pour chaque chargeur
		 */
		ArrayList<String> telsCompatiblesC1 = new ArrayList<String>();
		telsCompatiblesC1.add(t2.getIntitule());
		telsCompatiblesC1.add(t3.getIntitule());
		
		ArrayList<String> telsCompatiblesC2 = new ArrayList<String>();
		telsCompatiblesC2.add(t1.getIntitule());
		
		/*
		 * Création des chargeurs
		 */
		Chargeur c1 = new Chargeur(00001, "Chargeur iPhone Lightning", 25.99, telsCompatiblesC1, TypeChargeur.usb);
		Chargeur c2 = new Chargeur(00002, "Chargeur iPhone 30 broches", 21.99, telsCompatiblesC2, TypeChargeur.usb);
		
		/*
		 * Ajout des articles créés à la liste d'articles
		 */
		articles.ajouterArticle(t1);
		articles.ajouterArticle(t2);
		articles.ajouterArticle(t3);
		articles.ajouterArticle(c1);
		articles.ajouterArticle(c2);
	}
}
