package com.brajesh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brajesh.dataobject.Cricketer;
import com.brajesh.mocker.MockedCricketStats;

@RestController
public class AppController {
	
	List<Cricketer>  cricketStats = MockedCricketStats.getFootballInstance();
	
	@RequestMapping("/verify")
	public String verify()
	{  
		
		return "Service running";
	}
	
	
	/*Method to print all the stored crickter stats */
	@GetMapping("/stats")
	public List<Cricketer> getCricketStats() {
		return cricketStats;	
	}
	
	
	/*Method to add a single cricketer Stat
	 * 
	 */
	@PostMapping("/addplayer")
	public List<Cricketer> addCrickter(@RequestBody Map<String,String> bodyMap) {
		String name = bodyMap.get("name");
		int matches = Integer.parseInt(bodyMap.get("matches"));
		int runs = Integer.parseInt(bodyMap.get("runs"));
		int wickets = Integer.parseInt(bodyMap.get("wickets"));
		cricketStats.add(new Cricketer(name, matches, runs, wickets));
		return cricketStats;
	} 
	
	
	/*
	 * Search a player with respect to its name
	 */
	@GetMapping("/search/{name}")
	public Cricketer searchCricketer (@PathVariable String name )
	{
		/*
		 * MockedCricketStats cricketer = cricketer.search(name); return cricketer;
		 */	
		for(Cricketer crick : cricketStats)
		{
			if(crick.getName().equals(name))
			{
				return crick;
			}
				
		}
		
		return null;
		
		
		
	}
	
	
	@DeleteMapping("/delete/{name}")
	public List<Cricketer> deleteplayer(@PathVariable String name)
	{
		int searchIndex = -1;
		for(Cricketer crick : cricketStats)
		{
			if(crick.getName().equals(name))
			{
				searchIndex = cricketStats.indexOf(crick);
				break;
			}
			
		}
		
		cricketStats.remove(searchIndex);
		return cricketStats;
	}
	
	

}
