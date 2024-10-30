package com.java.AmzonAssociation.main;
import com.java.AmzonAssociation.services.*;
public class Amazon 
{
	private IDeliveryServices services;

	public Amazon (IDeliveryServices services) 
	{
		this.services = services;
	}

	public void SetDeliveryServices(IDeliveryServices services)
	{
		this.services= services;
	}
	
	public Boolean deliverProduct(Double amount)
	{	
		/* Amazon and FedEX is tightly couple if we delete done changes in FedEX it will effect Amazon*/
		//FedEX fd = new FedEX();
		/*Amazon is loosly coupled now because no object no reference*/
		return services.deliveryServices(amount);
	}
}
