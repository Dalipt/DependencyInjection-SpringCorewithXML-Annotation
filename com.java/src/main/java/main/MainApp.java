package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		//Bean Factory
		//Lazy Loading load only required Beans not all beans in one go
		DefaultListableBeanFactory dls= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rd= new XmlBeanDefinitionReader(dls);
		rd.loadBeanDefinitions("springcore.xml");
		
		
		
		//Application Context 
		//Application context created all class object Agressive loading
		/*ApplicationContext cl= new ClassPathXmlApplicationContext("springcore.xml");
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
		*/
	}
	

}
