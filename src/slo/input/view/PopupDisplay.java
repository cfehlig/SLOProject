package slo.input.view;

import javax.swing.JOptionPane;

public class PopupDisplay 
{
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer ="";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}

}
