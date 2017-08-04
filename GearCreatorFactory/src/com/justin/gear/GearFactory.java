package com.justin.gear;

public class GearFactory {
	public Gearable setGearType(String gearType){
		if (gearType.equalsIgnoreCase("SWORD")){
			return new Sword();
		}
		if (gearType.equalsIgnoreCase("RING")){
			return new Ring();
		}
		if (gearType.equalsIgnoreCase("CHEST")){
			return new Chest();
		}
		
		
		return null;
	}
}
