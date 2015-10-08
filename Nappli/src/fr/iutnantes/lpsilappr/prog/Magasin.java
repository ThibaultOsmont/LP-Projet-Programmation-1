package fr.iutnantes.lpsilappr.prog;

import fr.iutnantes.lpsilappr.prog.articles.*;
import java.util.*;

public class Magasin {
	public static void main(String[] args) {
		Chargeur c = new Chargeur(42, "chargeur", 2, Type.allumsig);
		System.out.println(c.getType());
		
	}
}
