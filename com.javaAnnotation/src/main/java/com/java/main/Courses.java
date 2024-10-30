package com.java.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.java.services.CourseInterface;
@Component
public class Courses 
{
	//@Autowired
	//@Qualifier("java")//Here we not giving exact class name using spring CamelCase login internally 
	private CourseInterface course;
	
	//@Autowired
	//@Qualifier("spring")
	public void setCourse(CourseInterface course) 
	{
		System.out.println("Setter Injection");
		this.course = course;
	}
	@Autowired
	//@Qualifier("spring")//Constructor doesn't allowed in Annotation because its not in Target
	public Courses(@Qualifier("spring") CourseInterface course) {
		super();
		this.course = course;
	}
	public Boolean Courses1(double amount)
	{
		System.out.println("Constructure Injection");
		return course.setCourseService(amount);
	}

	public Courses() 
	{
		super();
		System.out.println("Courses constructor");
	}
}
