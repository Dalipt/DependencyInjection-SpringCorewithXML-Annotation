package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.services.Employee;

public class MainApp {

	public static void main(String[] args)
	{
		
		
		ApplicationContext cl= new ClassPathXmlApplicationContext("springcore.xml");
		Employee emp=cl.getBean("emp1",Employee.class);
		System.out.println(emp);
		System.out.println(emp.employeeTask());
		
		Employee em2=cl.getBean("emp2",Employee.class);
		System.out.println(em2);
		System.out.println(em2.employeeTask());
		
	}
	

}
