package com.justin.gear;

public class Ring implements Gearable{

	@Override
	public void reportStats() {
		System.out.println("this ring has: +999int, -100str, +20dex");
	}
}
