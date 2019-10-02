package com.brajesh.mocker;

import java.util.ArrayList;
import java.util.List;

import com.brajesh.dataobject.Cricketer;

public class MockedCricketStats {
	private static List<Cricketer> cricketStatInstance = null;
	
	
	
	
	
	
	
	public static List<Cricketer> getFootballInstance ()
	{
		if(cricketStatInstance == null)
		{   cricketStatInstance = new ArrayList<Cricketer> ();
			initializeCricketerStat(cricketStatInstance);
			return cricketStatInstance;
		}	
		return cricketStatInstance;
	}
	
	private static void initializeCricketerStat(List<Cricketer> cricketStatInstance2) {
		// TODO Auto-generated method stub
		
		cricketStatInstance.add(new Cricketer("Sachin Tendulukar", 463, 18426, 154));
		cricketStatInstance.add(new Cricketer("Ricky Ponting", 375, 13704, 3));
		cricketStatInstance.add(new Cricketer("Brain Lara",299,10405,4));
		
	}

	//Default Constructor
	private  MockedCricketStats() {
		
	}
	
	//Parametrized Contructor
	/*
	 * public MockedCricketStats (String name , int matches , int runs ,int wickets)
	 * {
	 * 
	 * Cricketer cricketer = new Cricketer(); cricketer.setName(name);
	 * cricketer.setMatches(matches); cricketer.setRuns(runs);
	 * cricketer.setWickets(wickets);
	 * 
	 * 
	 * }
	 */

	

	public Cricketer search(String name2) {
		// TODO Auto-generated method stub
		
		for(Cricketer crick : cricketStatInstance)
		{
			if(crick.getName().equals(name2))
				return crick;
		}
		return null;
	}
	
	
	
	
	
	

}
