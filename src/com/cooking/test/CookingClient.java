package com.cooking.test;

import com.cooking.AbstractFactory.CookingFactory;
import com.cooking.AbstractFactory.GrillFactory;
import com.cooking.AbstractFactory.SmokerFactory;
import com.cooking.beans.OutDoorCooking;

public class CookingClient {
	
	
	public static void main(String[] args) {
		
		OutDoorCooking grillmachine = CookingFactory.createCooking(new GrillFactory("4500 rupees", "Fabmania", "XXL"));
		OutDoorCooking smokerMachine = CookingFactory.createCooking(new SmokerFactory("3800 rupees", "Well Berg", "XL"));
		
		System.out.println("Grill Machine "+ grillmachine);
		System.out.println("Smoker  Machine "+ smokerMachine);
	}

}
