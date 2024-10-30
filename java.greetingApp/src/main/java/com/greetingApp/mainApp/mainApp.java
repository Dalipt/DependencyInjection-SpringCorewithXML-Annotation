package com.greetingApp.mainApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import com.greetingApp.Service.Greeting;
import com.greetingApp.config.ConfigClass;
//using this approach if Config class changes all project need to recompile
public class mainApp {

	public static void main(String[] args) 
	{

		ApplicationContext cgd=new AnnotationConfigApplicationContext(ConfigClass.class);
		Greeting ad=cgd.getBean(Greeting.class);
		System.out.println(ad.generateGreeting("Hey Friends"));
	}

}
