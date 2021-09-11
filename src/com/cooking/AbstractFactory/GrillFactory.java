package com.cooking.AbstractFactory;

import com.cooking.beans.GrillMachine;
import com.cooking.beans.OutDoorCooking;

public class GrillFactory implements CookingAbstractFactory {

	private String price;
	private String brand;
	private String size;
	
	
	public GrillFactory(String price, String brand, String size) {
		super();
		this.price = price;
		this.brand = brand;
		this.size = size;
	}


	@Override
	public OutDoorCooking createCooking() {
		// TODO Auto-generated method stub
		return new GrillMachine(this.price, this.brand, this.size);
	}

}
