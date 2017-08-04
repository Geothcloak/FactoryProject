package com.justin.input;

import java.util.Scanner;

public class ConsoleInputReader {
	
	public String promptUserForInput(){
		Scanner reader = new Scanner(System.in);
		System.out.println("What kind of gear? sword, ring, or chest?");
		String gearType = reader.nextLine();
		reader.close();
		return gearType;
	}
}
