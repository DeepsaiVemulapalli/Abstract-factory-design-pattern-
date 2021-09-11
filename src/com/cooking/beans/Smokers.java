package com.cooking.beans;

public class Smokers implements OutDoorCooking {
    
	private String price;
	private String brand;
	private String size;
	
	
	public Smokers(String price, String brand, String size) {
		this.price = price;
		this.brand = brand;
		this.size = size;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public String toString() {
		return "Smokers [price=" + price + ", brand=" + brand + ", size=" + size + "]";
	}

}
