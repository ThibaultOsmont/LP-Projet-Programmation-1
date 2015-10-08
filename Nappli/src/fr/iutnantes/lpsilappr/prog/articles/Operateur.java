package fr.iutnantes.lpsilappr.prog.articles;

public enum Operateur {
	
	bouygues ("Bouygues Telecom"),
	sfr ("SFR"),
	free ("Free Mobile"),
	orange ("Orange");
	
	private String operateur = "";
	
	private Operateur(String op) {
		this.operateur = op;
	}
	
	public String toString() {
		return operateur;
	}
}
