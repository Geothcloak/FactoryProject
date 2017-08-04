package com.justin.gear;

public class Sword implements Gearable{

	@Override
	public void reportStats() {
		System.out.println("this sword has: +0int, +1000str, +200dex");
	}

}
