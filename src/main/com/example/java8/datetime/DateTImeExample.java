package main.com.example.java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import main.com.example.UIUtils;

public class DateTImeExample {

	public static void main(String ...arg) {
		
		UIUtils.addSection("Working with LocalDate");
		System.out.println("LocalDate.now() - "+LocalDate.now());
		System.out.println("LocalDate.of() - "+LocalDate.of(2020,05,22));
		System.out.println("LocalDate.parse() - "+LocalDate.parse("2020-05-22"));
		System.out.println("Add Day - "+LocalDate.now().plusDays(1));
		System.out.println("Minus Month - "+LocalDate.now().minusMonths(1));
		System.out.println("Day of Week - "+LocalDate.now().getDayOfWeek());
		System.out.println("Day of Month - "+LocalDate.now().getDayOfMonth());
		System.out.println("Is Leap Year - "+LocalDate.now().isLeapYear());
		UIUtils.addSection("Working with LocalTime");

		System.out.println("LocalTime.now() - "+LocalTime.now());
		System.out.println("LocalTime.of() - "+LocalTime.of(6,30));
		System.out.println("LocalTime.parse() - "+LocalTime.parse("06:30"));
		System.out.println("Add Hour - "+LocalTime.now().plusHours(1));
		System.out.println("Is Before - "+LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30")));
		System.out.println("LocalTime MAX - "+LocalTime.MAX);
		System.out.println("LocalTime MIDNIGHT - "+LocalTime.MIDNIGHT);
		System.out.println("LocalTime MIN - "+LocalTime.MIN);
		
	    UIUtils.addSection("Working With LocalDateTime");
	    

		System.out.println("LocalDateTime.now() - "+LocalDateTime.now());
		System.out.println("LocalDate.of() - "+LocalDateTime.of(2020,Month.MAY,22,06,30));
		System.out.println("LocalDate.parse() - "+LocalDateTime.parse("2020-05-22T06:30:00"));
		System.out.println("Plus Days - "+LocalDateTime.now().plusDays(1));
		System.out.println("Plus Hours - "+LocalDateTime.now().plusHours(1));
		System.out.println("Get Month - "+LocalDate.now().getMonth());
		
		UIUtils.addSection("Working With Period");
		
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = LocalDate.now().plusDays(5);
		System.out.println("Days between Initial date and final date : "+Period.between(initialDate, finalDate).getDays());
	
		UIUtils.addSection("Working With Duration");
		
		LocalTime initialTime = LocalTime.now();
		LocalTime finalTime = LocalTime.now().plusSeconds(55);
		System.out.println("Seconds between initial time and final time : "+Duration.between(initialTime, finalTime).getSeconds());
	
		UIUtils.addSection("Working With Formatting");
		System.out.println("Formatted DateTime Medium : "+LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println("Formatted DateTime yyyy/MM/dd : "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
	}
}
