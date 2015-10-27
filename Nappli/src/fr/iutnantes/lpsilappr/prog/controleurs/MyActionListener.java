package fr.iutnantes.lpsilappr.prog.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyActionListener implements ActionListener {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private String object;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane jop = new JOptionPane();
		String art[] = {"Chargeur", "Coque", "Cordon", "Téléphone"};
		JDialog jd = new JDialog();
		jd.setBounds(200, 200, 200, 200);
		jd.setSize(500,300);
		jd.setLayout(null);
		jd.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		jd.setTitle("Créer un nouvel article");
		
		JLabel lblTypeDuNouvel = new JLabel("Type du nouvel article");
		lblTypeDuNouvel.setBounds(12, 13, 137, 16);
		jd.getContentPane().add(lblTypeDuNouvel);
		
		JComboBox comboBox = new JComboBox(art);
		comboBox.setBounds(12, 51, 131, 22);
		jd.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(293, 41, 116, 22);
		jd.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(293, 76, 116, 22);
		jd.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(293, 111, 116, 22);
		jd.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(293, 146, 116, 22);
		textField_3.setVisible(false);
		jd.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(293, 184, 116, 22);
		textField_4.setVisible(false);
		jd.getContentPane().add(textField_4);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence");
		lblRfrence.setBounds(218, 44, 73, 16);
		jd.getContentPane().add(lblRfrence);
		
		JLabel label = new JLabel("Intitul\u00E9");
		label.setBounds(242, 79, 39, 16);
		jd.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Prix");
		label_1.setBounds(250, 114, 31, 16);
		jd.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u20AC");
		label_2.setBounds(415, 114, 17, 16);
		jd.getContentPane().add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(225, 149, 56, 16);
		jd.getContentPane().add(lblNewLabel);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(225, 187, 56, 16);
		
		comboBox.addItemListener(new MyItemListenerDialog(this, textField_3, textField_4, lblNewLabel, label_3));
		
		jd.getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("Cr\u00E9er");
		btnNewButton.setBounds(25, 130, 97, 25);
		btnNewButton.addActionListener(new BoutonCreationListener(jd, textField, textField_1, textField_2, textField_3, textField_4, object));
		
		jd.getContentPane().add(btnNewButton);
		
		jd.setVisible(true);
	}
	
	public void createObject(String newObject) {
		this.object = newObject;
	}

}
