package fr.iutnantes.lpsilappr.prog.articles;

public enum TypeChargeur {
	secteur ("Secteur"),
	usb ("USB"),
	allumsig ("Allume-cigare");
	
	private String type = "";
	
	private TypeChargeur(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
