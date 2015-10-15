package fr.iutnantes.lpsilappr.prog.articles;

public class Telephone extends Article{

	private Operateur operateur;
	
	public Telephone(Operateur operateur, int reference, String intitule, double prix) {
		super(reference, intitule, prix);
		this.operateur = operateur;
	}

	public String getOperateur() {
		return operateur.toString();
	}

	public void setOperateur(Operateur operateur) {
		this.operateur = operateur;
	}

	/*@Override
	public String toString() {
		return (super.toString()
				+"\nVendu par l'opérateur "+operateur);
	}*/
}
