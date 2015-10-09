package fr.iutnantes.lpsilappr.prog.articles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Accessoire extends Article{
	
	private List<String> telephonesCompatibles;

	public Accessoire(int reference, String intitule, double prix) {
		super(reference, intitule, prix);
		this.telephonesCompatibles = new ArrayList<String>();
	}
	
	public Accessoire(int reference, String intitule, double prix, List<String> tels) {
		super(reference, intitule, prix);
		this.telephonesCompatibles = tels;
	}

	public List<String> getTelephonesCompatibles() {
		return telephonesCompatibles;
	}

	public void setTelephonesCompatibles(List<String> telephonesCompatibles) {
		this.telephonesCompatibles = telephonesCompatibles;
	}
	
	@Override
	public String toString() {
		String telCompatibles = "";
		Iterator<String> it = telephonesCompatibles.iterator();
		
		while(it.hasNext()) {
			telCompatibles += it.next();
			if(it.hasNext())
				telCompatibles += ", ";
		}
		
		return (super.toString() + telCompatibles);
	}
}
