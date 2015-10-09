package fr.iutnantes.lpsilappr.prog.articles;

import java.util.List;

public class Coque extends Accessoire{

	private Couleur couleur;
	
	public Coque(int reference, String intitule, double prix, Couleur couleur) {
		super(reference, intitule, prix);
		this.couleur = couleur;
	}
	
	public Coque(int reference, String intitule, double prix,
			List<String> tels, Couleur couleur) {
		super(reference, intitule, prix, tels);
		this.couleur = couleur;
	}
	
	public Coque(int reference, String intitule, double prix) {
		super(reference, intitule, prix);
		this.couleur = Couleur.black;
	}
	
	public Coque(int reference, String intitule, double prix,
			List<String> tels) {
		super(reference, intitule, prix, tels);
		this.couleur = Couleur.black;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		return(super.toString()
				+"\nCouleur: "+couleur);
	}
}
