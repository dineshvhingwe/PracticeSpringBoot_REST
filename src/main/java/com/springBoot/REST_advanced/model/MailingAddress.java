package com.springBoot.REST_advanced.model;

public class MailingAddress 
{
	int PIN;
	String town;

	public MailingAddress(int pin, String town) 
	{
		this.PIN=pin;
		this.town=town;
	}
	public int getPIN() 
	{
		return PIN;
	}
	public void setPIN(int pIN) 
	{
		PIN = pIN;
	}
	public String getTown() 
	{
		return town;
	}
	public void setTown(String town) 
	{
		this.town = town;
	}

}
