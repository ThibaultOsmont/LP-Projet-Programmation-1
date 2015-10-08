package fr.iutnantes.lpsilappr.prog;

public enum Type {
	secteur ("Secteur"),
	usb ("USB"),
	allumsig ("Allume-cigare");
	
	private String type = "";
	
	private Type(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}
