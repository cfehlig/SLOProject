package slo.model;

public class SLOThingy 
{
	private int number;
	private double decimalnumber;
	
	public SLOThingy()
	{
		number = -99;
		decimalnumber = -.009;		
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public double getDecimalnumber()
	{
		return decimalnumber;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void setDecimalnumber(double decimalnumber)
	{
		this.decimalnumber = decimalnumber;
	}
	
}
