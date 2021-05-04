package com.inhouse.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class BerlinClock {

	private String formattedTime;
	private static final String NEW_LINE = System.getProperty("line.separator");
	private static final String NO_TIME_ERROR = "No Time Provided.";
	private static final String INVALID_TIME_ERROR = "Invalid Time Provided.";
	private static final String NUMERIC_TIME_ERROR = "Time must be numeric.";
	
	
	public BerlinClock(String time) {
		if(time == null) throw new IllegalArgumentException(NO_TIME_ERROR);
		
		String [] times = time.split(":");
		if(times.length !=3) throw new IllegalArgumentException(INVALID_TIME_ERROR);
		
		int hours, minutes, seconds = 0;
		
		try {
			hours = Integer.parseInt(times[0]);
			minutes = Integer.parseInt(times[1]);
			seconds = Integer.parseInt(times[2]);
		} catch(NumberFormatException e) {
			throw new IllegalArgumentException(NUMERIC_TIME_ERROR);
		}
		
		if(hours < 0 || hours > 23) throw new IllegalArgumentException("Hours out of bound");
		if(minutes < 0 || minutes > 59) throw new IllegalArgumentException("Minutes out of bound");
		if(seconds < 0 || seconds > 59) throw new IllegalArgumentException("Seconds out of bound");
		this.formattedTime = processTime(hours, minutes, seconds);
	}


	private String processTime(int hours, int minutes, int seconds) {
		String line1 = (seconds % 2 == 0) ? "0" : "Y";
		String line2 = rowString(hours / 5, 4, "R");
		String line3 = rowString(hours % 5, 4, "R");
		String line4 = rowString(minutes / 5, 11, "Y").replaceAll("YYY", "YYR"); // 15,30,45 denotes by Red
		String line5 = rowString(minutes % 5, 4, "Y");
		
		return String.join(NEW_LINE,Arrays.asList(line1,line2,line3,line4,line5));
	}


	private String rowString(int litLights, int lightsInRow, String lampType) {
		int unlitLights = lightsInRow - litLights;
		String lit = String.join("", Collections.nCopies(litLights, lampType));
		String unlit = String.join("", Collections.nCopies(unlitLights, "0"));
		return lit + unlit;
	}

	private void printClock() {
		System.out.println(this.formattedTime);
	}

	public static void main(String[] args) {
		BerlinClock clock = new BerlinClock("10:20:30");
		clock.printClock();
	}

}
