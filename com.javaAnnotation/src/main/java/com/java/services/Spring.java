package com.java.services;

import org.springframework.stereotype.Service;

@Service
public class Spring implements CourseInterface
{
	public Spring()
	{
		System.out.println("Spring class constructore");
	}
	@Override
	public Boolean setCourseService(Double amount) {
		System.out.println("Spring course purchaed and amount paid is:"+ amount);
		return true;
	}

}