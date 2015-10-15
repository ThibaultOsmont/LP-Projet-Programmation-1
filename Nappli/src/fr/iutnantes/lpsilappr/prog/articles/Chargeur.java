package fr.iutnantes.lpsilappr.prog.articles;

import java.util.List;

public class Chargeur extends Accessoire{

	private TypeChargeur type;
	
	public Chargeur(int reference, String intitule, double prix, TypeChargeur t) {
		super(reference, intitule, prix);
		this.setType(t);
	}
	
	public Chargeur(int reference, String intitule, double prix,
			List<String> tels, TypeChargeur t) {
		super(reference, intitule, prix, tels);
		this.setType(t);
	}
	
	public Chargeur(int reference, String intitule, double prix) {
		super(reference, intitule, prix);
		this.setType(TypeChargeur.usb);
	}
	
	public Chargeur(int reference, String intitule, double prix,
			List<String> tels) {
		super(reference, intitule, prix, tels);
		this.setType(TypeChargeur.usb);
	}

	public TypeChargeur getType() {
		return type;
	}

	public void setType(TypeChargeur type) {
		this.type = type;
	}
	/*
	@Override
	public String toString() {
		return (super.toString()
				+"\nType du chargeur: "+type);
	}*/

}
