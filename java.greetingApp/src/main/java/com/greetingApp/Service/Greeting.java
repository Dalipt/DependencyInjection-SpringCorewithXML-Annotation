package com.greetingApp.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Greeting 
{
	@Autowired
	private LocalDateTime time;
	
	public Greeting()
	{
		System.out.println("Greeting Bean is created");
	}
	public String generateGreeting(String name)
	{
		int hour=time.getHour();
		int minutes=time.getMinute();
		if(hour<12)
			return "Good Morning:"+"Hour:"+hour+":"+"Minutes:"+minutes;
		else if(hour<16)
			return"Good Afternoon:"+hour+minutes;
		else if(hour<20)
			return"Good Evening:"+hour+minutes;
		else
			return"Good Night:"+ hour+ minutes;
	}
}
