package com.java.AmzonAssociation.Deliveryservices.Classes;

import com.java.AmzonAssociation.services.IDeliveryServices;

public class FirstFlight implements IDeliveryServices
{
	public Boolean deliveryServices(Double amount) 
	{
		System.out.println("Product is delivered by FirstFlight and amount paid is: "+ amount);
		return true;
	}

}
