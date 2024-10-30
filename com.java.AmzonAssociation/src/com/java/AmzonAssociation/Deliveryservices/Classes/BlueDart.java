package com.java.AmzonAssociation.Deliveryservices.Classes;

import com.java.AmzonAssociation.services.IDeliveryServices;

public class BlueDart implements IDeliveryServices
{
	public Boolean deliveryServices(Double amount)
	{
		System.out.println("Product is delivered by BlueDart and amount paid :" + amount );
		return true;
	}

}
