package fr.iutnantes.lpsilappr.prog.articles;

import java.util.List;

public class Cordon extends Accessoire{

	//Longueur mesurée en centimètres
	private int longueur;
	
	public Cordon(int reference, String intitule, double prix, int longueur) {
		super(reference, intitule, prix);
		this.setLongueur(longueur);
	}
	
	public Cordon(int reference, String intitule, double prix,
			List<String> tels, int longueur) {
		super(reference, intitule, prix, tels);
		this.setLongueur(longueur);
	}
	
	public Cordon(int reference, String intitule, double prix) {
		super(reference, intitule, prix);
		this.setLongueur(50);
	}
	
	public Cordon(int reference, String intitule, double prix,
			List<String> tels) {
		super(reference, intitule, prix, tels);
		this.setLongueur(50);
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

}
