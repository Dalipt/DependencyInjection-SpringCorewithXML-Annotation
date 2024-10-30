package com.java.AmzonAssociation.main;

import com.java.AmzonAssociation.Deliveryservices.Classes.*;

/*Injecting dependent object/dependency into target class is know as dependency injection 
 * IF its done throw setter we call is setter injection
 * IF its done throw constructor is called constructor injection
 * Target class/Object -> A class were services of other class used i.e.We used Amazon class in this project
 * Dependent class/object -> A class whose service will be used in Target class
 * I.E. In this project Fedex, firstflight,BlueDart */

public class LaunchAmazon {

	public static void main(String[] args)
	{
		/*Injecting the dependent object to target class is known as depenedency Injection */
		/*Dependency injection is done throw two ways either with setter or with constructor */
		System.out.println("Welcome to Amazon Services Please select below service");
		Amazon amz = new Amazon(new BlueDart());//constructor injection
		
		/*This is first way
		FedEX fd = new FedEX();
		amz.setServices(fd);
		This is second Way
		amz.setService(new FedEX());//setter injection
		*/
		//amz.SetDeliveryServices(new BlueDart());
		Boolean status= amz.deliverProduct(4543.00);
		if(status)
		{
			System.out.println("Product delivered successfully");
		}
		else 
		{
			System.out.println("Not Delivered");
		}	
	}

}
