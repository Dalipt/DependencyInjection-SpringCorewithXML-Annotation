package com.java.AmzonAssociation.main;

import com.java.AmzonAssociation.services.*;

public class Electric 
{
	private ElectricAccessories electric;
	
	public Electric (ElectricAccessories electric) 
	{
		this.electric = electric;
	}

	public void SetElecticAccessories(ElectricAccessories electric)
	{
		this.electric= electric;
	}
	public int electricProduct(String[] electric)
	{	
		/* Amazon and FedEX is tightly couple if we delete done changes in FedEX it will effect Amazon*/
		//FedEX fd = new FedEX();
		/*Amazon is loosly coupled now because no object no reference*/
		return electric.length;
	}
}
