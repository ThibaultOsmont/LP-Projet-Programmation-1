package fr.iutnantes.lpsilappr.prog.controleurs;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyItemListenerDialog implements ItemListener {

	private JTextField recup_txf1, recup_txf2;
	private JLabel label1, label2;
	private MyActionListener ctrlr;
	
	public MyItemListenerDialog(MyActionListener ctrlr, JTextField recup_txf1, JTextField recup_txf2, JLabel label1, JLabel label2) {
		super();
		this.recup_txf1 = recup_txf1;
		this.recup_txf2 = recup_txf2;
		this.label1 = label1;
		this.label2 = label2;
		this.ctrlr = ctrlr;
	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		JComboBox jcb = (JComboBox) e.getSource();
		if(jcb.getSelectedItem().toString().equalsIgnoreCase("Chargeur")) {
			recup_txf1.setVisible(true);
			recup_txf2.setVisible(true);
			label1.setText("Téléphones Compatibles");
			label2.setText("Type de Chargeur");
			ctrlr.createObject("chargeur");
		}
		if(jcb.getSelectedItem().toString().equalsIgnoreCase("Coque")) {
			recup_txf1.setVisible(true);
			recup_txf2.setVisible(true);
			label1.setText("Téléphones Compatibles");
			label2.setText("Couleur");
			ctrlr.createObject("coque");
		}
		if(jcb.getSelectedItem().toString().equalsIgnoreCase("Cordon")) {
			recup_txf1.setVisible(true);
			recup_txf2.setVisible(true);
			label1.setText("Téléphones Compatibles");
			label2.setText("Longueur: ");
			ctrlr.createObject("cordon");
		}
		if(jcb.getSelectedItem().toString().equalsIgnoreCase("Téléphone")) {
			recup_txf1.setVisible(true);
			recup_txf2.setVisible(false);
			label1.setText("Opérateur");
			label2.setText("");
			ctrlr.createObject("telephone");
		}
	}

}
