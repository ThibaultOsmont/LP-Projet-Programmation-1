package fr.iutnantes.lpsilappr.prog.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JTextField;

public class BoutonCreationListener implements ActionListener {

	private JDialog dialog;
	
	private JTextField txf1, txf2, txf3, txf4, txf5;
	
	private String typeArticle;
	
	public BoutonCreationListener(JDialog dialog, JTextField txf1, JTextField txf2, JTextField txf3, JTextField txf4,
			JTextField txf5, String typeArticle) {
		super();
		this.dialog = dialog;
		this.txf1 = txf1;
		this.txf2 = txf2;
		this.txf3 = txf3;
		this.txf4 = txf4;
		this.txf5 = txf5;
		this.typeArticle = typeArticle;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		dialog.setVisible(false);
	}

}
