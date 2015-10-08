package fr.iutnantes.lpsilappr.prog.articles;

import java.util.List;

public class Chargeur extends Accessoire{

	private Type type;
	
	public Chargeur(int reference, String intitule, double prix, Type t) {
		super(reference, intitule, prix);
		this.setType(t);
	}
	
	public Chargeur(int reference, String intitule, double prix,
			List<Telephone> tels, Type t) {
		super(reference, intitule, prix, tels);
		this.setType(t);
	}
	
	public Chargeur(int reference, String intitule, double prix) {
		super(reference, intitule, prix);
		this.setType(Type.usb);
	}
	
	public Chargeur(int reference, String intitule, double prix,
			List<Telephone> tels) {
		super(reference, intitule, prix, tels);
		this.setType(Type.usb);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
