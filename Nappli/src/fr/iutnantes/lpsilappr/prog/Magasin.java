package fr.iutnantes.lpsilappr.prog;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import fr.iutnantes.lpsilappr.prog.articles.Article;
import fr.iutnantes.lpsilappr.prog.articles.Chargeur;
import fr.iutnantes.lpsilappr.prog.articles.ListeArticles;
import fr.iutnantes.lpsilappr.prog.articles.Operateur;
import fr.iutnantes.lpsilappr.prog.articles.Telephone;
import fr.iutnantes.lpsilappr.prog.articles.TypeChargeur;
import fr.iutnantes.lpsilappr.prog.controleurs.MyActionListener;
import fr.iutnantes.lpsilappr.prog.controleurs.MyItemListener;
import fr.iutnantes.lpsilappr.prog.controleurs.MyListSelectionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Magasin {

	/**
	 * Composants soumis à modifications 
	 */
	private ListeArticles articles = new ListeArticles();
	private JFrame frame;
	private JComboBox<Object> methodeTriArticles;
	private JList<Object> listeArticles;
	private JLabel ref;
	private JLabel intitule;
	private JLabel prix;
	private JLabel label_2;
	private JLabel label_3;

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
		this.methodeTriArticles = new JComboBox<Object>(methodeTri.toArray());
		methodeTriArticles.setBounds(12, 43, 120, 22);
		
		
		/*
		 * label méthode de tri des articles
		 */ 
		JLabel triArticles = new JLabel("Trier articles selon");
		triArticles.setBounds(12, 13, 113, 16);
		
		this.listeArticles = new JList<Object>(articles.getArticles().toArray());
		listeArticles.setBounds(470, 12, 300, 500);
		
		ref = new JLabel("");
		ref.setBounds(12, 115, 308, 16);
		
		this.intitule = new JLabel("");
		this.intitule.setBounds(12, 144, 308, 16);
		
		this.prix = new JLabel("");
		this.prix.setBounds(12, 178, 308, 16);

		label_2 = new JLabel("");
		label_2.setBounds(12, 217, 308, 16);		
		
		label_3 = new JLabel("");
		label_3.setBounds(12, 264, 308, 16);
		
		JButton btnAjouterUnArticle = new JButton("Ajouter un article");
		btnAjouterUnArticle.setBounds(223, 42, 131, 25);
		
		/*
		 * Ajout des controleurs
		 */
		methodeTriArticles.addItemListener(new MyItemListener(this, methodeTriArticles, listeArticles, articles.getArticles()));
		listeArticles.addListSelectionListener(new MyListSelectionListener(frame, intitule, ref, prix, label_2, label_3));
		btnAjouterUnArticle.addActionListener(new MyActionListener());
		
		/*
		 * Ajout de tous les composants dans la fenetre
		 */
		frame.getContentPane().add(methodeTriArticles);
		frame.getContentPane().add(triArticles);
		frame.getContentPane().add(listeArticles);
		frame.getContentPane().add(this.ref);
		frame.getContentPane().add(this.intitule);
		frame.getContentPane().add(this.prix);
		frame.getContentPane().add(label_2);
		frame.getContentPane().add(label_3);
		frame.getContentPane().add(btnAjouterUnArticle);
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
	
	public void changeTriArticles(String newItemSelected, List<Article> articlesSorted) {
		methodeTriArticles.setSelectedItem(newItemSelected);
		listeArticles.setListData(articlesSorted.toArray());
	}
}
