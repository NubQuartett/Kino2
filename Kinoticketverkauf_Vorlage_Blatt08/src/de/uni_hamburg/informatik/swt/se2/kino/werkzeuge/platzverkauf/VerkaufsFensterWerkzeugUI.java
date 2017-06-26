package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.platzverkauf;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VerkaufsFensterWerkzeugUI extends JDialog {
	
	//private JDialog _frame;
	private JPanel _panel;
	
	//Buttons
	private JButton _buttonok;
	private JButton _buttonabbrechen;
	
	//Felder mit Beträgen
	private JLabel _betrag;
	private JTextField _bezahlt;
	private JTextField _wechselgeld;
	
	//Labels mit den Wörtern vor den Beträgen
	private JLabel _Lbetrag;
	private JLabel _Lbezahlt;
	private JLabel _Lwechselgeld;
	
	private JLabel _warnung;
	
	private Integer _preis;
	
	public VerkaufsFensterWerkzeugUI(JFrame Frame, ModalityType MT){
		super();
		
		
		//this.setModalityType(ModalityType.TOOLKIT_MODAL);
		
	}

	
	/*public VerkaufsFensterWerkzeugUI(Integer betrag){
		
		//_frame = new JDialog();
		this.setSize(450,300);
		_panel = new JPanel();
		_panel.setSize(300,200);
		_panel.setLayout(null);
		
		
		_buttonok = new JButton();
		_buttonok.setBounds(250,250,120,20);
		_buttonok.setText("OK");
		_buttonok.setEnabled(false);
		_panel.add(_buttonok);
		
		_buttonabbrechen = new JButton();
		_buttonabbrechen.setText("Abbrechen");
		_buttonabbrechen.setBounds(100,250,120,20);
		_panel.add(_buttonabbrechen);
		
		
		_Lbetrag = new JLabel();
		_Lbetrag.setBounds(100,30,100,20);
		_Lbetrag.setText("Betrag: ");
		_panel.add(_Lbetrag);
		
		_Lbezahlt =new JLabel();
		_Lbezahlt.setBounds(100,80,100,20);
		_Lbezahlt.setText("gegeben:");
		_panel.add(_Lbezahlt);
		
		_Lwechselgeld =new JLabel();
		_Lwechselgeld.setBounds(100,130,100,20);
		_Lwechselgeld.setText("Rückgeld:");
		_panel.add(_Lwechselgeld);

		_betrag  =new JLabel();
		_betrag.setText(betrag.toString());
		_betrag.setBounds(200,30,100,20);
		_panel.add(_betrag);
		
		_wechselgeld = new JTextField();
		_wechselgeld.setBounds(200,130,100,20);
		_panel.add(_wechselgeld);
		
		_bezahlt = new JTextField();
		_bezahlt.setBounds(200,80,100,20);
		_panel.add(_bezahlt);
		
		
		_warnung = new JLabel();
		_warnung.setBounds(100,200,300,40);
		_panel.add(_warnung);
		
		
		this.add(_panel);
		
		this.setVisible(true);
		this.setModalityType(ModalityType.TOOLKIT_MODAL);
		
		
		
	}*/
	
	public JTextField get_bezahlt(){
		return _bezahlt;
	}
	
	public JButton get_buttonok(){
		return _buttonok;
	}
	
	public JButton get_buttonabbrechen(){
		return _buttonabbrechen;
	}
	
	public JLabel get_betrag(){
		return _betrag;
	}
	
	public JTextField get_wechselgeld(){
		return _wechselgeld;
	}
	
	public JLabel get_warnung(){
		return _warnung;
	}
	
	public void close(){
		this.dispose();
	}
	
	public void set_betrag(int preis){
		_preis = preis;
		this.setSize(450,300);
		_panel = new JPanel();
		_panel.setSize(300,200);
		_panel.setLayout(null);
		
		
		_buttonok = new JButton();
		_buttonok.setBounds(250,250,120,20);
		_buttonok.setText("OK");
		_buttonok.setEnabled(false);
		_panel.add(_buttonok);
		
		_buttonabbrechen = new JButton();
		_buttonabbrechen.setText("Abbrechen");
		_buttonabbrechen.setBounds(100,250,120,20);
		_panel.add(_buttonabbrechen);
		
		
		_Lbetrag = new JLabel();
		_Lbetrag.setBounds(100,30,100,20);
		_Lbetrag.setText("Betrag: ");
		_panel.add(_Lbetrag);
		
		_Lbezahlt =new JLabel();
		_Lbezahlt.setBounds(100,80,100,20);
		_Lbezahlt.setText("gegeben:");
		_panel.add(_Lbezahlt);
		
		_Lwechselgeld =new JLabel();
		_Lwechselgeld.setBounds(100,130,100,20);
		_Lwechselgeld.setText("Rückgeld:");
		_panel.add(_Lwechselgeld);

		_betrag  =new JLabel();
		_betrag.setText(_preis.toString());
		_betrag.setBounds(200,30,100,20);
		_panel.add(_betrag);
		
		_wechselgeld = new JTextField();
		_wechselgeld.setBounds(200,130,100,20);
		_panel.add(_wechselgeld);
		
		_bezahlt = new JTextField();
		_bezahlt.setBounds(200,80,100,20);
		_panel.add(_bezahlt);
		
		
		_warnung = new JLabel();
		_warnung.setBounds(100,200,300,40);
		_panel.add(_warnung);
		
		
		this.add(_panel);
		
		this.setVisible(true);
	}
	
	


	
}
