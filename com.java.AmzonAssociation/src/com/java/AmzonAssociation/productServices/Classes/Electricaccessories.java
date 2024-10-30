package com.java.AmzonAssociation.productServices.Classes;
import java.util.ArrayList;

import com.java.AmzonAssociation.services.*;

public class Electricaccessories implements ElectricAccessories 
{

	String electric_accessories;
	
	public String electicAccessories(String electric) 
	{
		System.out.println("Please select amongst electric items");
		
		String [] items = new String[4];
		
		items[0]= "Electric_fan";
		items[1]= "home_theather";
		items[2]= "home_appliances";
		items[2]= "electric_Gyger";
		System.out.println("Total electric items are: " + items);
		items.toString();
		//items = electric;
		return electric;
	}
	
	
}
