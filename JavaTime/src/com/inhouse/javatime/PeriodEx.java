package com.inhouse.javatime;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodEx {

	public static void main(String[] args) {
		Period tenDays = Period.ofDays(10);
		System.out.println("Days : " +tenDays.getDays());
		
		Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
	    System.out.println("Years : " + oneYearTwoMonthsThreeDays.getYears());   //1
        System.out.println("Months : " + oneYearTwoMonthsThreeDays.getMonths());  //2
        System.out.println("Days : "+ oneYearTwoMonthsThreeDays.getDays());    //3
        
        System.out.println("\n--- Period.between --- ");
        LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
        LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);

        System.out.println(oldDate);
        System.out.println(newDate);

        // check period between dates
        Period period = Period.between(oldDate, newDate);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");

	}

}
