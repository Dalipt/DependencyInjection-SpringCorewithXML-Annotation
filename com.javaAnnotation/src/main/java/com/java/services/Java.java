package com.java.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Java implements CourseInterface
{
	public Java()
	{
		System.out.println("Java class constructore");
	}
	
	
	public Boolean setCourseService(Double amount)
	{
		System.out.println("Java course purchaed and amount paid is:"+ amount);
		return true;
	}

}
