package com.cooking.AbstractFactory;

import com.cooking.beans.OutDoorCooking;

public class CookingFactory {

	public static OutDoorCooking createCooking(CookingAbstractFactory obj) {
		return obj.createCooking();
	}
}
