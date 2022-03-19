package com.sgtesting.advancedscenarios;

import org.apache.log4j.Logger;

public class SampleDemo 
{
	public static void main(String[] args) 
	{
		getlogs();
	}
	private static Logger log = Logger.getLogger("Loop Output");
	private static void getlogs()
	{
		log.info("For Loop Excecution Started here...");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				log.info("Even Number: "+i);
			}
		}
		log.info("For Loop Excecution ended here...");
	}
}
