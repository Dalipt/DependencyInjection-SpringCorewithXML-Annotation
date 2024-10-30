package com.java.services;

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
