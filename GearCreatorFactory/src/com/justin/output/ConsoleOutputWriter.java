package com.justin.output;

import com.justin.gear.Gearable;

public class ConsoleOutputWriter {
	public Gearable OutputStatsFromItem(Gearable gear){
		gear.reportStats();
		return gear;
	}
}
