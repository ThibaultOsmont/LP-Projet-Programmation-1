package fr.iutnantes.lpsilappr.prog;

import java.util.ArrayList;
import java.util.List;

public class Accessoire extends Article{
	
	private List<Telephone> telephonesCompatibles;

	public Accessoire(int reference, String intitule, double prix) {
		super(reference, intitule, prix);
		this.telephonesCompatibles = new ArrayList<Telephone>();
	}
	
	public Accessoire(int reference, String intitule, double prix, List<Telephone> tels) {
		super(reference, intitule, prix);
		this.telephonesCompatibles = tels;
	}

	public List<Telephone> getTelephonesCompatibles() {
		return telephonesCompatibles;
	}

	public void setTelephonesCompatibles(List<Telephone> telephonesCompatibles) {
		this.telephonesCompatibles = telephonesCompatibles;
	}
}
