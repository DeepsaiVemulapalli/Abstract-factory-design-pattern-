package com.cooking.AbstractFactory;

import com.cooking.beans.OutDoorCooking;
import com.cooking.beans.Smokers;

public class SmokerFactory implements CookingAbstractFactory {
	private String price;
	private String brand;
	private String size;
	
	
	public SmokerFactory(String price, String brand, String size) {
		this.price = price;
		this.brand = brand;
		this.size = size;
	}


	@Override
	public OutDoorCooking createCooking() {
		// TODO Auto-generated method stub
		return new Smokers(this.price, this.brand, this.size);
	}

}
