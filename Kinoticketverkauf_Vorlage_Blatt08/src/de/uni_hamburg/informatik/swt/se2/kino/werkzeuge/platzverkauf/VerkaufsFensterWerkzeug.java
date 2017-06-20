package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.platzverkauf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.ObservableSubwerkzeug;

public class VerkaufsFensterWerkzeug extends ObservableSubwerkzeug{

	private VerkaufsFensterWerkzeugUI _ui;
	private int _restbetrag;
	
	public VerkaufsFensterWerkzeug(int restbetrag){
		
		_ui = new VerkaufsFensterWerkzeugUI(restbetrag);
		registriereUIAktionen();
	}

	
	public void registriereUIAktionen(){
		_ui.get_bezahlt().addActionListener(new ActionListener(){

			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//zuerst testen, ob Zahlen eingegeben wurden
				/**
				 * TestTest
				 */
				try{
					int betrag = Integer.valueOf(_ui.get_bezahlt().getText());
					System.out.println(betrag);
					Integer wechsel = betrag - Integer.valueOf(_ui.get_betrag().getText());
					System.out.println(wechsel);
					_ui.get_wechselgeld().setText(wechsel.toString());
					_ui.get_warnung().setText("");
					if(wechsel >0){
						_ui.get_buttonok().setEnabled(true); 
					}else{
						_ui.get_buttonok().setEnabled(false);
					}
				}catch(Exception e){
					_ui.get_warnung().setText("Geben Sie als Preis bitte eine Zahl ein.");
				}
				
			}
			
			
			
		});
		
		
		
		_ui.get_buttonok().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				informiereUeberAenderung();
				_ui.close();
			}
			
		});	
		
		_ui.get_buttonabbrechen().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				_ui.close();
			}
		});
		
		
	}
	
	public int getRestbetrag(){
		return _restbetrag;
	}
	
	public JButton get_buttonok(){
		return _ui.get_buttonok();
	}
	
	public JButton get_buttonabbrechen(){
		return _ui.get_buttonabbrechen();
	}
	
	
}
