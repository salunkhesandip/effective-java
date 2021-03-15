package com.inhouse.javatime;
import java.time.Duration;
import java.time.Instant;

public class InstantEx {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println("GMT date time now : " + now);
		
		long unixTime = now.getEpochSecond();
		System.out.println("Unix time / epoch time : " + unixTime);
		
		long toEpochMillis = now.toEpochMilli();
		System.out.println("toEpochMillis :" + toEpochMillis);
		
		Instant firstInstant = Instant.ofEpochSecond(1614010472);
		Instant secondInstant = Instant.ofEpochSecond(1615010472);
		
		Duration between = Duration.between(firstInstant, secondInstant);
		System.out.println("between : " + between);
		
		long seconds = between.getSeconds();
		System.out.println("seconds : " + seconds);
	}

}
