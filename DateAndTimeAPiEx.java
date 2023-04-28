package com.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateAndTimeAPiEx {
	public static void main(String[] args) {
//		Date date1 = new Date();
//		System.out.println(date1);
//
		LocalDate date = LocalDate.now();// immuttable 2022-07-15
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getYear());
		date.plusDays(10);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.isLeapYear());

		LocalDate date1 = LocalDate.of(1992, 03, 12);
		System.out.println(date1.isLeapYear());

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDate cdate = LocalDate.now();// systemdate
		LocalDate bDate = LocalDate.of(1993, 11, 10);
		Period p = Period.between(bDate, date);
		System.out.printf("ur age %d years,%d months,%d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		ZoneId zones=ZoneId.systemDefault();
		System.out.println(zones);
		
		
		ZoneId zone = ZoneId.of("Australia/Lindeman");
		ZonedDateTime zt = ZonedDateTime.now(zone);
		System.out.println(zt);
		Set<String> zone1 = ZoneId.getAvailableZoneIds();
		
		for(String id:zone1)
		{
			System.out.println(id);
		}
		
	}
}
