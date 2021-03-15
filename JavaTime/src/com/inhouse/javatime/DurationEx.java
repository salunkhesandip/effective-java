package com.inhouse.javatime;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DurationEx {

	public static void main(String[] args) {
		Duration oneHours = Duration.ofHours(1);
		System.out.println(oneHours.getSeconds() + " seconds");
		
		// ChronoUnit - A standard set of date periods units.
		Duration oneHours2 = Duration.of(1,ChronoUnit.HOURS);
		System.out.println(oneHours2.getSeconds() + " seconds");
		
		LocalDateTime oldDate = LocalDateTime.of(2021, Month.AUGUST, 31, 10, 20, 55);
        LocalDateTime newDate = LocalDateTime.of(2021, Month.NOVEMBER, 9, 10, 21, 56);

        System.out.println(oldDate);
        System.out.println(newDate);

        //count seconds between dates
        Duration duration = Duration.between(oldDate, newDate);

        System.out.println(duration.getSeconds() + " seconds");
	}

}
