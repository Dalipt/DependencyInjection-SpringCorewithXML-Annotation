package com.java.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//In @Primary and @Qualifier Qualifier Injection get executed 
public class MainApp {

	public static void main(String[] args)
	{
		//Application Context 
		//Application context created all class object Agressive loading
		ApplicationContext cl= new ClassPathXmlApplicationContext("springcore.xml");
		Courses c=cl.getBean(Courses.class);
		Boolean status =c.Courses1(4500);
		if(status)
		{
			System.out.println("Course Purchaed successfully");
		}
		else
		{
			System.out.println();
		}
		
	}
	

}
