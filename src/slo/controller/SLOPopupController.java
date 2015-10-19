package slo.controller;

import slo.input.view.PopupDisplay;


public class SLOPopupController 
{
	private PopupDisplay myPopups;
	
	
	public SLOPopupController ()
	{
		myPopups = new PopupDisplay();
	}
	public void start()
	{
		String temp = myPopups.grabAnswer("Type in your favorite number");
		int myNumber = Integer.parseInt(temp);
		myPopups.showResponse("You typed in " + myNumber);
		
		String tempDecimalnumber = myPopups.grabAnswer("Type in your favorite decimal number");
		double myDecimalnumber = Double.parseDouble(tempDecimalnumber);
		myPopups.showResponse("You typed in " + myDecimalnumber);
		
		boolean isbigger = myNumber > myDecimalnumber;
		
		if (isbigger)
		{
			myPopups.showResponse("it's smaller");
		}
		else
		{
			myPopups.showResponse("It's bigger");
		}
	}
	
	

}
