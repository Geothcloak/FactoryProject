package com.justin.gear;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class GearFactoryTest {
	GearFactory gearFactory;
	@Before
	public void init(){
		gearFactory = new GearFactory();
		
	}
	@Test
	public void CanSwordType(){
		Gearable swordTest = gearFactory.setGearType("sword");
		Assert.assertTrue(swordTest instanceof Sword);
		
	}
	@Test
	public void CanRingType(){
		Gearable swordTest = gearFactory.setGearType("ring");
		Assert.assertTrue(swordTest instanceof Ring);
		
	}
	@Test
	public void CanChestType(){
		Gearable swordTest = gearFactory.setGearType("chest");
		Assert.assertTrue(swordTest instanceof Chest);
		
	}
}
