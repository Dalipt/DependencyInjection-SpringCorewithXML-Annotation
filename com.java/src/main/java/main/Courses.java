package main;

import com.java.services.CourseInterface;

public class Courses 
{
	private CourseInterface course;
	
	public void setCourse(CourseInterface course) 
	{
		System.out.println("Setter Injection");
		this.course = course;
	}

	public Courses(CourseInterface course) {
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
